
package Ejercicio14_PromedioI;

// Se importa el escaner para pedir por teclado 
import java.util.Scanner;

/**
 * Calcula el promedio de 4 experimentos, cada uno consiste en 6 resultados de prueba.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class PromedioDatosI {

    /**
     * @param args the command line arguments
     * Muetsra el promedio de los experimentos.
     */
    public static void main(String[] args) {
       //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Variables que se utilizan para calcular el promedio.
        double suma,dato,prom;
        //El ciclo externo controla el número de experimentos.
        for (int i = 1; i <= 4; i++) {
            //Suma es un acomulador. Se le asigna cero antes de cada lectura de datos para limpiarla de datos viejos.
            suma=0;
            //El ciclo interno controla la lectura de los datos de cada experimento.
            for (int j = 1; j <= 6; j++) {
                //Los datos leídos se utilizan para calcular el promedio.
                System.out.print("Escriba el dato "+j+" del experimento "+i+": ");
                dato=leer.nextDouble();
                suma=suma+dato;
            }
            //Se almacena el promedio dividiendo el acomulado entre el numero de casos.
            prom=suma/6;
            System.out.println("Promedio experimento "+i+": "+prom);
        }
    }
    
}
