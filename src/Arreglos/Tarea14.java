package Arreglos;

import java.util.Scanner;

public class Tarea14 {
    /*
    Imprima el número más alto del arreglo considerando solo valores únicos
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeroIngresado = new int[7];
        int[] numeroFinal = new int[7];
        int numMayor=0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero: ");
            numeroIngresado[i] = scanner.nextInt();

            if (numeroIngresado[i] >=11 && numeroIngresado[i]<=99){
                numeroFinal[i]=numeroIngresado[i];
            }
            else {
                System.out.println("Por favor ingrese un numero en el rango de 11 a 99");
                i--;
            }
        }
        for (int k = 0; k < 7; k++) {
            if(numeroFinal[k]>numMayor){
                numMayor=numeroFinal[k];
            }
        }
        System.out.println("El número mas alto es:");
        System.out.println(numMayor);
    }
}

