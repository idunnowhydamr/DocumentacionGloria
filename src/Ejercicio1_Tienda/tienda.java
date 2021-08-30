/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Tienda;

import java.util.Scanner;

/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        producto p[] = new producto[3];
        p[0] = new producto(200, 20);
        p[1] = new producto(300, 35);
        p[2] = new producto(400, 50);
        boolean existe = false;
        int iterador = 0;
        double importe = 0;
        System.out.println("---Productos---");
        System.out.println("Codigo  Precio Unitario");
        for (int i = 0; i < p.length; i++) {
            System.out.println("[" + p[i].getCodigo() + "]       [" + p[i].getPrecioUnitario() + "]");
        }
        System.out.print("Seleccione el codigo del producto que desea: ");
        int codigo = leer.nextInt();
        while (existe == false) {
            if (p[iterador].getCodigo() == codigo) {
                existe = true;
                System.out.print("Seleccione la cantidad: ");
                int cantidad = leer.nextInt();
                importe = p[iterador].getPrecioUnitario() * cantidad;
                double descuento = 0;
                System.out.println("Valor sin descuento: " + importe);
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
                System.out.println("Valor descuento: " + descuento);
                System.out.println("Valor a pagar: " + importe);

            }
            if (iterador == 2 && existe == false) {
                System.out.println("Escriba nuevamente el codigo:");
                codigo = leer.nextInt();
                iterador = -1;
            }
            iterador++;
        }

    }
}
