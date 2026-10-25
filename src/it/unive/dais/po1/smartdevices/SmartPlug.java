package it.unive.dais.po1.smartdevices;

public final class SmartPlug extends Device {
    private final String applianceName;
    private final int applianceWatts;

    public SmartPlug(String name, Room room, String applianceName, int applianceWatts) {
        super(name, room);
        this.applianceName = applianceName;
        this.applianceWatts = applianceWatts;
    }

    @Override
    public int getWatts() {
        return this.applianceWatts;
    }
    public String getApplianceName() {
        return this.applianceName;
    }
}
