
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Codificacion_Documentacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador trabajador = crear();
        mostrar(trabajador);
    }

    private static Trabajador crear() {
        String nombre = null;
        String categoria = null;
        String condicion = null;
        double sueldo = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Insertar nombre: ");
        nombre = leer.next();
        System.out.println("Insertar sueldo: ");
        sueldo = leer.nextDouble();
        System.out.println("Insertar condicion: " + "SI Estable/NO Estable" + ": ");
        condicion = leer.next();
        System.out.println("Insertar categoria: " + "A B C D" + ": ");
        categoria = leer.next();
        Trabajador trabajador = new Trabajador(nombre, sueldo, categoria, condicion);
        return trabajador;
    }

    private static void mostrar(Trabajador trabajador) {
        System.out.println("---------------------------------------");
        System.out.println("Informe del Trabajador: ");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Sueldo: " + trabajador.getSueldo());
        System.out.println("Bonificacion: " + trabajador.bonificacionTrabajador());
        System.out.println("Descuento: " + trabajador.descuentoTrabajador());
        System.out.println("Pago Total: " + trabajador.pagoTotal());
        System.out.println("---------------------------------------");
    }
    
}
