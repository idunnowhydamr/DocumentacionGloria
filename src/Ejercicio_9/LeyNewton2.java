
package Ejercicio_9;

/**
 *  En este codigo se crean las variables que usaremos, además que realizamos los calculos necesarios. 
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */

// Se crean las clases que usaremos en la actividad.
class LeyNewton2 {
    private double fuerza;
     private double masa;
     private double aceleracion; 

     // en este metodo se guarda la fuerza.
     public void establecerFuerza(double fu)
     {
        fuerza = fu;    
     }
    // En este metodo se guarda la masa.
     public void establecerMasa(double ma)
     {
        masa = ma;    
     }
     // en este metodo se guarda la celeración.
     public void establecerAceleracion(double acel)
     {
        aceleracion = acel;    
     }
     // En este metodo se calcula la fuerza.
     public void calcularFuerza()
     {
        fuerza = masa * aceleracion;    
     }
     // En este metodo se calcula la masa.
     public void calcularMasa()
     {
        masa = fuerza / aceleracion;    
     }
     // En este metodo se calcula la aceleración.
     public void calcularAceleracion()
     {
        aceleracion = fuerza / masa;    
     }
 
  // Metodos de acceso a los datos -getters-

     // En este metodo se muestra la fuerza.
     public double obtenerFuerza()
     {
        return fuerza;
     }
     // En este metodo se muestra la masa.
     public double obtenerMasa()
     {
        return masa;
     }
     // En este metodo se muestra la aceleracion.
     public double obtenerAceleracion()
     {
        return aceleracion;
     }
}
