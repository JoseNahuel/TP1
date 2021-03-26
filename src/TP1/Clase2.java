package TP1;

/*2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
por pantalla una serie de operaciones entre ellas.*/

public class Clase2 {

    private int X;
    private int Y;
    private double N;
    private double M;


    public Clase2(int X, int Y, double N, double M) {

        this.X = X;
        this.Y = Y;
        this.N = N;
        this.M = M;

    }


    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public double getN() {
        return N;
    }

    public void setN(double n) {
        N = n;
    }

    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    public double operacion1(){
        return  X+Y*N-M;
    }

    public double operacion2(){
        return N+M*Y*X;
    }

    public double operacion3(){
        return (M+X)*(Y+N);
    }

    public double operacion4(){
        return (N*M)/X;
    }
}
