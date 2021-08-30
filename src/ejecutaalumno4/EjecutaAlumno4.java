//Ejercicio para hallar el promedio de un estudiante con 4 calificaciones.

package ejecutaalumno4;

import java.util.Scanner;
/**
 * 
 * @author ASUS
 */
public class EjecutaAlumno4 {

   
    public static void main(String[] args) 
    {
     String datoEntrada;
       String nombre;
       float c1, c2, c3, c4;

 
       Scanner entrada = new Scanner(System.in);

       Alumno4 objAlumno = new Alumno4();

       System.out.println("\n       CALCULA PROMEDIO DE UN ALUMNO\n");

 
       System.out.println("------------ Lectura de datos -------------");
       System.out.print("Teclee nombre: ");
       nombre = entrada.nextLine();

       System.out.print("Teclee calificacion 1: ");
       c1 = entrada.nextFloat();

       System.out.print("Teclee calificacion 2: ");
       c2 = entrada.nextFloat();

       System.out.print("Teclee calificacion 3: ");
       c3 = entrada.nextFloat();

       System.out.print("Teclee calificacion 4: ");
       c4 = entrada.nextFloat();

 
       objAlumno.establecerNombreAlum(nombre);
       objAlumno.establecerCalif1(c1);
       objAlumno.establecerCalif2(c2);
       objAlumno.establecerCalif3(c3);
       objAlumno.establecerCalif4(c4);

       objAlumno.calcularPromedio();
       objAlumno.calcularObservacion();
       
       System.out.println("\n--------------- Resultados ----------------");
       System.out.println("Nombre = " + objAlumno.obtenerNombreAlum());
       System.out.println("Promedio = " + objAlumno.obtenerPromedio());
       System.out.println("Observacion = " + objAlumno.obtenerObservacion());
   }
}

    
    

