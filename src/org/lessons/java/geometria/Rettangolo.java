package org.lessons.java.geometria;

public class Rettangolo {
    //definisco quali sono i campi
     int base;
     int altezza;

    //utilizzo un costruttore
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    //definisco quale metodo ho utilizzato per il calcolo dell'area
     public int calcolaArea() {
        return base * altezza;
    }
    //definisco quale metodo ho utilizzato per il calcolo del perimetro
     public int calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}