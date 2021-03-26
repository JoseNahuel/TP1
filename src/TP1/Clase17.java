package TP1;

/*17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
posiciones impares.*/

public class Clase17 {

    private int numero;

    public Clase17(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int primeraPosicion(){

        int auxiliar=numero;
        for(int i=0; i<4; i++){
            auxiliar = auxiliar/10;
        }
        return auxiliar;
    }

    public int terceraPosicion(){

        int auxiliar=numero;
        for(int i=0; i<2; i++){
            auxiliar = auxiliar/10;
        }
        return auxiliar%10;
    }

    public int quintaPosicion(){
        return numero%10;
    }

}
