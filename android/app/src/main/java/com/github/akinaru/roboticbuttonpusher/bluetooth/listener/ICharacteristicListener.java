/**********************************************************************************
 * This file is part of Button Pusher.                                             *
 * <p/>                                                                            *
 * Copyright (C) 2016  Bertrand Martel                                             *
 * <p/>                                                                            *
 * Button Pusher is free software: you can redistribute it and/or modify           *
 * it under the terms of the GNU General Public License as published by            *
 * the Free Software Foundation, either version 3 of the License, or               *
 * (at your option) any later version.                                             *
 * <p/>                                                                            *
 * Button Pusher is distributed in the hope that it will be useful,                *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of                  *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                   *
 * GNU General Public License for more details.                                    *
 * <p/>                                                                            *
 * You should have received a copy of the GNU General Public License               *
 * along with Button Pusher. If not, see <http://www.gnu.org/licenses/>.           *
 */
package com.github.akinaru.roboticbuttonpusher.bluetooth.listener;

import android.bluetooth.BluetoothGattCharacteristic;

/**
 * Characteritic listener template to be used in device implementation
 *
 * @author Bertrand Martel
 */
public interface ICharacteristicListener {

    /**
     * called when onCharacteristicRead() gatt callback has been received
     *
     * @param charac characteristic that has been read
     */
    void onCharacteristicReadReceived(BluetoothGattCharacteristic charac);

    /**
     * called chane onCharacteristicChange() gatt callback has been received
     *
     * @param charac characteristic whose value has changed
     */
    void onCharacteristicChangeReceived(BluetoothGattCharacteristic charac);

    /**
     * called when onCharacteristicWrite() gatt callback is received
     *
     * @param charac
     */
    void onCharacteristicWriteReceived(BluetoothGattCharacteristic charac);
}
