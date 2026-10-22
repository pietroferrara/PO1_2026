package it.unive.dais.po1.quadrilaterals;

public class Rectangle extends Quadrilateral {
    public Rectangle(double edge1, double edge2) {
        super(edge1, edge2, edge1, edge2);
    }

    public double getArea() {
        return this.edge1*this.edge2;
    }
}
