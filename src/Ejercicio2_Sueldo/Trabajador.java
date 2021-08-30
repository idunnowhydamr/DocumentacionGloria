package Ejercicio2_Sueldo;

/**
 * @author EMANUEL ORTIZ
<<<<<<< HEAD
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
=======
 * @author EMANUEL ORTIZ
 * @author EMANUEL ORTIZ
>>>>>>> b01fc2ea270b9607b7ebc83a207d1aed2fa3f3eb
 */
public class Trabajador {
// Se crean las variables que necesitarán en el codigo.
    private String nombre; 
    private String estado_civil;
    private String sexo;
    private Double sueldo;
    private Double bonificacio;
    private Double descuento;
    private Double pago_total;
// Se
    public Trabajador(String nombre, String estado_civil, String sexo, Double sueldo, Double bonificacio, Double descuento, Double pago_total) {
        this.nombre = nombre;
        this.estado_civil = estado_civil;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.bonificacio = bonificacio;
        this.descuento = descuento;
        this.pago_total = pago_total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getBonificacio() {
        return bonificacio;
    }

    public void setBonificacio(Double bonificacio) {
        this.bonificacio = bonificacio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getPago_total() {
        return pago_total;
    }

    public void setPago_total(Double pago_total) {
        this.pago_total = pago_total;
    }

   
    
   
}
