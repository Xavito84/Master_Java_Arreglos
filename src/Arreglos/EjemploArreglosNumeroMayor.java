package Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        int[] a= new int[5];
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese 5 enteros");

        for (int i=0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }

        int max=0;
        for(int i=1; i<a.length; i++){
            max= (a[max] > a[i]) ? max : i; // pregunta si max es mayor que el numero actual de i
        }

        System.out.println("el numero mayor es: " + a[max]);
    }


}
