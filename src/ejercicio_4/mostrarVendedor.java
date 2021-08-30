/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

//Se importa el escaner.
import java.util.Scanner;

/**
 * La funcion principal de este codigo es poder mostrar las unidades vendidas por el vendedor
 * tambien mostrar su salario, su año de nacimient, el año en el cua ingreso a al empresa y la comision.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA 
 * 
 */
public class mostrarVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intancia para escaner
        Scanner leer = new Scanner(System.in);
        //Se le pide el numero de venderores que se van almacenar.
        System.out.print("Ingrese el numero de vendedores: ");
        int tamaño = leer.nextInt();
        //Se instancia el vendedor como vector por si hay mas de un empleado.
        Vendedor vendedores[] = new Vendedor[tamaño];
        double salario = 0;
        int añoNacimiento = 0, añoIngreso = 0, porcentaje = 0;
        //Se llena el vector de vendedores.
        for (int i = 0; i < tamaño; i++) {
            vendedores[i] = new Vendedor();
            // Se ingresa el codigo del vendedor. 
            System.out.print("Ingrese el codigo del vendedor " + (1 + i) + ": ");
            // Se guarda el codigo del vendedor.
            int codigo = leer.nextInt();
            vendedores[i].establecerCodigo(codigo);
            // Se ingresa el nombre del vendedor.
            System.out.print("Ingrese el nombre del vendedor " + (1 + i) + ": ");
            // Se guarda el nombre del vendedor.
            String nombre = leer.next();
            vendedores[i].establecerNombre(nombre);
            // Se el año de nacimiento del vendedor.
            System.out.print("Ingrese el año nacimiento del vendedor " + (1 + i) + ": ");
            // Se guarda la fecha de nacimiento del vendedor.
            añoNacimiento = leer.nextInt();
            // Se ingresa el año en el cual ingresa el vendedor a la empresa.
            System.out.print("Ingrese el año de ingreso a la empresa del vendedor " + (1 + i) + ": ");
            // se guarda el año de ingreso.
            añoIngreso = leer.nextInt();
            // Se ingresa el salario del vendedor.
            System.out.print("Ingrese el salario del vendedor " + (1 + i) + ": ");
            // Se guarda el salario del vendedor.
            salario = leer.nextDouble();
            // Se ingresa el valor unitario de la venta.
            System.out.print("Ingrese el valor unitario de la venta: ");
            // Se guarda el valor de la venta.
            double valorUnitario = leer.nextDouble();
            vendedores[i].establecerValorUnitario(valorUnitario);
            // Se pide el numero de undades vendidas.
            System.out.print("Ingrese el numero de unidades vendidas: ");
            // Se guarda la las unidades vendidas.
            int unidadVendidas = leer.nextInt();
            vendedores[i].establecerUnidadVendidas(unidadVendidas);
            // Se ingresa el porcentaje de la comision.
            System.out.print("Ingrese el porcentaje de la comision (Solo numeros enteros):");
            // se guarda el porcentaje.
            porcentaje = leer.nextInt();

        }
        boolean verVendedor=true;
        //Se crea while por si se quiere ver mas de un vendedoro.
        while(verVendedor){
        //Se pide el numero del vendedor que quiere ver.
        System.out.print("Ingrese la posicion del vendedor que quiere ver: ");
        int posicion = leer.nextInt();
        /*Se muestra la informacion de los clientes dependiedo del caso que se elija
        * 1. Valor venta de la venta y mostrar el codigo al cubo.
        * 2. Total recibido y averiguar si el codigo es multiplo de 3.
        * 3. Edad del cliente y años que lleva en la empresa.
         */
        for (int i = 0; i < tamaño; i++) {
            boolean verInfo = true;
            if ( (posicion-1)==i) {
                //Se crea un while por si se quiere ver ma de una opcion
                while (verInfo==true) {
                    System.out.println("---Vendedor " + (1 + i) + "---");
                    System.out.println("Seleccione una opcion. \n"
                            + "1. Ver el valor de las ventas del vendedor y mostar el cubo del codigo. \n"
                            + "2. Mostar el total recibido por el vendedor y si el codigo es multiplo de 3. \n"
                            + "3. Obtener edad del vendedor y cuantos años lleva en la empresa. \n"
                            + "4. Salir");
                    int caso = leer.nextInt();
                    System.out.println("---Resultado---");
                    vendedores[i].Caluclar(caso, salario, añoNacimiento, añoIngreso, porcentaje);
                    if(caso==4){
                        verInfo=false;
                        System.out.println("¿Desea ver la informacion de otro vendedor? (1. Si  2. No)");
                        int continuar=leer.nextInt();
                        if(continuar==2){
                            verVendedor=false;
                        }
                    }

                }

            }

        }
        }
    }

}
