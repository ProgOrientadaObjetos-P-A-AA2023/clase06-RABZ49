/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.util.Formatter;

public class ArchivoEscritura {
    private String nombreArchivo;
    private String dataFinal;
    private Formatter salidaArchivo;
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void establecerDataFinal(String n){
        dataFinal = n;
    }
    
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public String obtenereDataFinal(){
        return dataFinal;
    }
    
    // agrega registros al archivo
    public void agregarRegistros() {
        try {
            
            String rutaArchivo = String.format("data/%s.txt", 
                    obtenerNombreArchivo());
            salidaArchivo = new Formatter(rutaArchivo);
            
            salidaArchivo.format("%s", obtenereDataFinal());
            salidaArchivo.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);
            System.exit(1);

        }
    }
       

}
