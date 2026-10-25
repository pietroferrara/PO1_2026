package it.unive.dais.po1.quadrilaterals;

public class Square extends Quadrilateral {
    public Square(double edge) {
        super(edge, edge, edge, edge);
    }

    @Override
    public double getArea() {
        return this.edge1*this.edge1;
    }
}
