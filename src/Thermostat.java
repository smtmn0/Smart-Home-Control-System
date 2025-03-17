public class Thermostat extends BaseDevice {
    private int temperature = 20;

    public Thermostat(String name) { super(name); }

    public void turnOn() { isOn = true; System.out.println(name + " thermostat is on"); }
    public void turnOff() { isOn = false; System.out.println(name + " thermostat is off"); }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println(name + " set to " + temp + "°C");
    }

    public String getStatus() { return super.getStatus() + " (" + temperature + "°C)"; }
}
