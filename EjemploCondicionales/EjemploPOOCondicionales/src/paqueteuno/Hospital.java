/*
 * características: nombre del hospital, ciudad del hospital, 
 *   número de camas, número de doctores, presupuesto anual.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Hospital {
    
    private String nombreHospital;
    private String ciudadHospital;
    private int numeroCamas;
    private int numeroDoctores;
    private double presupuestoAnual;
    
    // constructores 
    // Objetos para opción 1
    public Hospital(String nombre, int camas, int doctores, double presupueto){
        nombreHospital = nombre;
        numeroCamas = camas;
        numeroDoctores = doctores;
        presupuestoAnual = presupueto;
        // para este tipo de hospitales la ciudad por defecto será Quito
        ciudadHospital = "Quito";
    }
    
    // Objetos para opción 2
    public Hospital(String nombre, int camas, int doctores){
        nombreHospital = nombre;
        numeroCamas = camas;
        numeroDoctores = doctores;
        
        // para este tipo de hospitales la ciudad por defecto será Quito
        ciudadHospital = "Quito";
        // presupuesto anual será de 250 mil dolares con 10 centavos
        presupuestoAnual = 250000.10;
    }
    
    // Objetos para opción 3
    public Hospital(String nombre, String ciudad, int camas, int doctores, 
            double presupueto){
        nombreHospital = nombre;
        numeroCamas = camas;
        numeroDoctores = doctores;
        ciudadHospital = ciudad;
        presupuestoAnual = presupueto;
    }
    // métodos establecer para asignar valores a 
    // cada atributo
    public void establecerNombreHospital(String n){
        nombreHospital = n;
    }
    
    public void establecerCiudadHospital(String n){
        ciudadHospital = n;
    }
    
    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerPresupuestoAnual(double n){
        presupuestoAnual = n;
    }
    
    // métodos obtener, que permitan acceder a los valores de
    // cada atributo
    
    public String obtenerNombreHospital(){
        return nombreHospital;
    }
    
    public String obtenerCiudadHospital(){
        return ciudadHospital;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public double obtenerPresupuestoAnual(){
        return presupuestoAnual;
    }
    
    
    
    
}
