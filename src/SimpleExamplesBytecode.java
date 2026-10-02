public class SimpleExamplesBytecode {

    double fieldcelsius;

    int add(int x, int y) {
        return x + y;
    }

    static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    double getToFahrenheit() {
        return toFahrenheit(fieldcelsius);
    }
}
