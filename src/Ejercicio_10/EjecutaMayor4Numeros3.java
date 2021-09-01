// programa MAYOR 4 NUMEROS

package Ejercicio_10;
// Se importa el escaner para pedir por teclado 
import java.util.Scanner;
/**
 * Esta pantalla sirve pedir los numeros que se van a utilizar para encontrar el mayor de todos ellos e imprimilos en pantallas.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class EjecutaMayor4Numeros3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String datoEntrada;
       int    n1, n2, n3, n4;

       //Intancia para escaner
       Scanner entrada = new Scanner(System.in);

       //Intancia el objeto para calcular el numero mayor.
       Mayor4Numeros3 objMayor4Numeros = new Mayor4Numeros3();
       
       System.out.println("\n       IMPRIME EL MAYOR DE 4 NUMEROS\n");

       //Se piden los numeros para la operacion.
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee numero 1: ");
       n1 = entrada.nextInt();

       System.out.print("Teclee numero 2: ");
       n2 = entrada.nextInt();

       System.out.print("Teclee numero 3: ");
       n3 = entrada.nextInt();

       System.out.print("Teclee numero 4: ");
       n4 = entrada.nextInt();

       //Se establece cada numero en el objeto creado anteriormente.
       objMayor4Numeros.establecerNumA(n1);
       objMayor4Numeros.establecerNumB(n2);
       objMayor4Numeros.establecerNumC(n3);
       objMayor4Numeros.establecerNumD(n4);

       //Se calcula el numero mayor.
       objMayor4Numeros.calcularNuMayor();
       
       //Se muestra el resultado del numero mayor.
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("El mayor es = " + objMayor4Numeros.obtenerNuMayor());
   }
}
    
