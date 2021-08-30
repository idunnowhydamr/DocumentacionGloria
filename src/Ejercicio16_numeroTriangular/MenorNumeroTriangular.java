
package Ejercicio16_numeroTriangular;

// Se importa el escaner para pedir por teclado 
import java.util.Scanner;

/**
 * Se va encontrar el numero natural mas pequeño de una cantidad dada por el usuario.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class MenorNumeroTriangular {

    /**
     * @param args the command line arguments
     * Se muestra el numero natural N mas pequeño.
     */
    public static void main(String[] args) {
        //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Variables para calcular. i y suma se declaran en uno porque es una operacion de numeros naturales.
        int suma=1,n,i=1;
        //N determina el limite de la suma acumulada en la variable suma.
        System.out.print("Ingrese el numero de repeticiones: ");
        n=leer.nextInt();
        //Se utiliza un ciclo while para que se sumen los numero naturales hasta que la suma supere a N.
        while(suma<=n){
            i=i+1;
            suma=suma+i;
        }
        //Se muestra el acomulado final.
        System.out.println(i);
    }
    
}
