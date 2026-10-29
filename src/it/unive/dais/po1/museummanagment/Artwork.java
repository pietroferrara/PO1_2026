package it.unive.dais.po1.museummanagment;

public abstract class Artwork {
    private final String title;
    private final String artist;
    private final int year;

    public Artwork(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getYear() {
        return year;
    }

    public final String describe() {
        return title + " by " + artist + " (" + year + ")";
    }
}
