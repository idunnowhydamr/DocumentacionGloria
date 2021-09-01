//VENDEDORES DE AUTOS

package Ejercicio_12;

import java.util.Scanner;
/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class EjecutaVendedor {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        //Se declaran las variables.
       String nombre, entradaChar;
        char desea, otro;
        int totAutos, totVend;
        float precioAuto, salMin, sueldo, totSueldos, totVendido;

       //Intancia para escaner
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nPROCESA LAS VENTAS DE VENDEDORES DE AUTOS\n");
       //Se pide el salario del vendedor.
       System.out.print("Teclee salario minimo quincenal: ");
       salMin = entrada.nextFloat();
       entrada.nextLine();

       System.out.println("\n             NOMINA QUINCENAL");
       System.out.println("       NOMBRE                     SUELDO");
       System.out.println("------------------------------------------");
       totSueldos = 0;
       totVend = 0;
       do
       {
           //Se intancia el objeto vendedor.
           Vendedor objVendedor = new Vendedor();

           //Se pide la informacion sobre el obrero.
           System.out.println("\n------------ Entrada de datos ------------");
           System.out.print("Teclee nombre: ");
           nombre = entrada.nextLine();
 
           totAutos = 0;
           totVendido = 0;
           /*Se pregunta si se vendio auto o no para almacenar el precio.
            *Se repite hasta que no hayan mas autos vendidos.
            */
           System.out.print("\n¿Hay auto vendido(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
           while (otro == 'S' || otro == 's')
           {
              System.out.print("Teclee precio del auto: ");
              precioAuto = entrada.nextFloat();

              totAutos = totAutos + 1;
              totVendido = totVendido + precioAuto;

              System.out.print("\n¿Hay otro auto vendido(S/N)?: ");
              entradaChar = entrada.next();
              otro = entradaChar.charAt(0);
              entrada.nextLine();
           } 

           //Se almacena la informacion el objeto.
           objVendedor.establecerNombreVend(nombre);
           objVendedor.establecerTotalVentas(totVendido);
           objVendedor.establecerTotalAutosVend(totAutos); 
           objVendedor.establecerSalarioMinimo(salMin);

           //Se calcula el sueldo del vendedor.
           objVendedor.calcularSueldoVend();

           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Nombre = " + objVendedor.obtenerNombreVend());
           System.out.println("Sueldo = " + objVendedor.obtenerSueldoVend());

           totVend = totVend + 1;
           totSueldos = totSueldos + objVendedor.obtenerSueldoVend();
           //Se pregunta si desea continuar con otro vendedor.
           System.out.print("\n¿Desea procesar otro vendedor(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
        } while (desea == 'S' || desea == 's');
       //Muesttra el total de vendedores y la nomina.
        System.out.println("\n----------------- Totales ----------------");
        System.out.println("Total vendedores = " + totVend);
        System.out.println("Total sueldos = " + totSueldos);
   }
}
    
    

