/**********************************************************************************
 * This file is part of Pusher.                                                    *
 * <p/>                                                                            *
 * Copyright (C) 2016  Bertrand Martel                                             *
 * <p/>                                                                            *
 * Pusher is free software: you can redistribute it and/or modify                  *
 * it under the terms of the GNU General Public License as published by            *
 * the Free Software Foundation, either version 3 of the License, or               *
 * (at your option) any later version.                                             *
 * <p/>                                                                            *
 * Pusher is distributed in the hope that it will be useful,                       *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of                  *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                   *
 * GNU General Public License for more details.                                    *
 * <p/>                                                                            *
 * You should have received a copy of the GNU General Public License               *
 * along with Pusher. If not, see <http://www.gnu.org/licenses/>.                  *
 */
package com.github.akinaru.roboticbuttonpusher.bluetooth;

import android.bluetooth.BluetoothGatt;

import com.github.akinaru.roboticbuttonpusher.bluetooth.connection.IBluetoothDeviceConn;
import com.github.akinaru.roboticbuttonpusher.bluetooth.listener.IPushListener;
import com.github.akinaru.roboticbuttonpusher.service.BtPusherService;
import com.github.akinaru.roboticbuttonpusher.utils.ManualResetEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;

/**
 * Generic interface for bluetooth custom manager
 *
 * @author Bertrand Martel
 */
public interface IBluetoothCustomManager {

    ManualResetEvent getEventManager();

    void broadcastUpdate(String action);

    void broadcastUpdateStringList(String action, ArrayList<String> strList);

    void writeCharacteristic(String characUid, byte[] value, BluetoothGatt gatt, IPushListener listener);

    void readCharacteristic(String characUid, BluetoothGatt gatt);

    void writeDescriptor(String descriptorUid, BluetoothGatt gatt, byte[] value, String serviceUid, String characUid);

    HashMap<String, IBluetoothDeviceConn> getConnectionList();

    HashMap<String, ScheduledFuture<?>> getWaitingMap();

    BtPusherService getService();
}
