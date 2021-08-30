//Ejercicio para hallar el promedio de un estudiante con 4 calificaciones.

package ejercicio_7;
// Se importa el escaner para pedir datos por teclado.
import java.util.Scanner;
/**
 *  en este codigo podemos ingresar los datos del alumno y  al final imprimir nombre, promedio y la observación.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class EjecutaAlumno4 {

   
    public static void main(String[] args) 
    {
     String datoEntrada;
     // Se crea la variable de dato de entreda.
       String nombre;
       // Se crea la variable nombre.
       float c1, c2, c3, c4;
       // Se crean las variables de las calificaciones.

 
       Scanner entrada = new Scanner(System.in);

       Alumno4 objAlumno = new Alumno4();

       System.out.println("\n       CALCULA PROMEDIO DE UN ALUMNO\n");

 
       System.out.println("------------ Lectura de datos -------------");
       System.out.print("Teclee nombre: ");
       // Se pide el nombre.
       nombre = entrada.nextLine();
       // Se guarda la variable nombre.
       
       System.out.print("Teclee calificacion 1: ");
       // Se pide la calificacion uno.
       c1 = entrada.nextFloat();
       // Se guarda la calificacion uno.
       System.out.print("Teclee calificacion 2: ");
       // Se pide la calificacion dos.
       c2 = entrada.nextFloat();
        // Se guarda la calificacion dos.
       System.out.print("Teclee calificacion 3: ");
       // Se pide la calificacion tres.
       c3 = entrada.nextFloat();
        // Se guarda la calificacion tres.
       System.out.print("Teclee calificacion 4: ");
        // Se pide la calificacion cuatro.
       c4 = entrada.nextFloat();
        // Se guarda la calificacion cuatro.
     // Se crean los objetos de las variables pedidas para llamarlas.
       objAlumno.establecerNombreAlum(nombre);
       objAlumno.establecerCalif1(c1);
       objAlumno.establecerCalif2(c2);
       objAlumno.establecerCalif3(c3);
       objAlumno.establecerCalif4(c4);

       objAlumno.calcularPromedio();
       objAlumno.calcularObservacion();
       
       // Se Imprimen los resultados pedidos 
       System.out.println("\n--------------- Resultados ----------------");
       System.out.println("Nombre = " + objAlumno.obtenerNombreAlum());
       System.out.println("Promedio = " + objAlumno.obtenerPromedio());
       System.out.println("Observacion = " + objAlumno.obtenerObservacion());
   }
}

    
    

