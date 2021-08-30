/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_Concesionario;

/**
 *
 * @author EMANUEL ORTIZ
 */
public class Moto {
    //Se desclaran las variables.
    private String nombre;
    private String tipo;
    private int codigo;
    private double valorSinDescuento=0;
    private double valorFinal;
    private double descuento;
    private int cantidad;
    
    //Se establece el metodo constructor de la moto.
    public Moto() {
    }
    
    //Metodo para establecer el tipo de moto.
    public void establecerTipo(String tipo){
        this.tipo=tipo;
    }
    //Metodo para establecer el nombre de la moto.
    public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    //Metodo para establecer el codigo.
    public void establecerCodigo(int codigo){
        this.codigo=codigo;
    }
    //Metodo para establecer la cantidad.
    public void establecerCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    //Metodo para establecer el precio cuando el cliente elija el tipo de moto.
    public boolean establecerValor(String tipo){
        //Se crea un boolean para saber si se elijio una moto existente o no.
        boolean existe=false;
        if(tipo.equalsIgnoreCase("100CC")){
            this.valorSinDescuento=2900000;
            existe=true;
        }else if(tipo.equalsIgnoreCase("110CC")){
            this.valorSinDescuento=3650000;
             existe=true;
        }else if(tipo.equalsIgnoreCase("125CC")){
            this.valorSinDescuento=4000000;
             existe=true;
        }else if(tipo.equalsIgnoreCase("250CC")){
            this.valorSinDescuento=6000000;
             existe=true;
        }
        return existe;
    }
    
    //Metodo para establecer el descuento. Tambien establece el valor a pagar dependiendo de la cantidad que ingrese.
    public void Calcular(){
      if(cantidad >3){
          descuento=valorSinDescuento*0.15;
          //Esta variable almacena el valor que debe pagar el cliente.
          valorFinal=(valorSinDescuento*cantidad)-descuento;
      }else{
          valorFinal=valorSinDescuento*cantidad;
      }
    }
    //Metodo para mostrar la informacion que se almacene.
    public void Mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Tipo de moto: "+tipo);
        System.out.println("Numero de unidades compradas: "+cantidad);
        System.out.println("Valor sin descuento: "+valorSinDescuento);
        System.out.println("Descuento: "+descuento);
        System.out.println("Valor a pagar: "+valorFinal);
    }
}
