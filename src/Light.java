public class Light extends BaseDevice {
    public Light(String name) { super(name); }
    public void turnOn() { isOn = true; System.out.println(name + " light is on"); }
    public void turnOff() { isOn = false; System.out.println(name + " light is off"); }
}

