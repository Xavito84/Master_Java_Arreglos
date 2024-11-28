package Arreglos;

import java.util.Scanner;

public class Tarea16 {
/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5

En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        // Llenar el arreglo con valores entre 1 y 9
        System.out.println("Ingrese 10 números entre 1 y 9:");
        for (int i = 0; i < a.length; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = sc.nextInt();
                if (numero < 1 || numero > 9) {
                    System.out.println("Error: El número debe estar entre 1 y 9. Intente de nuevo.");
                }
            } while (numero < 1 || numero > 9); // Validar que esté en el rango
            a[i] = numero;
        }

        // Arreglo para contar ocurrencias de los números del 1 al 9
        int[] ocurrencias = new int[10]; // Índice 1 representa el número 1, índice 2 el número 2, etc.

        // Contar ocurrencias
        for (int numero : a) {
            ocurrencias[numero]++;
        }

        // Encontrar el número con más ocurrencias
        int maxOcurrencias = 0;
        int numeroMasRepetido = 0;
        for (int i = 1; i < ocurrencias.length; i++) { // Iteramos del 1 al 9
            if (ocurrencias[i] > maxOcurrencias) {
                maxOcurrencias = ocurrencias[i];
                numeroMasRepetido = i;
            }
        }

        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("La mayor ocurrencias es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + numeroMasRepetido);
    }
}


/*
import java.util.Random;

public class Ocurrencia {
    public static void main(String[] args) {

        int [] numeros = new int[10];
        int [] ocurrencias = new int[10];
        int [] unicos = new int[10];

        Random rnd = new Random();
        int numElementos = numeros.length;

        for(int i = 0; i < numElementos; i++ ){
            numeros[i] = 1 + rnd.nextInt(9);
            System.out.println("Numero aleatorio " + (i+1) +" : " + numeros[i]);
        }

        int indexUnico = 0;
        for(int i = 0; i < numElementos; i++ ){
            boolean existe = false;

            for(int j=0; j< unicos.length; j++){
                 if(numeros[i] == unicos[j]){
                     ocurrencias[j]++;
                     existe = true;
                     break;
                 }
            }

            if(existe == false){
                unicos[indexUnico] = numeros[i];
                ocurrencias[indexUnico]++;
                indexUnico++;
            }
        }

        int maxOcurrencia = ocurrencias[0];
        int indexMaxOcurrencia=0;

        for(int x=1; x < ocurrencias.length; x++){
            if(ocurrencias[x] > maxOcurrencia ) {
                maxOcurrencia = ocurrencias[x];
                indexMaxOcurrencia = x;
            }
        }

        System.out.println("La mayor ocurrencias es: " +ocurrencias [indexMaxOcurrencia] );
        System.out.println("El elemento que mas se repite es:: " +  unicos[indexMaxOcurrencia] );

    }
}
 */