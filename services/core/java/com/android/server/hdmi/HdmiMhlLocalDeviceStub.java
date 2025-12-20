package com.android.server.hdmi;
import android.hardware.hdmi.IHdmiControlCallback;
/**
 * Stub class that models a logical mhl device hosted in this system.
 */
final class HdmiMhlLocalDeviceStub {
    private final HdmiControlService mService;
    private final int mPortId;
    protected HdmiMhlLocalDeviceStub(HdmiControlService service, int portId) {
        mService = service;
        mPortId = portId;
    }
    void onDeviceRemoved() {
    }
    void setBusMode(int cbusmode) {
    }
    void onBusOvercurrentDetected(boolean on) {
    }
    void setDeviceStatusChange(int adopterId, int deviceId) {
    }
    int getPortId() {
        return mPortId;
    }
    void turnOn(IHdmiControlCallback callback) {
    }
    void sendKeyEvent(int keycode, boolean isPressed) {
    }
}
