
package Ejercicio_13;

import java.util.Scanner;

/**
 * Realiza la serie armonica y muestra el resultado en pantalla.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class SerireArmonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Se almacena N para saber la cantidad de terminos por sumar.
        System.out.print("Ingrese el tamaño de la suma: ");
        int N=leer.nextInt();
        //Suma almacena el resultado de la serie. Se inicializa en cero para que acomule.
        double suma=0.0;
        //El ciclo se repite hasta que sea igual a N.
        for (int i = 1; i <= N; i++) {
            double op=1.0/i;
            suma=suma+op;
        }
        //Se imprime el resultado de la suma
        System.out.printf("Resultado de la de serie %f\n",suma);
        
        
    }
    
}
