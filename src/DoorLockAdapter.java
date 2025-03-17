public class DoorLockAdapter extends BaseDevice {
    private LegacyDoorLock lock;

    public DoorLockAdapter(LegacyDoorLock lock, String name) {
        super(name);
        this.lock = lock;
    }

    public void turnOn() { lock.lock(); isOn = true; }
    public void turnOff() { lock.unlock(); isOn = false; }
}
