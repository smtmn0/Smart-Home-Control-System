import java.time.LocalTime;

public class ScheduledDecorator extends DeviceDecorator {
    private LocalTime onTime;
    private LocalTime offTime;

    public ScheduledDecorator(SmartDevice device, LocalTime on, LocalTime off) {
        super(device);
        this.onTime = on;
        this.offTime = off;
    }

    public void checkSchedule() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(onTime) && now.isBefore(offTime)) {
            turnOn();
        } else {
            turnOff();
        }
    }
}
