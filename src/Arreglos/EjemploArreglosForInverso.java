package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String [] productos = new String[7];

        String[] productos = {"Kingston pendrive 64GB", "Samsung Galaxy","Disco duro SSD Samsung External","Asus Notebook","Macbook Air","Chromecast","Bici Camera"};

        int total= productos.length;


        /*productos[0] = "Kingston pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung External";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bici Camera";*/

        //Ordenar productos por orden alfabetico
        Arrays.sort(productos);

        System.out.println("----Usando for ----------------");
        for(int i = 0; i < total; i++){
            System.out.println("para indice "+ i+ " : "+ productos[i]);

        }
        System.out.println("---------- Usando For Inverso---------------------");
        for(int i = 0; i < total; i++){
            System.out.println("para i= "+ (total-1-i)+ " valor: "+ productos[total-1-i]);
        }

        System.out.println("---------- Usando For Inverso  2---------------------");
        for(int i = total -1; i >=0; i--){
            System.out.println("Para i= "+ i+ " valor: "+ productos[i]);
        }




    }
}
