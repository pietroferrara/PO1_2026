package it.unive.dais.po1.chess;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        /*String club = "Scacchi Venezia";
        String club1 = "Scacchi Venezia";
        String club2 = new String("Scacchi Venezia");
        club2=club2.replace('S', 'W');
        String shout = club.toUpperCase();
        System.out.println(shout);
        String clubASD = club + " ASD";
        System.out.println(clubASD);
//Scacchi Venezia / SCACCHI VENEZIA
        //club.concat(" ASD").equals(club + " ASD");
//true
        club.substring(8);//Venezia
        club.length();  */     //15



        //Integer n = null;
        //Integer n1 = 10;

        //int n2 = n;

        List<Player> registrations = new ArrayList<>();
        registrations.add(new Player("Anna", 2100));
        registrations.add(new Player("Bruno", 1950));
        registrations.add(new Player("Anna", 2100));
        registrations.add(new Player("Chiara", 2100));

        StringBuilder res = new StringBuilder();
        for(Player player : registrations) {
            res.append(player.toString()).append(" ");
        }
        String s = res.toString();
        System.out.println(s);

        registrations.size();   //4
        Set<WrongComparableStanding> rating = new TreeSet<>();
        Player anna = new Player("Anna", 2100);
        Player bruno = new Player("Bruno", 1950);
        rating.add(new WrongComparableStanding(anna, 2.5));
        rating.add(new WrongComparableStanding(anna, 2.0));
        rating.add(new WrongComparableStanding(bruno, 4));
        rating.size();

        /*for(Player player : players) {
            System.out.println(player);
        }

        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

//true

    }
}
