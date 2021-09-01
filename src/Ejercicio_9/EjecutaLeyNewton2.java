//REALIZA CALCULOS CON LA SEGUNDA LEY NEWTON, calcular sea la fuerza, masa, aceleracion.

package Ejercicio_9;
// Se importa el escaner para pedir datos por el teclado.
import java.util.Scanner;
/**
 *  Este codigo podemos realizar la ley de newton donde se implica la masa, la fuerza y la aceleración.
 * 
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class EjecutaLeyNewton2 {

   
    public static void main(String[] args) {
      {
   
       String datoEntrada, entradaChar;
       // Se crean las variables datos de estrada y entrada de caracter.
       double f, a, m;
       // Se crean las variables fuerza, aceleracion y masa.
       char   resp;

   
       Scanner entrada = new Scanner(System.in);

       LeyNewton2 objNewton = new LeyNewton2();

       System.out.println("\nREALIZA CALCULOS CON LA SEGUNDA LEY NEWTON\n");

   
       System.out.println("------------ Lectura de datos ------------");
       System.out.println("¿Que desea calcular?");
       System.out.print("¿Fuerza (F), Aceleracion (A), Masa (M)?: ");
       // se pide que se desea calcular primero.
       entradaChar = entrada.next();
       // Se guarda la decision del usuario.
       resp = entradaChar.charAt(0);
       entrada.nextLine();

       // Se crea esta condicion para que no afecte sila letra es mayuscula o minuscula.
       if (resp == 'F' || resp == 'f')
       {
        // Leer
           System.out.print("Teclee Masa: ");
           // Se pide que digite la masa.
           m = entrada.nextDouble();
           // Se guarda la masa digitada.

           System.out.print("Teclee Aceleracion: ");
           // Se digita la aceleracion.
           a = entrada.nextDouble();
           // Se guarda la aceleracion ingresada.

           // Se crean los objetos y se realizan las operaciones necesarias.
           objNewton.establecerMasa(m);
           objNewton.establecerAceleracion(a);
           
           objNewton.calcularFuerza();

      
           System.out.println("\n--------------- Resultado ----------------");
           // Se imprime la fuerza.
           System.out.println("Fuerza   = " + objNewton.obtenerFuerza());
       }

       if (resp == 'A' || resp == 'a')
       {
        
           System.out.print("Teclee Masa: ");
            // Se pide que digite la masa.
           m = entrada.nextDouble();
           // Se guarda la masa digitada.

           System.out.print("Teclee Fuerza: ");
           // se pide la fuerza.
           f = entrada.nextDouble();
           // Se guarda la fuerza pedida anteriormente.
           
           // se crean los objetos y se realizan las operaciones.
           objNewton.establecerMasa(m);
           objNewton.establecerFuerza(f);

           objNewton.calcularAceleracion();

           System.out.println("\n--------------- Resultado ----------------");
           System.out.println("Aceleracion   = " + objNewton.obtenerAceleracion());
            // Se imprime la aceleracion.
       }

       if (resp == 'M' || resp == 'm')
       {
  
           System.out.print("Teclee Fuerza: ");
            // se pide la fuerza.
           f = entrada.nextDouble();
           // Se guarda la fuerza pedida anteriormente.
           System.out.print("Teclee Aceleracion: ");
          // Se digita la aceleracion.
           a = entrada.nextDouble();
           // Se guarda la aceleracion ingresada.

           // se crean los objetos y se realizan las operaciones.
           objNewton.establecerFuerza(f);
           objNewton.establecerAceleracion(a);

    
           objNewton.calcularMasa();

        
           System.out.println("\n--------------- Resultado -----------------");
           System.out.println("Masa   = " + objNewton.obtenerMasa());
            // Se imprime la masa.
       }
   }
}

    }
    

