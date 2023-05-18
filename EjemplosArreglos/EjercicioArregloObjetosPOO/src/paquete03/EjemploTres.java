/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class EjemploTres {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Roberto B", "Nombramiento");
        Profesor profesor2 = new Profesor("Luis", "contrarto");
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación",profesor1), 
            new Calificacion(9, "Electrónica",profesor2)};
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f con profesor %s tipo de contrato: %s\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
        }
        
    }
}
