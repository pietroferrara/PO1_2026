package it.unive.dais.po1.rpg;

public class Archer extends Hero {
    @Stat(min=0, max=Integer.MAX_VALUE) private int arrows;

    public Archer(String name, int hitPoints, int maxHitPoints, int arrows) {
        super(name, hitPoints, maxHitPoints);
        if(arrows>=0)
            this.arrows = arrows;
        else this.arrows = 0;
    }

    @Override
    public int attack() {
        if(arrows > 0) {
            arrows--;
            return 20;
        }
        else return 0;
    }
}
