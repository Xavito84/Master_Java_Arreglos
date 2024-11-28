package Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros= new int[10];
        int []a= new int[10];

        int total= numeros.length;
        int total2= a.length;

        for (int i=0; i<total; i++){
            numeros[i]= i+1;
        }

        for ( int i=0; i <total/2; i++){ //si lo divides en dos esta correcto si no se repite o poner -i
            System.out.print(numeros[i]+ " ");
            System.out.println(numeros[total -1 -i]);

        }
        System.out.println("----------------------------------------------------");
        int aux=0;
        for(int i=0; i<total/2; i++){
            a[aux++]= numeros[i];
            a[aux++]= numeros[total -1 -i];
        }

        for (int i=0; i<total2; i++){
            System.out.println("i = "+i+ " valor: " + a[i]);

        }

    }
}
