@echo off
rem Build script for appveyor

rem ----------------------------------------------------------------
echo vc_make_appveyor.bat - Auriga makefile for Visual C++

rem ----------------------------------------------------------------
rem Defined packet versions
rem 2015-05-13aRagexe: 20150513
rem 2014-10-22bRagexe: 20141022
rem 2014-03-05bRagexe: 20140305
rem 2014-01-15eRagexe: 20140115
rem 2013-12-23cRagexe: 20131223
rem 2013-07-31aRagexe: 20130731
rem 2012-09-25aRagexeRE: 20120925
rem 2012-06-18aRagexeRE: 20120618
rem 2012-04-10aRagexeRE: 20120410
rem 2012-04-04aRagexeRE: 20120404
rem 2012-03-28aRagexeRE: 20120328
rem 2012-03-07aRagexeRE: 20120307
rem 2012-02-22aRagexeRE: 20120222
rem 2012-02-01aRagexeRE: 20120201
rem 2011-11-02aRagexeRE: 20111102
rem 2011-10-25aRagexeRE: 20111025
rem 2011-09-28aRagexeRE: 20110928
rem 2011-07-19aRagexeRE: 20110719
rem 2011-03-09aRagexeRE: 20110309
rem 2011-01-11aRagexeRE: 20110111
rem 2010-10-20aRagexeRE: 20101020
rem 2010-08-03aRagexeRE: 20100803
rem 2010-07-28aRagexeRE: 20100728
rem 2010-07-21aRagexeRE: 20100721
rem 2010-06-29aRagexeRE: 20100629
rem 2010-06-15aRagexeRE: 20100615
rem 2010-04-14aRagexeRE: 20100414
rem 2010-02-23aRagexeRE: 20100223
rem 2009-12-08aRagexeRE: 20091208
rem 2009-11-18cRagexeRE: 20091118
rem 2009-11-04aRagexeRE: 20091104
rem 2009-07-15aRagexeRE: 20090715
rem 2009-06-17aRagexeRE: 20090617
rem 2009-06-03aRagexeRE: 20090603
rem 2008-11-26cSakexe or 2008-11-26aRagexeRE: 20081126
rem 2008-11-13aSakexe: 20081113
rem 2008-08-20aSakexe: 20080820
rem 2008-05-28aSakexe or 2008-08-27aRagexeRE: 20080827
rem 2008-01-02aSakexe: 20080102
rem 2007-11-28aSakexe: 20071128
rem 2007-11-06aSakexe: 20071106
rem 2007-09-04aSakexe: 20070904
rem 2007-07-11aSakexe: 20070711
rem 2007-05-21aSakexe: 20070521
rem 2007-02-12aSakexe: 20070212
rem 2006-10-23aSakexe: 20061023
set __PACKETDEF__=/D "PACKETVER=%PACKETVER%" /D "NEW_006b"

rem ----------------------------------------------------------------
rem Build path settings

rem ---- VC++ 2015 64bit�R���p�C�� �̐ݒ�
if not "%APPVEYOR_BUILD_WORKER_IMAGE%"=="Visual Studio 2015" goto SKIPVSVER14
set PATH=C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\bin\x86_amd64;C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\bin;C:\Program Files\Windows Kits\8.1\bin;C:\Program Files (x86)\Microsoft Visual Studio 14.0\Common7\Tools\bin;C:\Program Files (x86)\Microsoft Visual Studio 14.0\Common7\Tools;C:\Program Files (x86)\Microsoft Visual Studio 14.0\Common7\IDE;%PATH%
set INCLUDE=C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\include;C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\altmfc\include;C:\Program Files (x86)\Windows Kits\8.1\Include\um;C:\Program Files (x86)\Windows Kits\8.1\Include\shared;C:\Program Files (x86)\Windows Kits\10\Include\10.0.10150.0\ucrt;%INCLUDE%
set LIB=C:\Program Files (x86)\Microsoft Visual Studio 14.0\VC\lib\amd64;C:\Program Files (x86)\Windows Kits\8.1\Lib\winv6.3\um\x64;C:\Program Files (x86)\Microsoft Visual Studio 14.0\SDK\v3.5\lib\amd64;C:\Program Files (x86)\Windows Kits\10\Lib\10.0.10150.0\ucrt\x64;%LIB%
set __VCVER__=14
set __BITTYPE__=x64
set __MULTIBUILD__=/MP
:SKIPVSVER14

rem ---- VC++ 2017 64bit�R���p�C�� �̐ݒ�
if not "%APPVEYOR_BUILD_WORKER_IMAGE%"=="Visual Studio 2017" goto SKIPVSVER2017
set PATH=C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Tools\MSVC\14.11.25503\bin\HostX64\x64;C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Tools\MSVC\14.11.25503\bin;C:\Program Files\Windows Kits\8.1\bin;C:\Program Files\Windows Kits\10\bin;C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Tools\MSVC\14.11.25503\bin;C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\Common7\Tools;C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\Common7\IDE;%PATH%
set INCLUDE=C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Tools\MSVC\14.11.25503\include;C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Tools\MSVC\14.11.25503\atlmfc\include;C:\Program Files (x86)\Windows Kits\8.1\Include\um;C:\Program Files (x86)\Windows Kits\8.1\Include\shared;C:\Program Files (x86)\Windows Kits\10\Include\10.0.10150.0\ucrt;C:\Program Files (x86)\Windows Kits\10\Include\10.0.10240.0\ucrt;C:\Program Files (x86)\Windows Kits\10\Li\10.0.14393.0\ucrt;%INCLUDE%
set LIB=C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Tools\MSVC\14.11.25503\lib\x64;C:\Program Files (x86)\Windows Kits\8.1\Lib\winv6.3\um\x64;C:\Program Files (x86)\Windows Kits\10\Lib\10.0.10150.0\ucrt\x64;C:\Program Files (x86)\Windows Kits\10\Lib\10.0.10240.0\ucrt\x64;C:\Program Files (x86)\Windows Kits\10\Lib\10.0.14393.0\ucrt\x64;%LIB%
set __VCVER__=2017
set __BITTYPE__=x64
set __MULTIBUILD__=/MP
:SKIPVSVER2017

rem ----------------------------------------------------------------
rem SQL �̐ݒ� / �K�v�Ȃ�R�����g�A�E�g���͂���
set INCLUDE=C:\Program Files\MySQL\MySQL Server 5.7\include;%INCLUDE%
set LIB=C:\Program Files\MySQL\MySQL Server 5.7\lib;%LIB%

rem ----------------------------------------------------------------
rem �r���h�I�v�V�����̑I��

rem �f�[�^�ۑ����@�̑I�� �F SQL �ɂ���Ȃ�R�����g�A�E�g����
rem set __TXT_MODE__=/D "TXT_ONLY"

rem �f�[�^�ۑ����@�� TXT �̎��A�W���[�i�����g���Ȃ�R�����g�A�E�g���͂���
rem set __TXT_MODE__=/D "TXT_ONLY" /D "TXT_JOURNAL"

rem �f�[�^�ۑ����@�� SQL �̎��Atxt-converter ���s�v�Ȃ�R�����g�A�E�g���͂���
rem set __TXTCONVERTER__=SKIP

rem zlib.dll���R���p�C������Ȃ�R�����g�A�E�g���͂���
set __ZLIB__=/D "LOCALZLIB"

rem login_id2 �� IP �� AUTHFIFO ���r����ꍇ�̓R�����g�A�E�g���͂���
rem set __CMP_AFL2__=/D "CMP_AUTHFIFO_LOGIN2"
rem set __CMP_AFIP__=/D "CMP_AUTHFIFO_IP"

rem httpd �����S�ɖ����ɂ���ꍇ�R�����g�A�E�g���͂���
set __NO_HTTPD__=/D "NO_HTTPD"

rem httpd �ŊO�� CGI ���g���ꍇ�̓R�����g�A�E�g����
set __NO_HTTPD_CGI__=/D "NO_HTTPD_CGI"

rem csvdb �̃X�N���v�g����̗��p�𖳌��ɂ���ꍇ�R�����g�A�E�g���͂���
rem set __NO_CSVDB_SCRIPT__=/D "NO_CSVDB_SCRIPT"

rem R���O�̃V�X�e�����g���ꍇ�̓R�����g�A�E�g���͂���
set __PRE_RENEWAL__=/D "PRE_RENEWAL"

rem MB ���g���ꍇ�̓R�����g�A�E�g���͂���
rem set __EXCLASS__=/D "CLASS_MB"

rem ���I��MOB�� sc_data ���m�ۂ���ꍇ�̓R�����g�A�E�g���͂���
set __DYNAMIC_STATUS_CHANGE__=/D "DYNAMIC_SC_DATA"

rem �L�����̍폜�Ƀ��[���A�h���X���g���ꍇ�̓R�����g�A�E�g���͂���
rem set __AC_MAIL__=/D "AC_MAIL"

rem �L�����̍폜�ɒa�������g���ꍇ�̓R�����g�A�E�g���͂���
rem set __AC_BIRTHDATE__=/D "AC_BIRTHDATE"

rem �X�e�[�^�X�ُ�f�[�^�̕ۑ��𖳌��ɂ���ꍇ�̓R�����g�A�E�g���͂���
rem set __NO_SCDATA_SAVING__=/D "NO_SCDATA_SAVING"

rem �^�C�}�[���L���b�V������Ȃ�R�����g�A�E�g���͂���
rem set __TIMER_CACHE__=/D "TIMER_CACHE=256"

rem ---------------------------
rem �R���p�C���I�v�V�����ݒ�

@rem CPU�œK���X�C�b�`(By Nameless)
@rem �ȉ��̗���Q�l�ɃX�C�b�`�����L�����Ă��������B
set _model_=NOOPTIMIZE

@rem �œK���Ȃ�
if "%_model_%"=="NOOPTIMIZE" set __cpu__=/c /W3 /Od /Zi

rem ----------------------------------------------------------------
rem �ŏI�I�ȃr���h�I�v�V�����𐶐�
if "%__ZLIB__%"=="" goto NOZLIB1
set __LINKZLIB__=../common/zlib/*.obj
:NOZLIB1

if "%__BITTYPE__%"=="x32" set __BITOPTION__=/D "WIN32" /D "_WIN32" /D "_WIN32_WINDOWS"
if "%__BITTYPE__%"=="x64" set __BITOPTION__=/D "WIN64" /D "_WIN64"

set __opt1__=/D "FD_SETSIZE=4096" /D "NDEBUG" /D "_CONSOLE" /D "_CRT_SECURE_NO_DEPRECATE" /D "WINDOWS" %__MULTIBUILD__% %__BITOPTION__% %__PACKETDEF__% %__TXT_MODE__% %__ZLIB__% %__CMP_AFL2__% %__CMP_AFIP__% %__NO_HTTPD__% %__NO_HTTPD_CGI__% %__NO_CSVDB_SCRIPT__% %__PRE_RENEWAL__% %__EXCLASS__% %__DYNAMIC_STATUS_CHANGE__% %__AC_MAIL__% %__AC_BIRTHDATE__% %__NO_SCDATA_SAVING__% %__TIMER_CACHE__%
set __opt2__=/DEBUG %__FIXOPT2__% user32.lib %__LINKZLIB__% ../common/lua/*.lib ../common/*.obj *.obj
set __include__=/I "../common/zlib/" /I "../common/lua/" /I "../common/"

if "%__TXT_MODE__%"=="" (set __dbmode__=sql) else (set __dbmode__=txt)

rem ----------------------------------------------------------------
rem �x���̗}��
rem   C4819 : �\���ł��Ȃ��������܂�ł��܂�
set __warning__=/wd4819

rem ----------------------------------------------------------------
rem �R���p�C���I�v�V�����̕\��

echo ��Compile Info��
echo ������������������������������������������������������������������
echo [IMAGE = %APPVEYOR_BUILD_WORKER_IMAGE%]
echo [VCVER = %__VCVER__%]
echo [BITTYPE = %__BITTYPE__%]
echo [PACKETVER = %PACKETVER%]
echo [model = %_model_%]
echo [CompileOption = %__opt1__%]
echo ������������������������������������������������������������������

rem �r���h��Ɩ{��

rem ���ʃR���|�[�l���g�̃R���p�C��
cd src\common\zlib
if "%__ZLIB__%"=="" goto NOZLIB2
echo Compiling zlib...
cl %__warning__% %__cpu__% %__opt1__% %__include__% *.c
if %ERRORLEVEL% neq 0 exit /B %ERRORLEVEL%

:NOZLIB2
echo Compiling lua...
cd ..\lua
cl %__BITOPTION__% /D "_LIB" /c *.c
del lua.obj luac.obj
lib /out:lualib.lib *.obj

echo Compiling common...
cd ..\
cl %__warning__% %__cpu__% %__opt1__% %__include__% *.c
if %ERRORLEVEL% neq 0 exit /B %ERRORLEVEL%

rem �T�[�o�[�{�̂̃r���h
echo Building login server...
cd ..\login
cl %__warning__% %__cpu__% %__opt1__% %__include__% *.c .\%__dbmode__%\*.c
link %__opt2__% /out:"../../login-server.exe"
if %ERRORLEVEL% neq 0 exit /B %ERRORLEVEL%

echo Building character server...
cd ..\char
cl %__warning__% %__cpu__% %__opt1__% %__include__% *.c .\%__dbmode__%\*.c
link %__opt2__% /out:"../../char-server.exe"
if %ERRORLEVEL% neq 0 exit /B %ERRORLEVEL%

echo Building map server...
cd ..\map
cl %__warning__% %__cpu__% %__opt1__% %__include__% *.c .\%__dbmode__%\*.c
link %__opt2__% /out:"../../map-server.exe"
if %ERRORLEVEL% neq 0 exit /B %ERRORLEVEL%

rem �K�v�Ȃ� txt-converter ���r���h
if NOT "%__TXT_MODE__%"=="" goto NOCONVERTER1
if "%__TXTCONVERTER__%"=="SKIP" goto NOCONVERTER1

echo �R���o�[�^�[�R���p�C��
cd ..\converter
cl %__warning__% %__cpu__% %__opt1__% %__include__% *.c
link %__opt2__% /out:"../../txt-converter.exe"
if %ERRORLEVEL% neq 0 exit /B %ERRORLEVEL%
:NOCONVERTER1

cd ..\..\

rem �s�K�v�ȃt�@�C�����폜
echo Cleanup build files
if "%__ZLIB__%"=="" goto NOZLIB3
del src\common\zlib\*.obj
:NOZLIB3
del src\common\lua\*.obj
del src\common\lua\*.lib
del src\common\*.obj
del src\char\*.obj
del src\login\*.obj
del src\map\*.obj
if NOT "%__TXT_MODE__%"=="" goto NOCONVERTER2
if "%__TXTCONVERTER__%"=="SKIP" goto NOCONVERTER2
del src\converter\*.obj
:NOCONVERTER2
