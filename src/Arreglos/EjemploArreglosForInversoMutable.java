package Arreglos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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




        //Ordenar productos por orden alfabetico
        Arrays.sort(productos);

        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos)); // con API Collections
        System.out.println("----Usando for ----------------");
        for(int i = 0; i < total; i++){
            System.out.println("para indice "+ i+ " : "+ productos[i]);

        }








    }
}
