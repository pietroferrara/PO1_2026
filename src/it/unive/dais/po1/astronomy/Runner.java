package it.unive.dais.po1.astronomy;

import it.unive.dais.po1.util.Catalog;

public class Runner {

    public static void main(String[] args) {
        Catalog<Planet> planets = new Catalog<>();
        planets.add(new Planet("Mars", 1.5, 2));
        Planet p = planets.get(0);
        Star s = new Star("Sirius", -1.5, "Canis Major");
        Planet p1 = new Planet("Venus", 2.5, 0);

        Comparator<CelestialBody> c = new Comparator<>(p, s);
        System.out.println(c.brighter().getName());

        Comparator<Planet> c1 = new Comparator<>(p1, p);
        System.out.println(c1.brighter().getName());

        c = c1;
        c1 = c;


        /*Catalog<Planet> catalog = Catalog.<Planet>of(new Planet("Mars", 1.5, 2));
        Catalog<Planet> catalog1 = new Catalog();
        Catalog<Planet> catalog2 = new Catalog<>();
        catalog.add(new Planet("Venus", 2.5, 0));
        catalog.add(new GasGiant("Jupyter", 1.5, 12, false));
        catalog.add(new GasGiant("Saturn", 2.5, 5, true));

        Planet p = Runner.<Planet>identity(new Planet("Mars", 1.5, 2));

        print(catalog);

        System.out.println(Catalog.<Planet>lastOf(catalog).getName());


        Catalog<String> observes = Catalog.<String>of("Galileo");*/

        /*BodyCatalog planets = new BodyCatalog();
        planets.add(new Planet("Mars", 1.5, 2));
        planets.add(new Star("Sirius", -1.5,
                "Canis Major"));

        Planet p = (Planet) planets.get(1);
        Star s = (Star) planets.get(0);
        Planet p1 = (Planet) planets.get(0);*/




    }

    private static void print(Catalog<Planet> o) {
        int i = 0;
        CelestialBody n = o.get(0);
        while(n!=null) {
            System.out.println(n.getName());
            n = o.get(i+1);
            i = i+1;
        }
    }

    private static <E> E identity(E e) {
        return e;
    }

}
