/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;
import paquete01.LibretaCalificacion;
import paquete04.Colegio;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreEstudiante;
        String nombreColegio;
        String nombreCiudad;
        double [] calificacionesEstudiante;
        int numerocalificaciones;
        
        // Ingreso de valores por teclado
        System.out.println("Ingrese el nombre del estudiante");
        nombreEstudiante = entrada.nextLine();
        System.out.println("Ingrese el número de calificaciones");
        numerocalificaciones = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del colegio: ");
        nombreColegio = entrada.nextLine();
        System.out.println("ingrese el nombre de la ciudad: ");
        nombreCiudad = entrada.nextLine();
        // con el numerocalificaciones se crea el objeto arreglo de
        // calificaciones tipo double
        calificacionesEstudiante = new double[numerocalificaciones];
        
        for (int i = 0; i < numerocalificaciones; i++) {
            System.out.printf("Ingrese calificación %d\n", i+1);
            calificacionesEstudiante[i] = entrada.nextDouble();
        }
        
        // con el ingreso del nombre del estudiante y el ingreso del conjunto
        // de calificaciones; se procede a crear el objeto de tipo
        // LibretaCalificacion
        Colegio colegio = new Colegio(nombreColegio, nombreCiudad);
        LibretaCalificacion libreta = new LibretaCalificacion(
                nombreEstudiante,
                calificacionesEstudiante,colegio);
        // Se llama a los métodos que realizan el calculo del
        // promedio y promedio cualitativo
        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", libreta);
    }
}
