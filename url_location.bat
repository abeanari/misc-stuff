@echo off
CLS

:MENU
::CLS ::uncomment if you want to clear results
echo Your IP address is:
curl https://api.ipify.org
echo:
set /P input= Type IP address or press q to EXIT: 
if %input%==q goto QUIT
curl ipinfo.io/%input%
echo:
echo:
goto MENU

:QUIT
echo Goodbye!
PAUSE>NUL
EXIT
