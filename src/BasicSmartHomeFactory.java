public class BasicSmartHomeFactory implements SmartHomeFactory {
    public SmartDevice createLight(String name) { return new Light(name); }
    public SmartDevice createThermostat(String name) { return new Thermostat(name); }
}

