
package Ejercicio_2;
// Se importa el escanner para pedir datos por teclado.
import java.util.Scanner;


/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
/** 
 * Este Algoritmo funciona para calcular el pago total de un trabajador 
 * dependiendo si es casado o soltero o si es hombre o mujer.
 * además se calcula también la bonificación.
  * @author EMANUEL ORTIZ
  * @author DIEGO MUÑOZ
  * @author SAMUEL DIOSA
 */
public class Calcular_Pago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        //Se pide el numero de empleados.
        System.out.print("Ingrese el numero de empleados: ");
        int tamaño=leer.nextInt();
        //Se declaran las variables para operar.
        double bonificacion=0,descuento=0,pagoTotal;
        //Se crea la tabla de los trabajadores para almacenarlos.
        Trabajador tabla_trabajadores []= new Trabajador[tamaño];
        for (int i = 0; i < tamaño; i++) {
            //Se pide informacion de los trabajadores y se guarda con los Setter.
            System.out.println("Ingrese el nombre del trabajador "+(i+1)+": ");
            String nombre=leer.next();
            System.out.println("Ingrese el sueldo del trabajador "+(i+1)+": ");
            double sueldo=leer.nextInt();
            System.out.println("Ingrese el estado civil del trabajador "+(i+1)+": ");
            String estado_civil=leer.next();
            System.out.println("Ingrese el sexo del trabajador "+(i+1)+": ");
            String sexo=leer.next();
            //Se calcula la bonificacion y el descuento
            if(sexo.equalsIgnoreCase("masculino") && estado_civil.equalsIgnoreCase("soltero")){
                //Se calcula la bonificacion del empleado soltero y masculino.
                bonificacion=sueldo*0.08;
              
                 //Se calcula el descuento del empleado soltero y masculino.
                 descuento=sueldo*0.06;
                 
                
            }else if(sexo.equalsIgnoreCase("masculino") && estado_civil.equalsIgnoreCase("casado")){
                //Se calcula la bonificacion del empleado casado y masculino.
                bonificacion=sueldo*0.1;
                //Se calcula el descuento del empleado casado y masculino.
                 descuento=sueldo*0.04;
                 
            }else if(sexo.equalsIgnoreCase("femenino") && estado_civil.equalsIgnoreCase("soltero")){
                //Se calcula la bonificacion del empleado soltero y femenino.
                bonificacion=sueldo*0.1;
               
                 //Se calcula el descuento del empleado soltero y femenino.
                 descuento=sueldo*0.05;
                 
            }else if(sexo.equalsIgnoreCase("femenino") && estado_civil.equalsIgnoreCase("casado")){
                //Se calcula la bonificacion del empleado casado y femenino.
                bonificacion=sueldo*0.12;
                
                 //Se calcula el descuento del empleado casado y femenino.
                 descuento=sueldo*0.03;
                 
            }
            pagoTotal=sueldo+bonificacion-descuento;
            //Se crea el empleado con los datos ingresados.
            tabla_trabajadores[i]=new Trabajador(nombre,estado_civil,sexo,sueldo,bonificacion,descuento,pagoTotal);
            
        }
        //Se muestra los datos de los empleados.
        for (int i = 0; i < tamaño; i++) {
            System.out.println("---Empledo "+(i+1)+"---");
            System.out.println("Nombre: "+tabla_trabajadores[i].getNombre());
            System.out.println("Sueldo: "+tabla_trabajadores[i].getSueldo());
            System.out.println("Estado Civil: "+tabla_trabajadores[i].getEstado_civil());
            System.out.println("Sexo: "+tabla_trabajadores[i].getSexo());
            System.out.println("Bonificacion: "+tabla_trabajadores[i].getBonificacio());
            System.out.println("Descuento: "+tabla_trabajadores[i].getDescuento());
            System.out.println("Pago Total: "+tabla_trabajadores[i].getPago_total());
        }
     }
    
}
