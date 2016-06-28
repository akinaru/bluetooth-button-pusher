# Bluetooth Button Pusher

[![Build Status](https://travis-ci.org/akinaru/bluetooth-button-pusher.svg?branch=master)](https://travis-ci.org/akinaru/bluetooth-button-pusher)
[![License](http://badge.kloud51.com/pypi/l/html2text.svg)](LICENSE.md)

[![Download Bluetooth Button Pusher from Google Play](http://www.android.com/images/brand/android_app_on_play_large.png)](https://play.google.com/store/apps/details?id=com.github.akinaru.roboticbuttonpusher)

Mechanical switch-button-pusher securely controlled via Bluetooth LE with RFduino module/LCD panel & via Android smartphone

![screenshot](img/set.jpg)

## Project structure

* <b>/firmware</b> - microcontroller code written for RFduino
* <b>/android</b> - android application to control Bluetooth Button Pusher
* <b>/hardware</b> - wiring diagram, schematics & BOM

## Build

### Get source code

```
git clone git@github.com:akinaru/bluetooth-button-pusher.git
cd bluetooth-button-pusher
git submodule update --init --recursive
```

### Build Firmware

```
cd firmware
make
```

### Build Android App

```
cd android
./gradlew build
```

## Application screenshot



## External library

### Firmware

* rfduino software : https://github.com/RFduino/RFduino
* LiquidCrystal arduino library : https://github.com/arduino-libraries/LiquidCrystal
* rfduino-makefile : https://github.com/akinaru/rfduino-makefile
* AES library by Brian Gladman

### Android application

* smart Android dot progress bar : https://github.com/silvestrpredko/DotProgressBarExample
* AES library by Brian Gladman
* appcompat-v7, design & recyclerview-v7

## License

```
Copyright (C) 2016  Bertrand Martel

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 3
of the License, or (at your option) any later version.

Bluetooth Button Pusher is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Bluetooth Button Pusher.  If not, see <http://www.gnu.org/licenses/>.
```