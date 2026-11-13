package it.unive.dais.po1.chess;

public class CorrectComparableStanding implements Comparable<CorrectComparableStanding>{
    private Player player;
    private double score;

    public CorrectComparableStanding(Player player, double score) {
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
    public int compareTo(CorrectComparableStanding o) {
        if(this.player.compareTo(o.player) == 0) {
            if(o.score != this.score)
                return new Double(o.score).compareTo(this.score);
            else return 0;
        }
        else return this.player.compareTo(o.player);
    }
}
