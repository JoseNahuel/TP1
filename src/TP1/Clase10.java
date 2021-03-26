package TP1;

/*10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
centígrados.*/

public class Clase10 {

    private double gradosF;

    public Clase10(double gradosF){
        this.gradosF = gradosF;
    }

    public double getGradosF() {
        return gradosF;
    }

    public void setGradosF(double gradosF) {
        this.gradosF = gradosF;
    }

    public double pasarAGradosCentigrados(){
        return (gradosF-32) * 5/9;
    }

}
