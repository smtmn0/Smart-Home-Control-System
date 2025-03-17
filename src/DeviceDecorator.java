public abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice device) { this.decoratedDevice = device; }

    public void turnOn() { decoratedDevice.turnOn(); }
    public void turnOff() { decoratedDevice.turnOff(); }
    public String getStatus() { return decoratedDevice.getStatus(); }
    public String getName() { return decoratedDevice.getName(); }
}
