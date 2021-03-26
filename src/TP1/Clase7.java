package TP1;

/*7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
100.*/

public class Clase7 {

    private int C;

    public Clase7(int C){
        this.C = C;
    }

    public int getC(){
        return C;
    }

    public void setC(int C){
        this.C = C;
    }

    public boolean signoDelNumero(){

        if(C > 0)
            return true;
        else
            return false;
    }

    public boolean paridadDelNumero(){

        if(C%2 == 0)
            return true;
        else
            return false;
    }

    public boolean multiploDeCinco(){

        if(C%5 == 0)
            return true;
        else
            return false;
    }

    public boolean multiploDeDiez(){

        if(C%10 == 0)
            return true;
        else
            return false;
    }

    public boolean mayorQueCien(){

        if(C>100)
            return true;
        else
            return false;
    }


}
