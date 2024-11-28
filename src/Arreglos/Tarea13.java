package Arreglos;

import java.util.Scanner;

public class Tarea13 {
    /*
    Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
     */
    public static void main(String[] args) {

        int [] numero = new int[10];
        int total= numero.length;

        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < total; i++) {
            System.out.print("Inserte un numero: " );
            numero[i]= sc.nextInt();
        }

        for (int i=0; i<total/2; i++){
            System.out.print(numero[total -1 -i]+ "------");
            System.out.println(numero[i]);;
        }



    }
}
