package it.unive.dais.po1.smartdevices;

public class Device {
    private final String name;
    protected boolean on = false;
    private Room room;
    public Device(String name, Room room) {
        this.name = name;
        this.room = room;
    }
    public void turnOn() { this.on = true; }
    public void turnOff() { this.on = false; }

    public String getName() {
        return name;
    }
    public boolean isOn() {
        return on;
    }

    public String status() {
        return "Device " + this.name + " is " + (this.on ? "on" : "off");
    }

    public String getRoomName() {
        return this.room.getName();
    }
}
