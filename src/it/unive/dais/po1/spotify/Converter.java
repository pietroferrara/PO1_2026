package it.unive.dais.po1.spotify;

class Converter {
    static int toSeconds(int minutes) {
        return minutes * 60;
    }

    static int toMinutes(int seconds) {
        return seconds / 60;
    }

    static int toMissingSeconds(int seconds) {
        return seconds % 60;
    }
}
