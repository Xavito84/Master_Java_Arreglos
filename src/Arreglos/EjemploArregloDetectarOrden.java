package Arreglos;

import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {

        int [] a = new int[7];
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese 7 números enteros");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }

        boolean ascendente= false;
        boolean descendente= false;
        for (int i = 0; i < a.length -1; i++) {

            if(a[i] > a[i+1]){
                descendente= true;
            }
            if(a[i]< a[i+1]){
                ascendente= true;
            }
        }
        
        if(descendente== true && ascendente== true){
            System.out.println("Arreglo= desordenado");
        } else if (ascendente== false && descendente== false) {
            System.out.println("Arreglo= son todos iguales");
        } else if (ascendente == true && descendente == false) {

            System.out.println("Arreglo: ascendente");
        }else if (ascendente== false && descendente== true) {
            System.out.println("Arreglo= descendente");
        }


    }
}
