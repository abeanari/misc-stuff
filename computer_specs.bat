@echo off
Echo This computer systems specifications:
echo: 

echo ===Computer===
wmic computersystem get Manufacturer, model

echo ===CPU===
wmic cpu get Name

echo ===GPU===
wmic path win32_VideoController get Name, DriverVersion

echo ===Memory===
wmic memphysical get Manufacturer, Model, SerialNumber, MaxCapacity

echo ===DiskDrives===
wmic diskdrive get Name, Manufacturer, Model, InterfaceType, MediaType

echo ===BIOS===
wmic BIOS Get Manufacturer,Name,Version, serialnumber

echo ===Window Product Key===
wmic path softwarelicensingservice get OA3xOriginalProductKey

pause