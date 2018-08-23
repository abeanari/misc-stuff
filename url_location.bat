@echo off
CLS

:MENU
::CLS ::uncomment if you want to clear results
set /P input= Type ip address or press q to EXIT: 
if %input%==q goto QUIT
curl ipinfo.io/%input%
echo:
echo:
goto MENU

:QUIT
echo Goodbye!
PAUSE>NUL
EXIT
