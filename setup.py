import os
import sys
import argparse
import logging
import tempfile
import requests
import shutil
import glob
import tarfile
import subprocess

logging.basicConfig(level=logging.DEBUG,
                    format='%(levelname)-8s %(message)s',
                    filename='frida-java.log',
                    filemode='w')
console = logging.StreamHandler()
formatter = logging.Formatter("%(levelname)s - %(message)s")
console.setFormatter(formatter)
console.setLevel(logging.INFO)
# add the handler to the root logger
logging.getLogger('').addHandler(console)

TEMP_DOWNLOAD_FOLDER = 'frida-java'

JNI_HEADER_LOCATION = '/usr/lib/jvm/java-8-oracle/include'
JNI_M_HEADER_LOCATION = '/usr/lib/jvm/java-8-oracle/include/linux/'
SWIG_FILE = 'frida-core.i'
SHARED_FILE = 'libfrida-core.so'
JAVA_PACKAGE_NAME = 'yd.swig'
BASE_PATH = os.path.dirname(os.path.realpath(__file__))
SRC_MAIN =  os.path.join(BASE_PATH,'src','main')
SRC_DIR =  os.path.join(SRC_MAIN,'native')
PREBUILT_DIR =  os.path.join(BASE_PATH,'build','prebuilt')
SWIG_NATIVE_FILE =  os.path.join(SRC_DIR ,'swig', 'frida-core_wrap.cxx')
FRIDA_FILE_HEADER = 'frida-core.h'
FRIDA_FILE_STATIC = 'libfrida-core.a'
COMMAND = ['build', 'test', 'clean']
MOBILE_PLATFORM = ['android', 'ios']
PLATFORM = MOBILE_PLATFORM  + ['linux', 'macos', 'windows', 'all']
MOBILE_ARCH = ['arm', 'arm64']
ARCH = MOBILE_ARCH + ['x86', 'x86_64', 'all']
FRIDA_RELEASE_URL = 'https://api.github.com/repos/frida/frida/releases/latest'

def _get_download_folder():
    temp_folder = tempfile.gettempdir()
    download_folder = os.path.join(temp_folder,TEMP_DOWNLOAD_FOLDER)
    if not os.path.exists(download_folder):
            os.makedirs(download_folder)
    return download_folder


def _download_files(download_links):
    file_list = []
    download_folder = _get_download_folder()
    for link in download_links:
        logging.info('Downloading .. %s', link)
        baseFile = os.path.basename(link)
        local_filename = os.path.join(download_folder,baseFile)
        with requests.get(link, stream=True) as r:
                with open(local_filename, 'wb') as f:
                    shutil.copyfileobj(r.raw, f)
                    file_list.append(local_filename)

        #with requests.get(link, stream=True) as r:
        #   for chunk in r.iter_content(chunk_size=8192):
        #      if chunk: # filter out keep-alive new chunks
        #            f.write(chunk)

    return file_list




def _make_request(platforms, archs):

        download_links = []
        try:
            response = requests.get(FRIDA_RELEASE_URL)
            res_data = response.json()
        except requests.exceptions.ConnectionError as e:
            logging.error('Sorry cannot download latest frida-devkit release please check your internet connection.')
            logging.warning('Will fall back to previous cached files, if any.')
            return False

        assets = res_data["assets"]
        for asset in assets:
           file_name, platform_name, arch_name = _get_path_platform_arch(asset['browser_download_url'])

           if  'frida-core-devkit'  in file_name and platform_name in platforms and arch_name in archs:
               download_links.append(asset['browser_download_url'])

        if not download_links:
            logging.warning('Sorry cannot find any frida devkit latest release will fall back to cache if any')
            return
        return _download_files(download_links)

def _get_path_platform_arch(file_path):
    baseFile = os.path.basename(file_path)
    base_fl_spl = baseFile.rsplit('-',2)
    file_name = base_fl_spl[0]
    platform = base_fl_spl[1]
    arch = base_fl_spl[2].split('.')[0]
    return (file_name, platform, arch)

def _extract_file(file_list):
    extracted_file = []
    for fl in file_list:
        data = {}
        with tarfile.open(fl)    as f:
            _, platform_name, arch_name = _get_path_platform_arch(fl)
            folder_path = os.path.join(SRC_DIR,platform_name,arch_name)
            os.makedirs(folder_path, exist_ok=True)
            print(fl)
            def is_within_directory(directory, target):
                
                abs_directory = os.path.abspath(directory)
                abs_target = os.path.abspath(target)
            
                prefix = os.path.commonprefix([abs_directory, abs_target])
                
                return prefix == abs_directory
            
            def safe_extract(tar, path=".", members=None, *, numeric_owner=False):
            
                for member in tar.getmembers():
                    member_path = os.path.join(path, member.name)
                    if not is_within_directory(path, member_path):
                        raise Exception("Attempted Path Traversal in Tar File")
            
                tar.extractall(path, members, numeric_owner=numeric_owner) 
                
            
            safe_extract(f, folder_path)
            header_path = os.path.join(folder_path,FRIDA_FILE_HEADER)
            static_path = os.path.join(folder_path,FRIDA_FILE_STATIC)
            data['header_file'] = header_path
            data['platform'] = platform_name
            data['arch'] = arch_name
            data['static_file'] = static_path
            data['folder'] = folder_path
            extracted_file.append(data)
    return extracted_file


def download_latest_frida_core(platforms, archs):
    """Pull the latest frida core devkit files according to the specified
        platform and arch from frida core github release page
        frida-core-devkit-<latest>.<latest>.<latest>-<platform>-<arch>.tar.xz

        https://github.com/frida/frida/releases
        or use previous cached files
    """
    if not platforms or not archs:
        return
    file_list = []
    logging.info('Checking cached frida core devkit file for {platform} arch - {arch}'.format(platform=platforms, arch=archs))
    download_folder = _get_download_folder()
    file_path_ext = os.path.join(download_folder, '*.xz')
    for old_file in glob.glob(file_path_ext):
        file_name, platform_name, arch_name = _get_path_platform_arch(old_file)
        if 'frida-core-devkit'  in file_name and platform_name in platforms and arch_name in archs:
            file_list.append(old_file)
            download_platforms.remove(platform_name)
            download_archs.remove(arch_name)

    if download_platforms and download_archs:
        logging.info('Downloading latest frida core devkit file for {platform} arch - {arch}'.format(platform=",".join(download_platforms), arch=",".join( download_archs)))
        download_file_list = _make_request(download_platforms, download_archs)
        file_list.extend(download_file_list)
    return _extract_file(file_list)




def _get_platforms_arch(platform, arch):
    file_list = []
    if platform == 'all':
        platforms = PLATFORM[:]
    else:
        platforms = [platform]
    if arch == 'all':
        if platform not in  MOBILE_PLATFORM:
            archs = set(MOBILE_ARCH)  - set(ARCH)
            archs = list(archs)
        else:
            archs = ARCH
    else:
        archs = [arch]

    return (platforms, archs)


def run_swig_command(source_files):
    swig_oupt_dir =   os.path.join(SRC_MAIN,'java', 'yd', 'swig')
 
    for files in source_files:
        header_location = files['folder']
        include_header_str = '-I%s'%(header_location)
        run_command = ['swig', '-java', '-c++', '-package', JAVA_PACKAGE_NAME, include_header_str, '-outdir', swig_oupt_dir,'-o', SWIG_NATIVE_FILE, SWIG_FILE  ]
        print (' '.join(run_command))
        p = subprocess.Popen(run_command,  stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
        for line in iter(p.stdout.readline, b''):  # replace '' with b'' for Python 3

                sys.stdout.write(line.decode('utf8'))
        retval = p.wait()
        if retval != 0:
            print('Cannot run swig make sure swig is installed ')
            sys.exit(0)
        logging.info('Now making object file for share library ! ')
        jni_location =  '-I%s'%(JNI_HEADER_LOCATION)
        plat_jni_location = '-I%s'%(JNI_M_HEADER_LOCATION)
        object_output_location = os.path.join(BASE_PATH,'build','lib','frida-core_wrap.o')
        compile_command = ['g++','-fpic','-c',SWIG_NATIVE_FILE, jni_location, plat_jni_location, include_header_str,'-o',object_output_location]
        p = subprocess.Popen(compile_command,  stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
        for line in iter(p.stdout.readline, b''):  # replace '' with b'' for Python 3

                sys.stdout.write(line.decode('utf8'))
        retval = p.wait()
        if retval != 0:
            print('Cannot run g++ make sure g++ is installed and all java header files are specified ')
            sys.exit(0)
        logging.info('Now building shared library.. ')
        static_lib_file = files['static_file']

        lib_output_location = os.path.join(PREBUILT_DIR,files['platform'],files['arch'])
        os.makedirs(lib_output_location, exist_ok=True)
        lib_output_file  = os.path.join(lib_output_location,SHARED_FILE)
        shared_command = ['g++','-fPIC', object_output_location, static_lib_file , '-shared', '-o',lib_output_file]
        print (shared_command)

        p = subprocess.Popen(shared_command,  stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
        for line in iter(p.stdout.readline, b''):  # replace '' with b'' for Python 3

            sys.stdout.write(line.decode('utf8'))
        retval = p.wait()
        if retval != 0:
            print('Cannot build shared library please check errors  ')
            sys.exit(0)
        logging.info('Library built successfuly ')








if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument("action", choices=COMMAND, help="Select action to perform. ")
    parser.add_argument("platform", choices=PLATFORM,  help="Select the required platform")
    parser.add_argument("arch", choices=ARCH, help="Select the required architecture")
    args = parser.parse_args()
    if args.platform not in MOBILE_PLATFORM and args.arch in MOBILE_ARCH:
        print('Sorry you can not select a mobile architecture for a non-mobile platform.')
        sys.exit(0)

    platforms, archs = _get_platforms_arch(args.platform, args.arch)
    download_platforms = platforms[:]
    download_archs = archs[:]
    source_files = []
    for plat in platforms:
        for arch in archs:
            data = {}
            folder = os.path.join(SRC_DIR,plat,arch)
            header_path = os.path.join(SRC_DIR,plat,arch,FRIDA_FILE_HEADER)
            static_path = os.path.join(SRC_DIR,plat,arch,FRIDA_FILE_STATIC)
            if os.path.isfile(header_path) and  os.path.isfile(static_path):
                 download_platforms.remove(plat)
                 download_archs.remove(arch)
                 data['header_file'] = header_path
                 data['static_file'] = static_path
                 data['folder'] = folder
                 data['platform'] = plat
                 data['arch'] = arch
                 source_files.append(data)

    download_list = download_latest_frida_core(download_platforms, download_archs)
    print(download_list)
    if download_list:
        source_files.extend(download_list)
    run_swig_command(source_files)