package Arreglos;

import java.util.Scanner;

public class Tarea15 {

    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner sc = new Scanner(System.in);

        int sumaPositivos = 0, sumaNegativos = 0, cuentaPositivos = 0, cuentaNegativos = 0, cuentaCeros = 0;

        // Leer los 7 números por teclado
        System.out.println("Ingrese 7 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            // Clasificar y operar según el valor del número
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cuentaPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }

        // Calcular promedios
        double promedioPositivos = (double) sumaPositivos/ cuentaPositivos;
        double promedioNegativos = (double) sumaNegativos/ cuentaNegativos;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Promedio de positivos: " + promedioPositivos);
        System.out.println("Promedio de negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + cuentaCeros);
    }
}

/*
import javax.swing.*;

public class SistemaEstadistico {
    public static void main(String[] args) {
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numero a pedir"));
        int[] a = new int[cant];
        int sumPositivo = 0;
        int sumNegativos = 0;
        int cantCeros = 0;
        int cantPositivos = 0;
        int cantNegativos = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para la posición " + (i + 1)));
        }
        System.out.println("===== NUMEROS INGRESADOS ====");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if ( a[i] > 0) {
                sumPositivo += a[i];
                cantPositivos+=1;
            } else if (a[i] < 0) {
                sumNegativos += a[i];
                cantNegativos+=1;
            } else {
                cantCeros += 1;
            }
        }



        System.out.println("sumPositivo = " + sumPositivo);
        System.out.println("sumNegativos = " + sumNegativos);

        System.out.println("======== CANTIDAD DE CEROS =====");
        System.out.println("\ncantCeros = " + cantCeros);

        System.out.println("======== PROMEDIOS =====");
        System.out.println("Promedio de los valores positivos: " + sumPositivo/(double)cantPositivos);
        System.out.println("Promedio de los valores Negativos: " + sumNegativos/(double)cantNegativos);
    }
}
 */