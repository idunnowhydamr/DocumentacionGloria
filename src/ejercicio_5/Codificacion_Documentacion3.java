
package ejercicio_5;
// Se importa rl escaner para poder pedir los datos desde el teclado.
import java.util.Scanner;

/**
 *  Con este codigo podemos calcular el pago total del trabajador dependiendo de la condición y la categoria, 
 * además se mostrará informe que contendrá el pago total,el descuento, la bonificación y el nombre.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA 
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
        // Se crea la variable nombre.
        String categoria = null;
        // Se crea la variable categoria.
        String condicion = null;
        // Se crea la variable condición.
        double sueldo = 0;
        // Se crea la variable sueldo.
        Scanner leer = new Scanner(System.in);
        // se pide el nombre del empleado.
        System.out.println("Insertar nombre: ");
        // Se guarda en la variable.
        nombre = leer.next();
        // Se pide el suldo.
        System.out.println("Insertar sueldo: ");
        // Se guarda en la variable sueldo.
        sueldo = leer.nextDouble();
        // Se pide la condición.
        System.out.println("Insertar condicion: " + "SI Estable/NO Estable" + ": ");
        // Se guarda la condición.
        condicion = leer.next();
        // Se inserta la categoria.
        System.out.println("Insertar categoria: " + "A B C D" + ": ");
        // Se guarda la categoria.
        categoria = leer.next();
        // En este metodo se guardan los datos.
        Trabajador trabajador = new Trabajador(nombre, sueldo, categoria, condicion);
        return trabajador;
    }
    // Este metodo es para imprimir los datos del trabajador.
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
