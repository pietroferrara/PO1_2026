package it.unive.dais.po1.astronomy;

public class BodyCatalog {
    private BodyNode head;

    public BodyCatalog() {
        this.head = null;
    }
    public void add(CelestialBody body) {
        BodyNode node = new BodyNode(body);
        node.setNext(head);
        head = node;
    }
    public CelestialBody get(int index) {
        BodyNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getBody();
    }
}
