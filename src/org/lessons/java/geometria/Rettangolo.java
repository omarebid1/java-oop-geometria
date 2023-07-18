package org.lessons.java.geometria;

public class Rettangolo {

    private
        int base, altezza;


    public Rettangolo (int base, int altezza){

        this.altezza = altezza;
        this.base = base;

    }

    public int calcolaArea(){

        int area = this.altezza * this.base;

        return area;

    }

    public int calcolaPerimetro(){

        int perimetro = (this.altezza + this.base) * 2;

        return perimetro;

    }

}
