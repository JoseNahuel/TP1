package TP1;

/*3. Programa Java que declare una variable entera N, asignarle un valor. A continuación
escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
valor a 3, duplicar su valor.*/

public class Clase3 {

    private int N;

    public Clase3(int N){
        this.N = N;
    }

    public int getN(){
        return N;
    }

    public void setN(int N){
        this.N = N;
    }

    public int incrementarValor(){
        return N+77;
    }

    public int reducirValor(){
        return N-3;
    }

    public int duplicarValor(){
        return N*2;
    }

}
