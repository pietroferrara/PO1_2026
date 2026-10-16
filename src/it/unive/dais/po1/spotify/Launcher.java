package it.unive.dais.po1.spotify;

class Launcher {
    public static void main(String[] args) {
        Player player = new Player();
        player.setVolume(50);
        Track t = new Track("Canzone", "Cantante", 126);
        Playlist p = new Playlist("La mia playlist", 5);
        p.add(t);
        p.add(t);
        p.add(t);
        p.add(t);
        p.add(t);
        System.out.println(p.describe());
    }
}
