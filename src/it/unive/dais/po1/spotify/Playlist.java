package it.unive.dais.po1.spotify;

/**
 * A playlist that is created empty and then one can add {@link Track}s to it.
 *
 * @author Pietro Ferrara
 *
 * @see Player
 */
public class Playlist {
    private final String name;
    private final int maxMinutes;
    private int lengthInSeconds;

    /**
     * Creates a playlist with the given name and maximal length in minutes
     *
     * @param name the name of the playlist
     * @param maxMinutes the maximal length of the playlist in <b>minutes</b>
     */
        public Playlist(String name,
                        int maxMinutes) {
            this.name = name;
            this.maxMinutes = maxMinutes;
            this.lengthInSeconds = 0;
        }

    /**
     * Adds a track to the playlist adding the time of the
     * track to the total time of the playlist
     *
     * @param track a track to be added to the playlist
     *
     * @return {@code true} if the track is added, false otherwise (usually because the length goes above the maximal allowed length)
     */
    public boolean add(Track track) {
        Math.abs(this.lengthInSeconds - track.getLength());
            //If the length of the track is compatible with the maximal length of the playlist
            //the track is added to the playlist
            if(this.lengthInSeconds + track.getLength() <= Converter.toSeconds(this.maxMinutes)) {
                this.lengthInSeconds = this.lengthInSeconds + track.getLength();
                return true;
            }
            else return false;
        }

    /**
     * Returns the total time of the playlist in seconds
     *
     * @return the total time of the playlist in seconds
     */
    public int getTotalSeconds() {
            return this.lengthInSeconds;
        }

    /**
     * Returns a short description of the
     *  playlist, e.g., {@code "Evening jazz (2 tracks, 14:59)"}.
     *  @return a string describing the playlist
     */
    public String describe() {
        return "Playlist " + this.name + " with " + this.lengthInSeconds + " seconds";
    }
}
