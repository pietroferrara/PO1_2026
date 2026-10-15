package it.unive.dais.po1.spotify;

public class Playlist {
    private final String name;
    private final int maxMinutes;
    private int lengthInSeconds;
        public Playlist(String name,
                        int maxMinutes) {
            this.name = name;
            this.maxMinutes = maxMinutes;
            this.lengthInSeconds = 0;
        }

        public boolean add(Track track) {
            //If the length of the track is compatible with the maximal length of the playlist
            //the track is added to the playlist
            if(this.lengthInSeconds + track.getLength() <= this.maxMinutes * 60) {
                this.lengthInSeconds = this.lengthInSeconds + track.getLength();
                return true;
            }
            else return false;
        }

        public int getTotalSeconds() {
            return this.lengthInSeconds;
        }

}
