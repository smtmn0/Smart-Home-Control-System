import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartRoom> rooms = new ArrayList<>();

    public void addRoom(SmartRoom room) { rooms.add(room); }

    public void turnAllOn() {
        System.out.println("Turning on all devices...");
        for (SmartRoom room : rooms) {
            room.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Turning off all devices...");
        for (SmartRoom room : rooms) {
            room.turnOff();
        }
    }

    public void showSystemStatus() {
        for (SmartRoom room : rooms) {
            System.out.println(room.getStatus());
        }
    }
}
