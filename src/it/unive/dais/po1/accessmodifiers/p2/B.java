package it.unive.dais.po1.accessmodifiers.p2;

import it.unive.dais.po1.accessmodifiers.p1.A;

public class B {
    private int n_private;
    int n_default;
    public int n_public;

    void foo(A a, B b, C c) {
        a.n_public = 1;
        c.n_public = 1;
        b.n_public = 1;
        this.n_public = 1;
        //a.n_default = 1; // non compila
        b.n_default = 1;
        c.n_default = 1;
        this.n_default = 1;
        //a.n_private = 1; // non compila
        //c.n_private = 1; // non compila
        this.n_private = 1;
        b.n_private = 1;//se la visibilita' di private fosse a livello di oggetto, non si potrebbe vedere

    }
}
