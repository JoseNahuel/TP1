package TP1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

import static java.lang.Math.PI;

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


//3
        Clase3 objeto3 = new Clase3(100);

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (3)\n");

        System.out.println("La operacion " + objeto3.getN() + "+77 = " + objeto3.incrementarValor());
        System.out.println("La operacion " + objeto3.getN() + "-3 = " + objeto3.reducirValor());
        System.out.println("La operacion " + objeto3.getN() + "*2 = " + objeto3.duplicarValor());


//4
        Clase4 objeto4 = new Clase4(1,3,5,7);

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (4)\n");

        System.out.println("Los valores INICIALES son  ->  A=" +objeto4.getA()+ " , B= " +objeto4.getB()+ " , C= " +objeto4.getC()+ " , D= " +objeto4.getD());
        objeto4.intercambiarValores();
        System.out.println("Los valores FINALES son    ->  A=" +objeto4.getA()+ " , B= " +objeto4.getB()+ " , C= " +objeto4.getC()+ " , D= " +objeto4.getD());


//5
        Clase5 objeto5 = new Clase5(11);

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (5)\n");

        if(objeto5.paridadDelNumero()){
            System.out.println("El numero " + objeto5.getA()+ " es PAR.");
        }else{
            System.out.println("El numero " + objeto5.getA()+ " es IMPAR.");
        }


//6
        Clase6 objeto6 = new Clase6(-11);

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (6)\n");

        if(objeto6.signoDelNumero()){
            System.out.println("El numero " + objeto6.getB()+ " es POSITIVO.");
        }else{
            System.out.println("El numero " + objeto6.getB()+ " es NEGATIVO.");
        }


//7
        Clase7 objeto7 = new Clase7(-25);

        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (7)\n");

        System.out.println("El numero " +objeto7.getC()+ ":");

        if(objeto7.signoDelNumero())
            System.out.println("\t->  ES POSITIVO");
        else
            System.out.println("\t->  ES NEGATIVO");

        if(objeto7.paridadDelNumero())
            System.out.println("\t->  ES PAR");
        else System.out.println("\t->  ES IMPAR");

        if(objeto7.multiploDeCinco())
            System.out.println("\t->  ES MULTIPLO DE 5");
        else System.out.println("\t->  NO MULTIPLO DE 5");

        if(objeto7.multiploDeDiez())
            System.out.println("\t->  ES MULTIPLO DE 10");
        else System.out.println("\t->  NO ES MULTIPLO DE 10");

        if(objeto7.mayorQueCien())
            System.out.println("\t->  ES MAYOR QUE 100");
        else System.out.println("\t->  NO ES MAYOR QUE 100");


//8
        /*System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (8)\n");

        System.out.println("Ingrese su nombre:");

        Scanner input1 = new Scanner(System.in);
        String nombre = input1.nextLine();

        Clase8 objeto8 = new Clase8(nombre);
        System.out.println("Buen dia, " + objeto8.getNombre()+ ".");
*/

//9
        /*System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (9)\n");

        System.out.println("Ingrese un numero entero: ");

        Scanner input2 = new Scanner(System.in);
        int numero = input2.nextInt();

        Clase9 objeto9 = new Clase9(numero);

        System.out.println("El DOBLE de " +objeto9.getNumero()+ "es: " +objeto9.dobleDelNumero());
        System.out.println("El TRIPLE de " +objeto9.getNumero()+ "es: " +objeto9.tribleDelNumero());
*/

//10
        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (10)\n");

        Clase10 objeto10 = new Clase10(100);

        System.out.println("El equivalente de "+objeto10.getGradosF()+"°F ne celcius es de "+objeto10.pasarAGradosCentigrados()+"°C");


//11
        /*System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (11)\n");

        System.out.println("Ingrese el radio de una circunferencia: ");

        Scanner input3 = new Scanner(System.in);
        double radio = input3.nextDouble();

        Clase11 objeto11 = new Clase11(radio);

        System.out.println("El perimetro de la circunferencia de radio "+objeto11.getRadio()+" unidades es de "+objeto11.perimetroCircunferencia()+" unidades.");
        System.out.println("El area de la circunferencia de radio "+objeto11.getRadio()+" unidades es de "+objeto11.areaCircunferencia()+" unidades.");
*/

//12
        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (12)\n");

        Clase12 objeto12 = new Clase12(100);

        System.out.println(objeto12.getKmH()+" km/h = "+objeto12.pasajeKmHaMS()+" m/s.");


//13
        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (13)\n");

        Clase13 objeto13 = new Clase13(2,2);

        System.out.println("Sea c1: "+objeto13.getCateto1()+" y c2: "+objeto13.getCateto2()+". La hipotenusa del triangulo cuyos lados son c1 y c2 es: "+objeto13.calculoDeHipotenusa());


//14
        /*System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (14)\n");

        System.out.println("Ingrese el radio de una esfera: ");

        Scanner input4 = new Scanner(System.in);
        double radioEsf = input4.nextDouble();

        Clase14 objeto14 = new Clase14(radioEsf);
        System.out.println("El volumen de la esfera de radio "+objeto14.getRadio()+" unidades es de "+objeto14.volumenDeEsfera()+" unidades.");
*/

//15
        System.out.println("\n--------------------------------------");
        System.out.println("\nEjercicio (15)\n");

        Clase15 objeto15 = new Clase15(3,7,8);

        System.out.println("Sean los lados de un triangulo l1: "+objeto15.getLado1()+", l2: "+objeto15.getLado2()+", l3: "+objeto15.getLado3()+". El area de dicho triangulo es: "+objeto15.areDeTriangulo());

    }


}
/*      16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.

        17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
        posiciones impares.

        18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y
        segundos respectivamente, y comprueba si la hora que indican es una hora válida.
*/