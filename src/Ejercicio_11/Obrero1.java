
package Ejercicio_11;

/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
class Obrero1 {
    //Declarion de variables.
    private String nombreObr;
     private int produccion;
     private float sueldo;

     //Se establece el nombre.
     public void establecerNombreObr(String nom)
     {
        nombreObr = nom;    
     }
     //Se establece la produccion.
     public void establecerProduccion(int prod)
     {
        produccion = prod;    
     }
     //Metodo para calcular el sueldo.
     public void calcularSueldo()
     {
        if (produccion <= 500)
           sueldo = produccion * 20.00F;
        if (produccion > 500 && produccion <= 800) 
           sueldo = produccion * 25.00F;
        if (produccion > 800)
           sueldo = produccion * 30.00F;
     } 

    //Se obtiene el nombre.
     public String obtenerNombreObr()
     {
        return nombreObr;
     }
     
    //Se obtiene la produccion.
     public int obtenerProduccion()
     {
        return produccion;
     }
    
     //Se obtiene el sueldo.
     public float obtenerSueldo()
     {
        return sueldo;
     }
}


