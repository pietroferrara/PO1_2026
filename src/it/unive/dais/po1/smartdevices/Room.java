package it.unive.dais.po1.smartdevices;

public class Room {
    private String name;
    private int floor;

    public Room(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }
}
