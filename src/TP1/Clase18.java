package TP1;

/*18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y
segundos respectivamente, y comprueba si la hora que indican es una hora válida.*/

public class Clase18 {

    private int H;
    private int M;
    private int S;

    public Clase18(int hora, int min, int sec){
        H = hora;
        M = min;
        S = sec;
    }

    public int getH() {
        return H;
    }

    public int getM() {
        return M;
    }

    public int getS() {
        return S;
    }

    public boolean validarHora(){

        boolean flag;
        if((H<24 && H>=0)&&(M<60 && M>=0)&&(S<60 && S>=0))
            flag = true;
        else
            flag = false;

        return flag;
    }
}
