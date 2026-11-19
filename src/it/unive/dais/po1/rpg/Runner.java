package it.unive.dais.po1.rpg;

public class Runner {

    public static void main(String[] args) {
        Hero hero = new Archer("Pietro", 100, 100);
        Class c = hero.getClass();
        System.out.println(c.getName());
        System.out.println(c.isInterface());
        System.out.println(c.isEnum());

        Class c1 = Hero.class;
        System.out.println(c1.getName());

        Class c2 = int.class;
        System.out.println(c2.getName());

    }
}
