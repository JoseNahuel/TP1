package TP1;

/*13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
longitud de la hipotenusa según el teorema de Pitágoras.*/

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class Clase13 {

    private double cateto1;
    private double cateto2;

    public  Clase13(double c1, double c2){
        cateto1 = c1;
        cateto2 = c2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public double calculoDeHipotenusa(){
        return Math.sqrt((Math.pow(cateto1,2)+Math.pow(cateto2,2)));
    }

}
