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

    /*
        public void disegna(){
            for (int i = 0; i < base; i++){

                System.out.print("0");

                for (int j = 0; j < altezza; j++){

                    System.out.println("0");

                }

            }
        }

     */

    }
