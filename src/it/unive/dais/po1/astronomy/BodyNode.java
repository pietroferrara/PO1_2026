package it.unive.dais.po1.astronomy;

public class BodyNode {
    CelestialBody body;
    BodyNode next;

    public BodyNode(CelestialBody body) {
        this.body = body;
    }

    public CelestialBody getBody() {
        return body;
    }

    public BodyNode getNext() {
        return next;
    }

    public void setNext(BodyNode next) {
        this.next = next;
    }
}
