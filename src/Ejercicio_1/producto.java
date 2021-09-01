
package Ejercicio_1;
        
/**
 * Es la base para crear todo producto.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */

// Se crean las variables que se usaran en el codigo.
        
public class producto {
    private int codigo;
    private int precioUnitario;
 // Se crea el constructor de las variables.
    public producto(int codigo, int precioUnitario) {
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
    }

   public producto() {
      
    }
    // Se retorna la variable codigo.
    public int getCodigo() {
        return codigo;
    }
    // Se guarda la variable 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    // Se retorna el precio unitario.
    public int getPrecioUnitario() {
        return precioUnitario;
    }
     // Se guarda el preci unitario.
    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
}
