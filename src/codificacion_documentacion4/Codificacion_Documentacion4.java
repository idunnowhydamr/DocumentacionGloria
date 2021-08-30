/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacion_documentacion4;

import java.util.Scanner;

/**
 *
 * @author ASUS
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
      String facultad = null;
      double matricula = 0;
      int estrato;
      double pagoBachillerato = 0;
      String planEstudio = null;
      Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = leer.next();
        System.out.println("facultad: ");
        facultad = leer.next();
        System.out.println("Plan Estudio: ");
        planEstudio = leer.next();
        System.out.println("Matricula: " + "Excepcion administracion colocar 0");
        matricula = leer.nextDouble();
        System.out.println("Estrato: ");
        estrato = leer.nextInt();
        System.out.println("Pago bachillerato: ");
        pagoBachillerato = leer.nextDouble();
        Estudiante estudiante =  new Estudiante( nombre,  matricula,  facultad, planEstudio, estrato, pagoBachillerato);
        return estudiante;
    }

    private static void mostrar(Estudiante estudiante) {
        System.out.println("---------------");
        System.out.println("nombre: "+ estudiante.getNombre());
        System.out.println("descuento: " + estudiante.descuentoFacultad());
        System.out.println("recargo: " + estudiante.recargoFacultad());
        System.out.println("matricula: " + estudiante.getMatricula());
        System.out.println("pago: " + estudiante.pagoTotal());
    }
    
}
