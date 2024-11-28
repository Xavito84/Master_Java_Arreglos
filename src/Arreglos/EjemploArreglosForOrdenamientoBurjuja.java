package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurjuja {
    public static void arregloInverso(String[] arreglo){
        int total2= arreglo.length;
        int total= arreglo.length;

        for(int i = 0; i < total2; i++){
            String actual= arreglo[i];
            String inversos= arreglo[total -1 -i];
            arreglo[i]= inversos;
            arreglo[total -1-i] = actual;
            total2--;

        }
    }
    public static void main(String[] args) {


        String[] productos = {"Kingston pendrive 64GB", "Samsung Galaxy","Disco duro SSD Samsung External","Asus Notebook","Macbook Air","Chromecast","Bici Camera"};

        int total= productos.length;

        int contador=0;

        for(int i = 0; i < total -1; i++){

            for(int j = 0; j < total-1 -i; j++){
                if(productos[j+1].compareTo(productos[j])<0){
                    String auxiliar = productos[j];
                    productos[j]= productos[j+1];
                    productos[j+1]= auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

        //Ordenar productos por orden alfabetico
        //Arrays.sort(productos);
        //arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos)); // con API Collections
        System.out.println("----Usando for ----------------");
        for(int i = 0; i < total; i++){
            System.out.println("para indice "+ i+ " : "+ productos[i]);


            int[] numeros= new int[4]; //si lo pasas a integer no tienes luego que castear
            //inicializar datos
            numeros[0]=10;
            numeros[1]=7;
            numeros[2]=35;
            numeros[3]=4;


            int contador2=0;
            for(int k = 0; k < numeros.length -1; k++){

                for(int j = 0; j < numeros.length-1 -k; j++){
                    if(((Integer)numeros[j+1]).compareTo(numeros[j])<0){ //casteo poniendo el Integer
                        int auxiliar = numeros[j];
                        numeros[j]= numeros[j+1];
                        numeros[j+1]= auxiliar;
                    }
                    contador2++;
                }
            }
            for(int l = 0; l < numeros.length; l++){
                System.out.println("l = " + l+" : "+ numeros[l]);
            }



        }








    }
}
