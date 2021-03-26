package TP1;

/*9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
ese número y lo muestre por pantalla.*/

public class Clase9 {

    private int numero;

    public Clase9(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int dobleDelNumero(){
        return numero*2;
    }

    public int tribleDelNumero(){
        return numero*3;
    }

}
