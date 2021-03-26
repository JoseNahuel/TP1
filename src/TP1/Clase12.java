package TP1;

/*12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/

public class Clase12 {

    private double kmH;

    public Clase12(double knH){
        this.kmH = knH;
    }

    public double getKmH() {
        return kmH;
    }

    public void setKmH(double kmH) {
        this.kmH = kmH;
    }

    public double pasajeKmHaMS(){
        return kmH/3.6;
    }

}
