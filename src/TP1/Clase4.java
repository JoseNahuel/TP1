package TP1;

/*4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
cada una. A continuación realiza las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.*/

public class Clase4 {

    private int A;
    private int B;
    private int C;
    private int D;


    public Clase4(int A, int B, int C, int D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }


    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public void intercambiarValores(){

        int auxiliar = B;

        B = C;
        C = A;
        A = D;
        D = auxiliar;
    }
}
