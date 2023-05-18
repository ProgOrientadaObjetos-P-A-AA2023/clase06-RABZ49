/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class LibretaCalificacion {

    private String estudiante;
    private double promedio;
    private String promedioCualitativo;
    private Calificacion[] calificaciones;

    public LibretaCalificacion(String n, Calificacion[] c) {
        estudiante = n;
        calificaciones = c;
    }

    public void establecerEstudiante(String n) {
        estudiante = n;
    }

    public void establecerPromedio() {
        double suma = 0;

        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            suma = suma + obtenerCalificaciones()[i].obtenerNota();
        }

        promedio = suma / obtenerCalificaciones().length;
    }

    public void establecerPromedioCualitativo() {
        if ((obtenerPromedio() >= 0) && (obtenerPromedio() <= 3.09)) {
            promedioCualitativo = "Regular";
        } else {
            if ((obtenerPromedio() >= 3.1) && (obtenerPromedio() <= 5.09)) {
                promedioCualitativo = "Insuficiente";
            } else {
                if ((obtenerPromedio() >= 5.1) && (obtenerPromedio() <= 7.09)) {
                    promedioCualitativo = "Bueno";
                } else {
                    if ((obtenerPromedio() >= 7.1) && (obtenerPromedio() <= 9.09)) {
                        promedioCualitativo = "Muy bueno";
                    } else {
                        if ((obtenerPromedio() >= 9.1) && (obtenerPromedio() <= 10)) {
                            promedioCualitativo = "Sobresaliente";
                        } else {
                            promedioCualitativo = "Sin rango";
                        }
                    }
                }
            }
        }
    }

    public void establecerCalificaciones(Calificacion[] n) {
        calificaciones = n;
    }

    public String obtenerEstudiante() {
        return estudiante;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String obtenerPromedioCualitativo() {
        return promedioCualitativo;
    }

    public Calificacion[] obtenerCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        String cadena = "Libreta de Calificaciones\n";
        cadena = String.format("%sNombre: %s\nCalificaciones:\n", cadena,
                obtenerEstudiante());
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            cadena = String.format("%s\t\t%s - %s [%.2f]\n", cadena,
                    obtenerCalificaciones()[i].obtenerProfesor().obtenerNombre(),
                    obtenerCalificaciones()[i].obtenerNombreMateria(),
                    obtenerCalificaciones()[i].obtenerNota());
        }
        cadena = String.format("%sPromedio calificaciones: %.2f\n"
                + "Promedio cuantitativo: %s\n",
                cadena, obtenerPromedio(), obtenerPromedioCualitativo());
        return cadena;
    }
}
