package com.comviva.fileHandling;

import java.io.Serializable;

public class Devices implements Serializable
{
	private int deviceId;
	private String deviceName;
	private double devicePrice;
	public Devices(int deviceId, String deviceName, double devicePrice) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.devicePrice = devicePrice;
	}
	@Override
	public String toString() {
		return "Devices [deviceId=" + deviceId + ", deviceName=" + deviceName + ", devicePrice=" + devicePrice + "]";
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public double getDevicePrice() {
		return devicePrice;
	}
	public void setDevicePrice(double devicePrice) {
		this.devicePrice = devicePrice;
	}
}
