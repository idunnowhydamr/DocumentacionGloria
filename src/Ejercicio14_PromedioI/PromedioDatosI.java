/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14_PromedioI;

import java.util.Scanner;

/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class PromedioDatosI {

    /**
     * @param args the command line arguments
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
