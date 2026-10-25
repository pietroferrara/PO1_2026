package it.unive.dais.po1.smartdevices;

public class DimmableLamp extends Lamp {
    private int brightness;


    public DimmableLamp(String name, Room room, int lumen, int brightness, int watts) {
        super(name, room, lumen, watts);
        this.brightness = brightness;
    }

    @Override public final int getWatts() {
        return (int) ((brightness/100.0) *
                ((double) super.getWatts()));
    }

    public DimmableLamp(String name, Room room, int lumen, int watts) {
        this(name, room, lumen, 0, watts);
    }

    public void turnOn() {
        if(this.brightness == 0) {
            this.brightness = 10;
        }
        super.turnOn();
    }

    public void turnOn(int brightness) {
        this.turnOn();
        this.setBrightness(brightness);
    }


    public int getBrightness() {
        return brightness;
    }

    public String status() {
        return super.status() + ", brightness: " + this.brightness + "%, this device is a DimmableLamp";
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        this.on = this.brightness > 0;
    }

    public void setBrightness(double brightness) {
        this.brightness = (int) brightness;
        this.on = this.brightness > 0;
    }

    public void setBrightness(int brightness, boolean on) {
        this.setBrightness(brightness);
        this.on = on;
    }

    public void setBrightness(String percent) {
        this.setBrightness(Integer.parseInt(
                percent.replace("%", "")));
    }

}
