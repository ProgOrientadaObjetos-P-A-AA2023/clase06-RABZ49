/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import paquete01.Calificacion;
import paquete01.LibretaCalificacion;
import paquete01.Profesor;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);

        String nombreEstudiante;
        double nota;
        String materia;
        Calificacion[] calificacionesEstudiante;
        int numerocalificaciones;
        String nombreProfesor;
        String tipoProfesor;

        // Ingreso de valores por teclado
        System.out.println("Ingrese el nombre del estudiante");
        nombreEstudiante = entrada.nextLine();
        System.out.println("Ingrese el número de calificaciones");
        numerocalificaciones = entrada.nextInt();

        entrada.nextLine();

        // con el numerocalificaciones se crea el objeto arreglo de
        // calificaciones tipo Calificacion
        calificacionesEstudiante = new Calificacion[numerocalificaciones];

        for (int i = 0; i < numerocalificaciones; i++) {
            System.out.printf("Ingrese nombre de materia %d\n", i + 1);
            materia = entrada.nextLine();
            System.out.printf("Ingrese calificación %d\n", i + 1);
            nota = entrada.nextDouble();
            entrada.nextLine();

            // con las variables nota y nombreEstudiante se procede
            // a crear un objeto de tipo Calificacion
            Calificacion cal = new Calificacion(nota, materia);
            //
            System.out.printf("Ingrese nombre del profesor %d\n", i + 1);
            nombreProfesor = entrada.nextLine();
            System.out.printf("Ingrese tipo de contrato del profesor %d\n", 
                    i + 1);
            tipoProfesor = entrada.nextLine();
            
            Profesor p1 = new Profesor(nombreProfesor, tipoProfesor);
            //
            // cal.establecerProfesor(new Profesor("René Elizalde", "contratado 1"));
            cal.establecerProfesor(p1);
            // Se agrega el objeto calificacion creado al arreglo
            // calificacionesEstudiante
            calificacionesEstudiante[i] = cal;

        }

        // con el ingreso del nombre del estudiante y el ingreso del conjunto
        // de calificaciones; se procede a crear el objeto de tipo
        // LibretaCalificacion
        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
                calificacionesEstudiante);
        // Se llama a los métodos que realizan el calculo del
        // promedio y promedio cualitativo
        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", libreta);
    }
}
