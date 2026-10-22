package it.unive.dais.po1.smartdevices;

public class Runner {

    public static void main(String[] args) {
        Room kitchen = new Room("Cucina", 1);
        Lamp a = new Lamp("Lampadina", kitchen, 2400);
        a.turnOff();
        System.out.println(a.status());
        Device b = new Device("Device", kitchen);
        DimmableLamp c = new DimmableLamp("DimmableLamp", kitchen, 2400);
        c.setBrightness(50);
        c.setBrightness(20.0);
        float f = (float) 20.0;
        c.setBrightness(f);
        c.setBrightness(100, false);
        c.setBrightness("70%");
    }
}
