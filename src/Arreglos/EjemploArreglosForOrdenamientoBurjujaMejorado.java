package Arreglos;

public class EjemploArreglosForOrdenamientoBurjujaMejorado {
    public static void sortBurbja(Object[] arreglo) {

        int total = arreglo.length;
        int contador = 0;
        for (int k = 0; k < total - 1; k++) {

            for (int j = 0; j < total - 1 - k; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) { //casteo poniendo el Comparable y para poner ascendete o descendete seria cambiar el > por <
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
    }

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inversos = arreglo[total - 1 - i];
            arreglo[i] = inversos;
            arreglo[total - 1 - i] = actual;
            total2--;

        }
    }

    public static void main(String[] args) {


        String[] productos = {"Kingston pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung External", "Asus Notebook", "Macbook Air", "Chromecast", "Bici Camera"};

        int total = productos.length;

        sortBurbja(productos);

        System.out.println("----Usando for ----------------");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);

        }
        Integer[] numeros = new Integer[4]; //si lo pasas a integer no tienes luego que castear
        //inicializar datos
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = 4;

        sortBurbja(numeros);

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("j = " + j + " : " + numeros[j]);
        }


    }
}
