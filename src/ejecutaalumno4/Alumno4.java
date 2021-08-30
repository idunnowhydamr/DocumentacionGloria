
package ejecutaalumno4;

/**
 * 
 * @author ASUS
 */
class Alumno4 
{
    
     private String nombreAlum;
     private float calif1;
     private float calif2;
     private float calif3;
     private float calif4;
     private float promedio; 



     public void establecerNombreAlum(String nom)
     {
        nombreAlum = nom;    
     }

     public void establecerCalif1(float ca1)
     {
        calif1 = ca1;    
     }

     public void establecerCalif2(float ca2)
     {
        calif2 = ca2;    
     }

     public void establecerCalif3(float ca3)
     {
        calif3 = ca3;    
     }

     public void establecerCalif4(float ca4)
     {
        calif4 = ca4;    
     }

     public void calcularPromedio()
     {
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;    
     }
 
     public void calcularObservacion()
     {
         String Observacion;
         if (promedio >=60)
             Observacion = "Aprobado";
         else
             Observacion = "Reprobado";
     }
             
     public String obtenerNombreAlum()
     {
        return nombreAlum;
     }

     public float obtenerPromedio()
     {
        return promedio;
     }

    String obtenerObservacion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


