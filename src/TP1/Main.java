package TP1;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

//1
        Clase1 objeto1 = new Clase1(2,5.6,'n');

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (1)\n");

        System.out.println("El valor del entero es: " + objeto1.getN());
        System.out.println("El valor del double es: " + objeto1.getA());
        System.out.println("El valor del char es: " + objeto1.getC());

        System.out.println("\nA + N = " + objeto1.suma());
        System.out.println("A - N = " + objeto1.resta());
        System.out.println("El valor numerico del char " + objeto1.getC() + " es " + objeto1.valorASCIIdelChar());


//2
        Clase2 objeto2 = new Clase2(3,7,9.7,3.2);

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (2)\n");

        System.out.println("El valor de la operacion X+Y*N-M es: " + objeto2.operacion1());
        System.out.println("El valor de la operacion N+M*Y*X es: " + objeto2.operacion2());
        System.out.println("El valor de la operacion (M+X)*(Y+N) es: " + objeto2.operacion3());
        System.out.println("El valor de la operacion (N*M)/X es: " + objeto2.operacion4());



    }
}
/*      3. Programa Java que declare una variable entera N, asignarle un valor. A continuación
        escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
        valor a 3, duplicar su valor.

        4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.

        5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
        continuación mostrar un mensaje indicando si A es par o impar.

        6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.

        7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        100.

        8. Programa Java que lea un nombre y muestre por pantalla:
        “Buenos días, {NOMBRE}”.

        9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
        ese número y lo muestre por pantalla.

        10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
        centígrados.

        11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
        muestra por pantalla la longitud y el área de la circunferencia.

        12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
        longitud de la hipotenusa según el teorema de Pitágoras.

        14. Programa que calcula el volumen de una esfera.

        15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.

        16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.

        17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
        posiciones impares.

        18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y
        segundos respectivamente, y comprueba si la hora que indican es una hora válida.
*/