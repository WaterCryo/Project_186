// Aggregate Object

public class Room {

    private String roomName;
    private int floorLevel;
    private double roomArea;

    // Default
    public Room() {
        roomName = "Default Room";
        floorLevel = 1;
        roomArea = 0.0;
    }

    // Normal
    public Room(String name, int level, double area) {
        roomName = name;
        floorLevel = level;
        roomArea = area;
    }

    // Mutators
    public void setRoom(String name, int level, double area) {
        roomName = name;
        floorLevel = level;
        roomArea = area;
    }

    public void setRoomName(String name) {
        roomName = name;
    }

    public void setFloorLevel(int level) {
        floorLevel = level;
    }

    public void setRoomArea(double area) {
        roomArea = area;
    }

    // Accessors
    public String getRoomName() {
        return roomName;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public String toString() {
        return (
            "Room Name: " +
            roomName +
            "\nFloor Level: " +
            floorLevel +
            "\nRoom Area: " +
            roomArea
        );
    }
}
