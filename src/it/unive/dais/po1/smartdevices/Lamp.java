package it.unive.dais.po1.smartdevices;

public class Lamp extends Device {
    private final int lumen;

    public Lamp(String name, Room room, int lumen) {
        super(name, room);
        this.lumen = lumen;
    }
}
