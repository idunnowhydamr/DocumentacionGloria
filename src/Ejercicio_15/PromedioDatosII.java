
package Ejercicio_15;

// Se importa el escaner para pedir por teclado 
import java.util.Scanner;

/**
 * Calcula el promedio de 4 experimentos, cada uno consiste en N resultados de prueba dados por el usuaio.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class PromedioDatosII {

    /**
     * @param args the command line arguments
     * Muetsra el promedio de los experimentos.
     */
    public static void main(String[] args) {
         //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Variables que se utilizan para calcular el promedio.
        double suma,dato,prom;
        int num;
        //El ciclo externo controla el número de experimentos.
        for (int i = 1; i <= 4; i++) {
            //num lee el numero de datos de cada experimento
            System.out.print("Ingrese el numero de datos del experimento "+i+": ");
            num=leer.nextInt();
            //Suma es un acomulador. Se le asigna cero antes de cada lectura de datos para limpiarla de datos viejos.
            suma=0;
            //El ciclo interno controla la lectura de los datos de cada experimento.
            for (int j = 1; j <= num; j++) {
                //Los datos leídos se utilizan para calcular el promedio.
                System.out.print("Escriba el dato "+j+" del experimento "+i+": ");
                dato=leer.nextDouble();
                suma=suma+dato;
            }
            //Se almacena el promedio dividiendo el acomulado entre el numero de experimentos.
            prom=suma/num;
            System.out.println("Promedio experimento "+i+": "+prom);
        }
    }
    
}
