import java.time.LocalTime;

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeFactory factory = new AdvancedSmartHomeFactory();

        SmartDevice light = factory.createLight("Bedroom Light");
        SmartDevice thermostat = factory.createThermostat("Living Room Thermostat");

        SmartRoom livingRoom = new SmartRoom("Living Room");
        livingRoom.addDevice(light);
        livingRoom.addDevice(thermostat);
        livingRoom.addDevice(new DoorLockAdapter(new LegacyDoorLock(), "Front Door"));

        SmartHomeController controller = new SmartHomeController();
        controller.addRoom(livingRoom);

        livingRoom.turnOn();
        ((ScheduledDecorator) light).checkSchedule();
        controller.turnAllOff();
        controller.showSystemStatus();
    }
}

