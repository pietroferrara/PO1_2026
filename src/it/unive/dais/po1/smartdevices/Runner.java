package it.unive.dais.po1.smartdevices;

public class Runner {

    public static void main(String[] args) {
        Room kitchen = new Room("Cucina", 1);
        CheaterLamp a = new CheaterLamp("Lampadina", kitchen, 2400, 10);
        a.turnOff();
        System.out.println(a.getWatts());
        a.turnOn(80);
        System.out.println(a.getWatts());
    }
}
