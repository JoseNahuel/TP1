package TP1;

/*6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.*/

public class Clase6 {

    private int B;

    public Clase6(int B){
        this.B = B;
    }

    public int getB(){
        return B;
    }

    public void setB(int B){
        this.B = B;
    }

    public boolean signoDelNumero(){

        if(B>=0)
            return true;
        else
            return false;
    }
}
