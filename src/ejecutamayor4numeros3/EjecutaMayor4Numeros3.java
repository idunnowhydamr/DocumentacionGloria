// programa MAYOR 4 NUMEROS

package ejecutamayor4numeros3;

import java.util.Scanner;
/**
 * 
 * @author ASUS
 */
public class EjecutaMayor4Numeros3 {

    
    public static void main(String[] args) {
      String datoEntrada;
       int    n1, n2, n3, n4;

   
       Scanner entrada = new Scanner(System.in);

 
       Mayor4Numeros3 objMayor4Numeros = new Mayor4Numeros3();

       System.out.println("\n       IMPRIME EL MAYOR DE 4 NUMEROS\n");


       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee numero 1: ");
       n1 = entrada.nextInt();

       System.out.print("Teclee numero 2: ");
       n2 = entrada.nextInt();

       System.out.print("Teclee numero 3: ");
       n3 = entrada.nextInt();

       System.out.print("Teclee numero 4: ");
       n4 = entrada.nextInt();

  
       objMayor4Numeros.establecerNumA(n1);
       objMayor4Numeros.establecerNumB(n2);
       objMayor4Numeros.establecerNumC(n3);
       objMayor4Numeros.establecerNumD(n4);

 
       objMayor4Numeros.calcularNuMayor();

       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("El mayor es = " + objMayor4Numeros.obtenerNuMayor());
   }
}
    
