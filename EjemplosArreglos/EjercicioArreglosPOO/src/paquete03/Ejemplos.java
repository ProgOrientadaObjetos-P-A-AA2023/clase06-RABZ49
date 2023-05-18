/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Ejemplos {
    public static void main(String[] args) {
        // Declaración de arreglos
        String [] lista = new String[3];
        lista[0] = "Loja";
        lista[1] = "Quito";
        lista[2] = "Cuenca";
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        
        for (String lista1 : lista) {
            System.out.println(lista1);
        }
                
    }
}
