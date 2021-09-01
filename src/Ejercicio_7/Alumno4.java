
package Ejercicio_7;

/**
 * en este codigo  podemos ver las variables para pode guardar los datos del alumnoy también
 * podemos hacer las operaciones necesarias.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
class Alumno4 
{
    // Se crean las clases que usaremos para poder sacar la informacio del alumno
     private String nombreAlum;
     private float calif1;
     private float calif2;
     private float calif3;
     private float calif4;
     private float promedio; 


     // Con esta clase se establece el nombre del alumno.
     public void establecerNombreAlum(String nom)
     {
        nombreAlum = nom;    
     }
     // Con esta clase se establece la calificacion uno del estudiante.
     public void establecerCalif1(float ca1)
     {
        calif1 = ca1;    
     }
     // Con esta clase se establece la calificacion dos del estudiante.
     public void establecerCalif2(float ca2)
     {
        calif2 = ca2;    
     }
     // Con esta clase se establece la calificacion tres del estudiante.
     public void establecerCalif3(float ca3)
     {
        calif3 = ca3;    
     }
    //  Con esta clase se establece la calificacion cuatro del estudiante.
     public void establecerCalif4(float ca4)
     {
        calif4 = ca4;    
     }
     // Con esta clase se calcula el promedio de las notas del estdudiante.
     public void calcularPromedio()
     {
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;    
     }
     // Con este metodo podemos decir  si el estudiante aprueba o reprueba.
     public void calcularObservacion()
     {
         String Observacion;
         if (promedio >=60)
             Observacion = "Aprobado";
         else
             Observacion = "Reprobado";
     }
      //Con esta clase podemos mostrar el nombre del estudiante.     
     public String obtenerNombreAlum()
     {
        return nombreAlum;
     }
     // Con este metodo mostramos la nota proomedio del estudiante.
     public float obtenerPromedio()
     {
        return promedio;
     }
    
    String obtenerObservacion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


