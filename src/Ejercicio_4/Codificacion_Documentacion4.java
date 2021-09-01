/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;
// Se importa el escaner para pedir datos por el teclado.
import java.util.Scanner;

/**
 *
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA 
 */
public class Codificacion_Documentacion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = crear();
        mostrar(estudiante);
    
    }

    private static Estudiante crear() {
      String nombre = null;
      // se crea la variable nombre.
      String facultad = null;
      // se crea la variable facultad.
      double matricula = 0;
      // se crea la variable matricula.
      int estrato;
      // se crea la variable estrato.
      double pagoBachillerato = 0;
      // se crea la variable psgoBachillerato.
      String planEstudio = null;
      // se crea la variable planEstudio.
      Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        // se pide el nombre del estudiante.
        nombre = leer.next();
        //Se guarda el nombre.
        System.out.println("facultad: ");
        //Se pide la facultad.
        facultad = leer.next();
        //Se guarda la facultad.
        System.out.println("Plan Estudio: ");
        // Se pide el plan de estudios.
        planEstudio = leer.next();
        //se guarda elplan de estudios.
        System.out.println("Matricula: " + "Excepcion administracion colocar 0");
        // Se pide la matricula al estudiante.
        matricula = leer.nextDouble();
        // Se guarda la variable matricula.
        System.out.println("Estrato: ");
        // Se pide el estrato.
        estrato = leer.nextInt();
        // Se guarda la variable estrato.
        System.out.println("Pago bachillerato: ");
        // Se pide el pago del bachillerato.
        pagoBachillerato = leer.nextDouble();
        // Se guarda el pago del bachillerato.
        
        // Se crea este metodo para guardar los datos del estudiante.
        Estudiante estudiante =  new Estudiante( nombre,  matricula,  facultad, planEstudio, estrato, pagoBachillerato);
        return estudiante;
    }
    // Con este metodo se muestran los datos del estudiante al completo. 
    private static void mostrar(Estudiante estudiante) {
        System.out.println("---------------");
        System.out.println("nombre: "+ estudiante.getNombre());
        System.out.println("descuento: " + estudiante.descuentoFacultad());
        System.out.println("recargo: " + estudiante.recargoFacultad());
        System.out.println("matricula: " + estudiante.getMatricula());
        System.out.println("pago: " + estudiante.pagoTotal());
    }
    
}
