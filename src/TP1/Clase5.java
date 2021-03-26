package TP1;

/*5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
continuación mostrar un mensaje indicando si A es par o impar.*/

public class Clase5 {

    private int A;

    public Clase5(int A){
        this.A = A;
    }

    public int getA(){
        return A;
    }

    public void setA(int A){
        this.A = A;
    }

    public boolean paridadDelNumero(){

        if(A%2 == 0)
            return true;
        else
            return false;
    }

}
