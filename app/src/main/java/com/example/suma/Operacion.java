package com.example.suma;

public class Operacion {
    int n1;
    int n2;

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getResult(int opcion) {
        int resultado=0;
        switch (opcion) {
            case 0:
                resultado=n1+n2;
                break;
            case 1:
                resultado=n1+n2;
                break;
            case 2:
                resultado=Math.abs(n1-n2);
                break;
            case 3:
                resultado=n1*n2;
                break;
        }
        return resultado;
    }

    public static int getNum1(){
        return (int)(Math.random()*10);
    }

    public static int getNum2(){
        return (int)(Math.random()*100);
    }

    public static String getSimbolo(int opcion){
        String resultado="";
        switch (opcion) {
            case 0:
                resultado="+";
                break;
            case 1:
                resultado="+";
                break;
            case 2:
                resultado="-";
                break;
            case 3:
                resultado="x";
                break;
        }
        return resultado;
    }

}
