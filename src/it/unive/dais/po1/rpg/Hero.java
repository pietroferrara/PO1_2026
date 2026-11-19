package it.unive.dais.po1.rpg;

public abstract class Hero {
    private final String name;
    private int hitPoints;
    private int maxHitPoints;

    public Hero(String name, int hitPoints, int maxHitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxHitPoints = maxHitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }
}
