//REALIZA CALCULOS CON LA SEGUNDA LEY NEWTON, calcular sea la fuerza, masa, aceleracion.

package ejecutaleynewton2;

import java.util.Scanner;
/**
 * 
 * @author ASUS
 */
public class EjecutaLeyNewton2 {

   
    public static void main(String[] args) {
      {
   
       String datoEntrada, entradaChar;
       double f, a, m;
       char   resp;

   
       Scanner entrada = new Scanner(System.in);

       LeyNewton2 objNewton = new LeyNewton2();

       System.out.println("\nREALIZA CALCULOS CON LA SEGUNDA LEY NEWTON\n");

   
       System.out.println("------------ Lectura de datos ------------");
       System.out.println("¿Que desea calcular?");
       System.out.print("¿Fuerza (F), Aceleracion (A), Masa (M)?: ");
       entradaChar = entrada.next();
       resp = entradaChar.charAt(0);
       entrada.nextLine();


       if (resp == 'F' || resp == 'f')
       {
        // Leer
           System.out.print("Teclee Masa: ");
           m = entrada.nextDouble();

           System.out.print("Teclee Aceleracion: ");
           a = entrada.nextDouble();

           objNewton.establecerMasa(m);
           objNewton.establecerAceleracion(a);

           objNewton.calcularFuerza();

      
           System.out.println("\n--------------- Resultado ----------------");
           System.out.println("Fuerza   = " + objNewton.obtenerFuerza());
       }

       if (resp == 'A' || resp == 'a')
       {
        
           System.out.print("Teclee Masa: ");
           m = entrada.nextDouble();

           System.out.print("Teclee Fuerza: ");
           f = entrada.nextDouble();

           objNewton.establecerMasa(m);
           objNewton.establecerFuerza(f);

           objNewton.calcularAceleracion();

           System.out.println("\n--------------- Resultado ----------------");
           System.out.println("Aceleracion   = " + objNewton.obtenerAceleracion());
       }

       if (resp == 'M' || resp == 'm')
       {
  
           System.out.print("Teclee Fuerza: ");
           f = entrada.nextDouble();

           System.out.print("Teclee Aceleracion: ");
           a = entrada.nextDouble();

     
           objNewton.establecerFuerza(f);
           objNewton.establecerAceleracion(a);

    
           objNewton.calcularMasa();

        
           System.out.println("\n--------------- Resultado -----------------");
           System.out.println("Masa   = " + objNewton.obtenerMasa());
       }
   }
}

    }
    

