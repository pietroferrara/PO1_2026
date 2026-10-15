package it.unive.dais.po1.spotify;

public class Player {
    private int volume=0;
    private static final int MAX_VOLUME=100;

        public boolean setVolume(int volume) {
            //The volume must be a positive value
            if(volume < 0)
                return false;
            /* The jump from the current volume to the target volume
                must be bounded by some value.
             */
            int jump = Math.abs(this.volume - volume);
            //We allow to modify the volume only by 30 steps and if the maximum volume is not exceeded
            if(jump <= 30 && volume <= MAX_VOLUME) {
                this.volume = volume;
                return true;
            }
            else return false;
        }
        public int getVolume() {
            return this.getVolume();
        }
}
