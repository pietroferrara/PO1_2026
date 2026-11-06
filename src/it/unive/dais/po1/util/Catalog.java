package it.unive.dais.po1.util;

public class Catalog<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Catalog() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int size() {
        return this.size;
    }

    public void add(T body) {
        Node<T> node = new Node<>(body);
        node.setNext(head);
        head = node;
        if (tail == null) tail = node;
        size++;
    }

    public T get(int index) {
        Node<T> node = head;
        for (int i = 0; i < index && node!=null; i++) {
            node = node.getNext();
        }
        if(node!=null)
           return node.getBody();
        else return null;
    }

    public boolean contains(T elem) {
        Node<T> node = head;
        while (node != null) {
            if (node.getBody() == elem) return true;
            else node = node.getNext();
        }
        return false;
    }

    public static <E> Catalog<E> of(E el) {
        Catalog<E> catalog = new Catalog<E>();
        catalog.add(el);
        return catalog;
    }

    public static <E> E lastOf(Catalog<E> catalog) {
        if(catalog.size()==0)
            return null;
        else return catalog.get(catalog.size()-1);
    }

    public static String concatenate(Catalog<?> s) {
        String result = "";
        Node<?> node = s.head;
        while (node != null) {
            result = result + " " + node.getBody();
            node = node.getNext();
        }
        return result;
    }
}
