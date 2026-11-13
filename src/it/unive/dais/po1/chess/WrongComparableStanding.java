package it.unive.dais.po1.chess;

public class WrongComparableStanding implements Comparable<WrongComparableStanding>{
    private Player player;
    private double score;

    public WrongComparableStanding(Player player, double score) {
        this.player = player;
        this.score = score;
    }

    @Override
    public String toString() {
        return player +
                " has " + score +
                " points";
    }


    @Override
    public int compareTo(WrongComparableStanding o) {
        if(this.player.compareTo(o.player) == 0)
            return (int) (o.score - this.score);
        else return this.player.compareTo(o.player);
    }
}
