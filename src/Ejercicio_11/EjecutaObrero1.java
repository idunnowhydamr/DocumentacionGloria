//CALCULAR LA PRODUCCION DE VARIOS OBREROS

package Ejercicio_11;
//Se importa el escaner para pedir por teclado.
import java.util.Scanner;

public class EjecutaObrero1 {

    
    public static void main(String[] args) {
        //Declaracion de variables
        String nombre, obrMayor="", obrMenor="", entradaChar;
        int proDia, totProdObr, totProd, totObreros, mayorProd, menorProd;
        float totSueldos;
        char otro, desea;

        //Intancia para escaner
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n    PROCESA LA PRODUCCION DE VARIOS OBREROS\n");
        
        System.out.println("         REPORTE DE PRODUCCION");
        System.out.println("NOMBRE DEL OBRERO              TOTAL PRODUCCION  SUELDO");
        System.out.println("-------------------------------------------------------");
        totObreros = 0;
        totProd = 0;
        totSueldos = 0;
        mayorProd = 0;
        menorProd = 10000;
        do
        {
            //Se instancia el objeto obrero.
            Obrero1 objObrero = new Obrero1();
            //Se le pide información del obrero.
            System.out.println("\n-------------- Lectura de datos --------------");
            System.out.print("Teclee nombre: ");
            nombre = entrada.nextLine();
            totProdObr = 0;
            do
            {
               System.out.print("Teclee produccion del dia: ");
               proDia = entrada.nextInt();
               totProdObr = totProdObr + proDia;

               System.out.print("\n¿Desea procesar otro Dia(S/N)?: ");
               entradaChar = entrada.next();
               otro = entradaChar.charAt(0);
               entrada.nextLine();
            } while (otro == 'S' || otro == 's');

            //Se establece las variables.
            objObrero.establecerNombreObr(nombre);
            objObrero.establecerProduccion(totProdObr);
            //Se calcula el sueldo.
            objObrero.calcularSueldo();

            //Se muestra el resultado de lo que produjo el obrero y su sueldo.
            System.out.println("\n----------------- Resultados -----------------");
            System.out.println("Nombre = " + objObrero.obtenerNombreObr());
            System.out.println("Unidades producidas = " + objObrero.obtenerProduccion());
            System.out.println("Sueldo = " + objObrero.obtenerSueldo());
            //Se calcula la mayor y menor produccion entre los obreros. 
            if (objObrero.obtenerProduccion() > mayorProd)
            {
               mayorProd = objObrero.obtenerProduccion();
               obrMayor = objObrero.obtenerNombreObr();
            }

            if (objObrero.obtenerProduccion() < menorProd)
            {
               menorProd = objObrero.obtenerProduccion();
               obrMenor = objObrero.obtenerNombreObr();
            }

            totObreros = totObreros + 1;
            totProd = totProd + objObrero.obtenerProduccion();
            totSueldos = totSueldos + objObrero.obtenerSueldo();
            
            //Se pregunta si se quiere repetir el ciclo.
            System.out.print("\n¿Desea procesar otro obrero(S/N)?: ");
            entradaChar = entrada.next();
            desea = entradaChar.charAt(0);
            entrada.nextLine();
         } while (desea == 'S' || desea == 's');
        //Se muestra el resultado final del acomulado de los obreros de la fabrica.
         System.out.println("\n------------------- Totales -------------------");
         System.out.println("Total obreros = " + totObreros);
         System.out.println("Total produccion = " + totProd);
         System.out.println("Total sueldos = " + totSueldos);
         System.out.println("Nombre Obrero mas Productivo = " + obrMayor);
         System.out.println("Produccion que Fabrico= " + mayorProd);
         System.out.println("Nombre Obrero menos Productivo = " + obrMenor);
         System.out.println("Produccion que Fabrico= " + menorProd);
   }
}

    

