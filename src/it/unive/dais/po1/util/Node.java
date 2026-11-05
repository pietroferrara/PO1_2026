package it.unive.dais.po1.util;

public class Node<T> {
    T body;
    Node<T> next;

    public Node(T body) {
        this.body = body;
    }

    public T getBody() {
        return body;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
