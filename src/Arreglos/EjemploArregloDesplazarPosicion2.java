package Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {
    public static void main(String[] args) {

        int []a = new int[10];
        int elemento, posicion;
        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Ingrese un número: ");
            a[i]= sc.nextInt();
        }


        System.out.println();

        System.out.println("Nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.println("Posicion donde agregar el elemento ( 0 a 9): ");
        posicion = sc.nextInt();

        System.out.println();
        for(int i = a.length-2;  i>=posicion; i--) {
            a[i+1]= a[i];
        }

        a[posicion]= elemento;

        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
