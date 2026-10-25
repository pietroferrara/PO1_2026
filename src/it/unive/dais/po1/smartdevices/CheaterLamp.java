package it.unive.dais.po1.smartdevices;

public class CheaterLamp extends DimmableLamp {


    public CheaterLamp(String name, Room room, int lumen, int brightness, int watts) {
        super(name, room, lumen, brightness, watts);
    }

    public CheaterLamp(String name, Room room, int lumen, int watts) {
        super(name, room, lumen, watts);
    }

    /*@Override
    public int getWatts() {
        return 0;
    }*/
}
