package it.unive.dais.po1.smartdevices;

public class DimmableLamp extends Lamp {
    private int brightness;


    public DimmableLamp(String name, Room room, int lumen, int brightness) {
        super(name, room, lumen);
        this.brightness = brightness;
    }

    public DimmableLamp(String name, Room room, int lumen) {
        this(name, room, lumen, 0);
    }


    public int getBrightness() {
        return brightness;
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
