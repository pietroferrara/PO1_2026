package it.unive.dais.po1.smartdevices;

public class Lamp extends Device {
    private final int lumen;
    private final int watts;

    public Lamp(String name, Room room, int lumen, int watts) {
        super(name, room);
        this.lumen = lumen;
        this.watts = watts;
    }

    @Override
    public int getWatts() {
        if(this.on)
            return this.watts;
        else return 0;
    }
}
