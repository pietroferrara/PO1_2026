package it.unive.dais.po1.quadrilaterals;

public class Runner {

    public static void main(String[] args) {
        Square s = new Square(2);
        Rectangle r = new Rectangle(2, 3);
        System.out.println(s.getPerimeter());
        System.out.println(r.getPerimeter());
        System.out.println(s.getArea());
        System.out.println(r.getArea());

    }
}
