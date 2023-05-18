/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class LibretaCalificacion {
    
    private String estudiante;
    private double promedio;
    private String promedioCualitativo;
    
    private Calificacion [] calificaciones; // {new Calificacion(10.2, "Matematicas"), new Calificacion(7.9, "Programación")}
   
    
    public LibretaCalificacion(String n, Calificacion [] c){
        estudiante = n;
        calificaciones = c;
    }
    
    public void establecerEstudiante(String n){
        estudiante = n;
    }
    
    public void establecerPromedio(){
        double suma = 0;
        
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            suma = suma + obtenerCalificaciones()[i].obtenerNota();
            
        }
        
        promedio = suma/obtenerCalificaciones().length;
    }
    
    public void establecerPromedioCualitativo(){
        if((obtenerPromedio()>=0)&&(obtenerPromedio()<=3.09)){
            promedioCualitativo = "Regular";
        }else{
            if((obtenerPromedio()>=3.1)&&(obtenerPromedio()<=5.09)){
                promedioCualitativo = "Insuficiente";
            }else{
                if((obtenerPromedio()>=5.1)&&(obtenerPromedio()<=7.09)){
                    promedioCualitativo = "Bueno";
                }else{
                    if((obtenerPromedio()>=7.1)&&(obtenerPromedio()<=9.09)){
                        promedioCualitativo = "Muy bueno";
                    }else{
                        if((obtenerPromedio()>=9.1)&&(obtenerPromedio()<=10)){
                            promedioCualitativo = "Sobresaliente";
                        }else{
                            promedioCualitativo = "Sin rango";
                        }
                    }
                }
            }
        }
    }
    
    public void establecerCalificaciones(Calificacion [] n){
        calificaciones = n;
    }
    
    public String obtenerEstudiante(){
        return estudiante;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    public String obtenerPromedioCualitativo(){
        return promedioCualitativo;
    }
    
    public Calificacion [] obtenerCalificaciones(){
        return calificaciones;
    }
    
    @Override
    public String toString(){
        /*
        Libreta de Calificaciones
        Nombre: Roger Williams
        Calificaciones:
            Matemáticas [8] - Rolando Elizalde - contratado 1
            Ciencias Naturales [10] - Ana Garcia - contratado 2
            Literatura [9.2] - Marco Romero - contratado 1
        
        Promedio calificaciones: 9.07
        Promedio cuantitativo: Muy bueno
        
        */
        
               
        String cadena = "Libreta de Calificaciones\n";
        cadena = String.format("%sNombre: %s\nCalificaciones:\n", cadena, 
                obtenerEstudiante());
        
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            cadena = String.format("%s\t\t%s [%.2f] - %s - %s\n", cadena, 
                    obtenerCalificaciones()[i].obtenerNombreMateria(),
                    obtenerCalificaciones()[i].obtenerNota(),
                    obtenerCalificaciones()[i].obtenerProfesor().obtenerNombre(),
                    obtenerCalificaciones()[i].obtenerProfesor().obtenerTipo());
        }
        cadena = String.format("%sPromedio calificaciones: %.2f\n"
                + "Promedio cualitativo: %s\n",  
                cadena, obtenerPromedio(), obtenerPromedioCualitativo());
        return cadena;
    }
}
