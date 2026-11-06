package it.unive.dais.po1.astronomy;

import it.unive.dais.po1.util.Catalog;

public class Sky {

    static void placeAStar(CelestialBody[] bodies) {
        bodies[0] = new Star("Sol", 5.0, "Sun");
    }


        static CelestialBody brightestArray(CelestialBody[] bodies) {
        if (bodies.length == 0)
            return null;

        CelestialBody brightest = bodies[0];
        for (int i = 1; i < bodies.length; i++) {
            CelestialBody current = bodies[i];
            if (current.brighter(brightest))
                brightest = current;
        }
        return brightest;
    }

    static void placeAStar(Catalog<? super Star> bodies) {
        bodies.add(new Star("Sol", 5.0, "Sun"));
    }

    static Planet addOuterPlanet(Catalog<? super Planet> bodies) {
        bodies.add(new Planet("Saturn", 1.0, 0));
        bodies.add(new Planet("Uran", 1.5, 2));
        return (Planet) bodies.get(0);
    }


    static CelestialBody brightest(Catalog<? extends CelestialBody> bodies) {
        //bodies.add(new Star("Syrious", -2, "Andromeda"));
        if (bodies.size() == 0)
            return null;

        CelestialBody brightest = bodies.get(0);
        for (int i = 1; i < bodies.size(); i++) {
            CelestialBody current = bodies.get(i);
            if (current.brighter(brightest))
                brightest = current;
        }
        return brightest;
    }
}
