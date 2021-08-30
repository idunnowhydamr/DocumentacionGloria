//CLIENTE CALCULO 

package ejecutacliente2;

import java.util.Scanner;
/**
 * 
 * @author ASUS
 */
public class EjecutaCliente2 {

   
    public static void main(String[] args) {
       String datoEntrada;
       String nomCli;
       int    tiCli, cant;        
       float  preUni;

       Scanner entrada = new Scanner(System.in);

   
       Cliente2 objCliente = new Cliente2();

       System.out.println("\n      REALIZA CALCULOS DE UN CLIENTE\n");

 
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee nombre: ");
       nomCli = entrada.nextLine();

       System.out.print("Teclee tipo de cliente (1-4): ");
       tiCli = entrada.nextInt();

       System.out.print("Teclee cantidad de piezas compradas: ");
       cant = entrada.nextInt();

       System.out.print("Teclee precio unitario: ");
       preUni = entrada.nextFloat();

   
       objCliente.establecerNombreClie(nomCli);
       objCliente.establecerTipoClie(tiCli);
       objCliente.establecerCantidad(cant);
       objCliente.establecerPrecioUni(preUni);


       objCliente.calcularSubTotal();
       objCliente.calcularDescuento();
       objCliente.calcularNetoPagar();

 
       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("Nombre = " + objCliente.obtenerNombreClie());
       System.out.println("Subtotal = " + objCliente.obtenerSubTotal());
       System.out.println("Descuento = " + objCliente.obtenerDescuento());
       System.out.println("Neto a pagar = " + objCliente.obtenerNetoPagar());
   }
}
    
    

