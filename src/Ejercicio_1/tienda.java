
package Ejercicio_1;
// Se importa el escaner para pedir por teclado 
import java.util.Scanner;



/** Este codigo funciona para mostrar  el importe del descuento y el 
 * importe a pagar por la compra dependiendo de la cantidad del producto comprado.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        // Se crean los vectores para los productos.
        producto p[] = new producto[3];
        p[0] = new producto(200, 20);
        p[1] = new producto(300, 35);
        p[2] = new producto(400, 50);
        // Se creal la variable "existe".
        boolean existe = false;
        // Se crea la variable iteradora.
        int iterador = 0;
        // Se crea la variable importante.
        double importe = 0;
        // Se crea mensaje "Productos".
        System.out.println("---Productos---");
        // Se crea mensaje "mensaje unitario".
        System.out.println("Codigo  Precio Unitario");
        // Con este for se mustran los vectores en pantalla
        for (int i = 0; i < p.length; i++) {
            System.out.println("[" + p[i].getCodigo() + "]       [" + p[i].getPrecioUnitario() + "]");
        }
        // Se pide seleccionar el codigo del producto.
        System.out.print("Seleccione el codigo del producto que desea: ");
        // Se crea la variable codigo
        int codigo = leer.nextInt();
        // Se crea el while para controlar la busqueda del producto.
        while (existe == false) {
            //  Esta condicional se crea para validar la existencia del producto.
            if (p[iterador].getCodigo() == codigo) {
                existe = true;
                // Se Pide que seleccione la cantidad.
                System.out.print("Seleccione la cantidad: ");
                // Se creal la variable cantidad.
                int cantidad = leer.nextInt();
                importe = p[iterador].getPrecioUnitario() * cantidad;
                // Se crea la variable descuento.
                double descuento = 0;
                // Se imprime el valor sin el descuento.
                System.out.println("Valor sin descuento: " + importe);
                // Estacondicional funciona para medir el descuento. 
                if (importe >= 1000) {
                    descuento = importe * 0.2;
                }else if(importe>=800 || importe<1000){
                    descuento = importe * 0.16;
                }else if(importe>=300 || importe<800){
                    descuento = importe * 0.12;
                }else{
                    descuento = importe * 0.08;
                }
                importe -= descuento;
                // se imprime el valor del descuento.
                System.out.println("Valor descuento: " + descuento);
                // Se imprime el valor a pagar
                System.out.println("Valor a pagar: " + importe);

            }
            // Esta condicion aplica para cuando se ingresa un codigo errado.
            if (iterador == 2 && existe == false) {
                System.out.println("Escriba nuevamente el codigo:");
                codigo = leer.nextInt();
                iterador = -1;
            }
            iterador++;
        }

    }
}
