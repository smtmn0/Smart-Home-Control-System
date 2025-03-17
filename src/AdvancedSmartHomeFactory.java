import java.time.LocalTime;

public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    public SmartDevice createLight(String name) {
        return new ScheduledDecorator(new Light(name), LocalTime.of(18,0), LocalTime.of(23,0));
    }

    public SmartDevice createThermostat(String name) {
        return new Thermostat(name);
    }
}
