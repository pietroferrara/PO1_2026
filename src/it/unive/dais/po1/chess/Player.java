package it.unive.dais.po1.chess;

import java.util.Objects;

public class Player implements Comparable<Player> {
    private String name;
    private int rating;

    public Player(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Player player)) return false;

        return rating == player.rating && Objects.equals(name, player.name);
    }

    @Override
    public int compareTo(Player o) {
        int ratingDiff = this.rating - o.rating;
        if (ratingDiff != 0) return ratingDiff;
        else return this.name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + rating;
        return result;
    }

    @Override
    public String toString() {
        return name + " (" + rating + ")";
    }
}
