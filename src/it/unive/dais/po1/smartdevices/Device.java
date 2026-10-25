package it.unive.dais.po1.smartdevices;

public abstract class Device {
    private final String name;
    protected boolean on = false;
    private Room room;
    public Device(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public abstract int getWatts();


    public void turnOn() { this.on = true; }
    public final void turnOff() { this.on = false; }



    public String getName() {
        return name;
    }
    public boolean isOn() {
        return on;
    }

    protected String status() {
        return "Device " + this.name + " is " + (this.on ? "on" : "off");
    }

    public String getRoomName() {
        return this.room.getName();
    }
}
