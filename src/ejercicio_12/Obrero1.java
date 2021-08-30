
package ejercicio_12;

/**
 * 
 * @author ASUS
 */
class Obrero1 {
    private String nombreObr;
     private int produccion;
     private float sueldo;


     public void establecerNombreObr(String nom)
     {
        nombreObr = nom;    
     }

     public void establecerProduccion(int prod)
     {
        produccion = prod;    
     }
 
     public void calcularSueldo()
     {
        if (produccion <= 500)
           sueldo = produccion * 20.00F;
        if (produccion > 500 && produccion <= 800) 
           sueldo = produccion * 25.00F;
        if (produccion > 800)
           sueldo = produccion * 30.00F;
     } 


     public String obtenerNombreObr()
     {
        return nombreObr;
     }

     public int obtenerProduccion()
     {
        return produccion;
     }

     public float obtenerSueldo()
     {
        return sueldo;
     }
}


