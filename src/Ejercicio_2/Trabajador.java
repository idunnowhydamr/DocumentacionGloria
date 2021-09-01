package Ejercicio_2;

/**

 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 * @author EMANUEL ORTIZ
 * @author EMANUEL ORTIZ
 * Aqui se declaran las variables que se usaran al momento de ingresar los datos del trabajador.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
public class Trabajador {
// Se crean las variables que necesitarán en el codigo para el trabajador.
    private String nombre; 
    private String estado_civil;
    private String sexo;
    private Double sueldo;
    private Double bonificacio;
    private Double descuento;
    private Double pago_total;
// Se crea el constructor para las variables del trabajador. 
    public Trabajador(String nombre, String estado_civil, String sexo, Double sueldo, Double bonificacio, Double descuento, Double pago_total) {
        this.nombre = nombre;
        this.estado_civil = estado_civil;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.bonificacio = bonificacio;
        this.descuento = descuento;
        this.pago_total = pago_total;
    }
    // Con este metodo se retorna el nmbre.
    public String getNombre() {
        return nombre;
    }
    // Con este metodo se modifica el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     // Con este metodo se muestra el nombre.
    public String getEstado_civil() {
        return estado_civil;
    }
     // con este metodo se modifica el estado civil.
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
     // con este metodo se retorna el sexo.
    public String getSexo() {
        return sexo;
    }
    // COn este metodo se modifica el sexo.
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Con este metodo se muestra  el sueldo. 
    public Double getSueldo() {
        return sueldo;
    }
    // con este metodo se modifica el sueldo.
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    // Con este se mustra la bonificacion.
    public Double getBonificacio() {
        return bonificacio;
    }
    // Con este metodo se modifica la bonificacion.
    public void setBonificacio(Double bonificacio) {
        this.bonificacio = bonificacio;
    }
    // Con este metodo se muestra el descuento.
    public Double getDescuento() {
        return descuento;
    }
    // Con este metodo se modifica el descuento.
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    // Con este metodo se muestra el pago total.
    public Double getPago_total() {
        return pago_total;
    }
    // Con este metodo se modifica el pago total.
    public void setPago_total(Double pago_total) {
        this.pago_total = pago_total;
    }

  
}
