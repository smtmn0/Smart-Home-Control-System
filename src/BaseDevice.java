public abstract class BaseDevice implements SmartDevice {
    protected String name;
    protected boolean isOn = false;

    public BaseDevice(String name) { this.name = name; }
    public String getName() { return name; }
    public String getStatus() { return isOn ? "on" : "off"; }
}
