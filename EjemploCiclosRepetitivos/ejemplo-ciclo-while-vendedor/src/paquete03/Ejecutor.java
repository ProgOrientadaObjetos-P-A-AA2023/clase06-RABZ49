/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        // Inicio de proceso iterativo 
        bandera = true;
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
                          // final.
        while(bandera==true){
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();
            
            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, 
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%sDatos de Vendedor\n" +
                    "Nombre: %s\n" +
                    "Edad: %s\n" +
                    "Salario mínimo: %.2f\n" +
                    "Número de autos: %d\n" +
                    "Pago mensual: %.2f\n\n", 
                    cadenaFinal,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());
            
            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + " salir");
            opcion = entrada.nextLine();
            if(opcion.equals("n")){
                bandera = false;
            }
                    
        }
        // cuando se sale del ciclo repetitivo debemos enviar toda la 
        // cadenaFinal a un archivo
        ArchivoEscritura archivo = new ArchivoEscritura(); // objeto para crear
                                                           // archivo 
        archivo.establecerNombreArchivo("informacion");
        archivo.establecerDataFinal(cadenaFinal);
        archivo.agregarRegistros();
    }
}
