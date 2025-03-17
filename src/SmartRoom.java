import java.util.ArrayList;
import java.util.List;

public class SmartRoom implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public SmartRoom(String name) { this.name = name; }
    public void addDevice(SmartDevice device) { devices.add(device); }

    public void turnOn() {
        System.out.println("Turning on all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnOff() {
        System.out.println("Turning off all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public String getStatus() {
        StringBuilder status = new StringBuilder("Status of " + name + ":\n");
        for (SmartDevice device : devices) {
            status.append(device.getName()).append(": ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }

    public String getName() { return name; }
}
