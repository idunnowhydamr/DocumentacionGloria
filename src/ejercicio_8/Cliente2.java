
package ejercicio_8;
/**
 * 
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
// Se crean las clases que usaremos para guardar los datos que necesitamos.
class Cliente2 {
     private String nombreClie;
     private int tipoClie, cantidad;
     private float precioUni, subTotal, descuento, netoPagar; 


     // Se crea este metodo para guardar el nombre del cliente.
     public void establecerNombreClie(String nom)
     {
        nombreClie = nom;    
     }
     // Con este metodo podemos establecer el tipo de cliente.
     public void establecerTipoClie(int tipo)
     {
        tipoClie = tipo;    
     }
     // COn este metodo podemos establecer la cantidad.
     public void establecerCantidad(int can)
     {
        cantidad = can;    
     }
     // Con este metodo establecemos el precio unitario.
     public void establecerPrecioUni(float pre)
     {
        precioUni = pre;    
     }
     // Con este metodo podemos calcular el subtotal.
     public void calcularSubTotal()
     {
        subTotal = cantidad * precioUni;    
     }
     // Con este metodo podemos calcular el descuento dependiendo del tipo de cliente.
     public void calcularDescuento()
     {
        switch (tipoClie)
        {
          case 1:
                  descuento = subTotal * 0.05F;
                  break;  
          case 2:
                  descuento = subTotal * 0.08F;
                  break;  
          case 3:
                  descuento = subTotal * 0.12F;
                  break;  
          case 4:
                  descuento = subTotal * 0.15F;
                  break;  
        }
     }
     // Con este metodo podemos calcular el neto a pagar.
     public void calcularNetoPagar()
     {
        netoPagar = subTotal - descuento;    
     }

     // Con este metodo podemos mostar el nombre del cliente.
     public String obtenerNombreClie()
     {
        return nombreClie;
     }
     // Con este metodo podemos mostrar el subtotal.
     public float obtenerSubTotal()
     {
        return subTotal;
     }
     // COn este metodo podemos mostrar el descuento.
     public float obtenerDescuento()
     {
        return descuento;
     }
     // Con este metodo podemos mostrar el neto a pagar.
     public float obtenerNetoPagar()
     {
        return netoPagar;
     }
}


