
package Ejercicio_8;
// Se importa el escaner para pedir datos por teclado.
import java.util.Scanner;
/**
 *  Con este codigo podemos pedir datos al cliente e imprimir el nombre, subtotal y el descuento a pagar, 
 * estos datos dependen del tipo del cliente y la cantidad del producto que compra.
 * 
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class EjecutaCliente2 {

   
    public static void main(String[] args) {
       String datoEntrada;
       // Se crea la variable datoEntrada.
       String nomCli;
       // Se crea la variable nombre del cliente.
       int    tiCli, cant;        
       // Se crean las variables tipo de cliente y cantidad.
       float  preUni;
       // Se crea la variable de precio unitario
       Scanner entrada = new Scanner(System.in);

   
       Cliente2 objCliente = new Cliente2();

       System.out.println("\n      REALIZA CALCULOS DE UN CLIENTE\n");
      
 
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee nombre: ");
       // Se pide que se ingrese el nombre.
       nomCli = entrada.nextLine();
       // Se guarda el nombre del cliente.
       System.out.print("Teclee tipo de cliente (1-4): ");
       // Se pide el tipo de cliente.
       tiCli = entrada.nextInt();
       // Se guarda el tipo de cliente.
       System.out.print("Teclee cantidad de piezas compradas: ");
       //Se pide la cantidad de piezas compradas.
       cant = entrada.nextInt();
       // Se guarda la cntidad de piezas.
       System.out.print("Teclee precio unitario: ");
       // Se pide el precio unitario.
       preUni = entrada.nextFloat();
       // Se guarda el precio unitario.

      // Se crean los objetos para guardar los datos del cliente.
       objCliente.establecerNombreClie(nomCli);
       objCliente.establecerTipoClie(tiCli);
       objCliente.establecerCantidad(cant);
       objCliente.establecerPrecioUni(preUni);
       objCliente.calcularSubTotal();
       objCliente.calcularDescuento();
       objCliente.calcularNetoPagar();

      // Se imprimen los resultados del cliente.
       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("Nombre = " + objCliente.obtenerNombreClie());
       System.out.println("Subtotal = " + objCliente.obtenerSubTotal());
       System.out.println("Descuento = " + objCliente.obtenerDescuento());
       System.out.println("Neto a pagar = " + objCliente.obtenerNetoPagar());
   }
}
    
    

