package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double [] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas=0, sumNotasHistoria=0, sumNotasLenguaje=0;
        claseMatematicas= new double[7];
        claseHistoria= new double[7];
        claseLenguaje= new double[7];

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese las 7 notas de matemáticas:");
        for (int i=0; i< claseMatematicas.length; i++) {
            claseMatematicas[i]= sc.nextDouble();
        }
        System.out.println("Ingrese las 7 notas de historia:");
        for (int i=0; i< claseHistoria.length; i++) {
            claseHistoria[i]= sc.nextDouble();
        }
        System.out.println("Ingrese las 7 notas de lenguaje:");
        for (int i=0; i< claseLenguaje.length; i++) {
            claseLenguaje[i]= sc.nextDouble();
        }

        for (int i=0; i< 7; i++) {
            sumNotasMatematicas+= claseMatematicas[i];
            sumNotasHistoria+= claseHistoria[i];
            sumNotasLenguaje+= claseLenguaje[i];
        }

        double promedioMatematicas= (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria= (sumNotasHistoria/claseHistoria.length);
        double promedioLenjuaje= (sumNotasLenguaje/claseLenguaje.length);

        System.out.println("Promedio clase matemáticas: "+promedioMatematicas );
        System.out.println("Promedio clase historia: "+ promedioHistoria);
        System.out.println("Promedio clase lenguaje: "+ promedioLenjuaje);
        System.out.println("Promedio total del curso: "+ (promedioMatematicas+promedioHistoria+promedioLenjuaje)/3);

        System.out.println("Ingrese el identificador del alumno ( de 0 a 6): ");
        int id= sc.nextInt();
        double promedioAlumno= (claseMatematicas[id]+ claseHistoria[id]+ claseLenguaje[id])/3;
        System.out.println("El promedio del Alumno: "+ id+ " es de:"+ promedioAlumno);
    }
}
