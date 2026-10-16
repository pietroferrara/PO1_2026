package it.unive.dais.po1.spotify;

/**
 * A music track that can be added
 * to a playlist.
 */
public class Track {
    private final String name;
    private final String artist;
    private final int seconds;

    /**
     * Creates a track with the given title,
     * artist, and duration in seconds.
     *
     * @param name the track's title
     * @param artist the track's artist
     * @param seconds the track's duration, in seconds
     */
    public Track(String name, String artist, int seconds) {
        this.name = name;
        this.artist = artist;
        this.seconds = seconds;
    }

    /**
     * The length of the track, in seconds.
     *
     * @return the track's length, in seconds
     */
    public int getLength() {
        return seconds;
    }
}
