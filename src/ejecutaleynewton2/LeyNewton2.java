
package ejecutaleynewton2;

/**
 * 
 * @author ASUS
 */
class LeyNewton2 {
    private double fuerza;
     private double masa;
     private double aceleracion; 


     public void establecerFuerza(double fu)
     {
        fuerza = fu;    
     }

     public void establecerMasa(double ma)
     {
        masa = ma;    
     }

     public void establecerAceleracion(double acel)
     {
        aceleracion = acel;    
     }

     public void calcularFuerza()
     {
        fuerza = masa * aceleracion;    
     }

     public void calcularMasa()
     {
        masa = fuerza / aceleracion;    
     }

     public void calcularAceleracion()
     {
        aceleracion = fuerza / masa;    
     }
 
  // Metodos de acceso a los datos -getters-

     public double obtenerFuerza()
     {
        return fuerza;
     }

     public double obtenerMasa()
     {
        return masa;
     }

     public double obtenerAceleracion()
     {
        return aceleracion;
     }
}
