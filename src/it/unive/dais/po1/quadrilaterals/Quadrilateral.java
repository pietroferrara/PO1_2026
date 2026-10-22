package it.unive.dais.po1.quadrilaterals;

public class Quadrilateral {
    protected double edge1, edge2, edge3, edge4;

    public Quadrilateral(double edge1, double edge2, double edge3, double edge4) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.edge4 = edge4;
    }

    public double getPerimeter() {
        return edge1 + edge2 + edge3 + edge4;
    }
}
