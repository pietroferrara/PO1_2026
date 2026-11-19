package it.unive.dais.po1.mountain;

import org.junit.jupiter.api.Test;

public class TestTrail {

        @Test
        public void trailWithAscent() {
            Trail t = new Trail("Monte Grappa",
                    Unit.KM, 12.0, 900);
            assert t.getLengthKm() == 12.0;
            assert t.getLength(Unit.KM) == 12.0;
        }

        @Test
    public void trailWithDescent() {
            Trail t = new Trail("Monte Grappa",
                    Unit.KM, 12.0, 100);
            assert t.getLengthKm() == 11.0;
            assert t.getLength(Unit.KM) == 12.0;
        }

}
