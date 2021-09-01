
package Ejercicio_5;

import java.util.Scanner;

/**
 * Este codigo funciona  para determinar el valor que tiene al comprar una moto o varias,
 * ya que el valor varia dependiendo de la cantidad de unidades compradas y del tipo de moto.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Se le pide el numero de motos que se van almacenar.
        System.out.print("Ingrese el numero de clientes: ");
        int tamaño=leer.nextInt();
        //Se instancia moto como vector por si hay mas de una compra.
        Moto motos[]=new Moto[tamaño];
        //Se llena la informacion de la compra por cada cliente.
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----Compra "+(i+1)+"----");
            motos[i]=new Moto();
            // Se pide que se ingrese el nombre de la moto.
            System.out.print("Ingrese el nombre de la moto: ");
            // Se guarda el nombre de la moto.
            String nombre=leer.next();
            motos[i].establecerNombre(nombre);
            // Se pide el codigo de la moto.
            System.out.print("Ingrese el codigo de la moto:");
            // Se guarda el codigo de la moto.
            int codigo=leer.nextInt();
            motos[i].establecerCodigo(codigo);
            //Se crea boolean para utilizar como condicion en el while.
            boolean tipoMoto=false;
            /*Mientras el tipo de moto sea falso, es porque no existe esa moto,
            *pero si es verdadero es porque se eligio una moto que sí existe.
            */
            while(tipoMoto==false){
                            System.out.print("Ingrese el tipo de moto (100CC-110CC-125CC-250CC):");
            String tipo=leer.next();
            /*Se llama el metodo dentro de un boolean porque tambien nos returna uno
            *Sirve para saber la existencia de la moto y romper el while.
            */
            boolean existe=motos[i].establecerValor(tipo);
            if(existe){
                tipoMoto=true;
                motos[i].establecerTipo(tipo);
                break;
            }else{
                // esta informacion se muestra cuando no se encuentra el tipo de moto buscada.
                System.out.println("No se encontro el tipo de moto. Digite nuevamente! \n");
            }
            }
            // Se pide que se ingrese la catidad. 
            System.out.print("Ingrese la cantidad que desea: ");
            // Se crea la variable que guardará la cantidad.
            int cantidad=leer.nextInt();
            motos[i].establecerCantidad(cantidad);
            motos[i].Calcular();
        }
        
        //Se muestra la informacion de todos los clientes que se atendieron.
        for (int i = 0; i < tamaño; i++) {
            System.out.println("----Compra "+(i+1)+"----");
            motos[i].Mostrar();
        }
    }
    
}
