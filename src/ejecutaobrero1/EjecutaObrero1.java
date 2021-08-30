//CALCULAR LA PRODUCCION DE VARIOS OBREROS

package ejecutaobrero1;

import java.util.Scanner;

public class EjecutaObrero1 {

    
    public static void main(String[] args) {
      
        String nombre, obrMayor="", obrMenor="", entradaChar;
        int proDia, totProdObr, totProd, totObreros, mayorProd, menorProd;
        float totSueldos;
        char otro, desea;

    
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
      
            Obrero1 objObrero = new Obrero1();

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

    
            objObrero.establecerNombreObr(nombre);
            objObrero.establecerProduccion(totProdObr);

            objObrero.calcularSueldo();

      
            System.out.println("\n----------------- Resultados -----------------");
            System.out.println("Nombre = " + objObrero.obtenerNombreObr());
            System.out.println("Unidades producidas = " + objObrero.obtenerProduccion());
            System.out.println("Sueldo = " + objObrero.obtenerSueldo());

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

            System.out.print("\n¿Desea procesar otro obrero(S/N)?: ");
            entradaChar = entrada.next();
            desea = entradaChar.charAt(0);
            entrada.nextLine();
         } while (desea == 'S' || desea == 's');
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

    

