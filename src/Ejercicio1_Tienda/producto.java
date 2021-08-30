
package Ejercicio1_Tienda;
/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class producto {
    private int codigo;
    private int precioUnitario;

    public producto(int codigo, int precioUnitario) {
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
    }

   public producto() {
      
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
}
