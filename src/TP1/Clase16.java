package TP1;

/*16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.*/

public class Clase16 {

    private int numero;

    public Clase16(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int ultimaCifra(){
        return numero%10;
    }

    public int cifraDelMedio(){
        int auxiliar = numero/10;
        return auxiliar%10;
    }

    public int primeraCifra(){

        int auxiliar=numero;
        for(int i=0; i<2; i++){
            auxiliar = auxiliar/10;
        }
        return auxiliar;
    }
}
