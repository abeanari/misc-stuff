@echo off
set /P input= Type in ip: 
curl ipinfo.io/%input%
pause
