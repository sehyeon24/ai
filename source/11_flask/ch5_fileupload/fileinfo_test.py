# 특정 폴더(upload/)안의 파일들 정보 출력
import os
import datetime

def stamp2real(stamp):
    ' stamp(1970.1.1~특정시점까지의 초)를 입력받아 특정시점을 가독성 높은 문자로 return '
    return datetime.datetime.fromtimestamp(stamp)
# print(stamp2real(1736736114.888066))

def info(filename):
    '파일 생성시간, 파일 마지막 수정시간, 파일 마지막 액세스시간, 파일 사이즈를 return'
    ctime = os.path.getctime(filename)
    mtime = os.path.getmtime(filename)
    atime = os.path.getatime(filename)
    size  = os.path.getsize(filename)
    return ctime, mtime, atime, size

filelist = os.listdir('./upload/')
# print(filelist)

for filename in filelist:
    ctime, mtime, atime, size = info('./upload/' + filename)
    print('파일명 : ', filename)
    print('파일 생성 시간 : ', stamp2real(ctime))
    print('파일 수정 시간 : ', stamp2real(mtime))
    print('파일 접근 시간 : ', stamp2real(atime))
    if size <= 1000000:  # size(byte단위)가 1MG 이하
        print('{:.2f}KB'.format(size/1024))
    else:  # 1MG 이상
        print('{:.2f}MB'.format(size/(1024*1024)))  # 1024*1024=MB
    # print('파일명 : ', filename)
    # print('파일 생성 시간 : ', os.path.getctime('./upload/' + filename))  # 1970.1.1~ 의 초
    # print('파일 마지막 수정 시간 : ', os.path.getmtime('./upload/' + filename))  # 1970.1.1~ 의 초