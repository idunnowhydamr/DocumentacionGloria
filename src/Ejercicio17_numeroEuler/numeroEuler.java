
package Ejercicio17_numeroEuler;

// Se importa el escaner para pedir por teclado 
import java.util.Scanner;

/**
 * Aproxima al numero de Euler, utilizando la expansion de Taylor, se evaluara la seire hasta los primeros 50 terminos.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class numeroEuler {

    /**
     * @param args the command line arguments
     * Se calcula la serie de Taylor y se muestra el resultado en pantalla.
     * 
     */
   public static void main(String args[]) {
        //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Preguntamos al usuario cuántos términos desea establecer al programa.
        System.out.print("Cuantos términos desea: ");
        int numeroTerminos = leer.nextInt();
        //Preguntamos al usuario el valor de x desea establecer al programa.
        System.out.print("Digita el valor de x: ");
        int x = leer.nextInt();
        double suma = 0;
        double termino;
        //procedemos hacer el cálculo de la operación
        for (int i = 0; i < numeroTerminos; i++) {
            termino = Math.pow(x, i) / factorial(i);
            suma += termino;
        }
        //mostramos por pantalla
        System.out.printf("f(%d) = %f\n", x, suma);

    }
    //En este caso el factorial lo realizo como un método y aplico al programa para dividirlo el valor de x en potencia.
    public static double factorial(int numero) {
        double factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *=  i;
        }
        return factorial;
    }

}
