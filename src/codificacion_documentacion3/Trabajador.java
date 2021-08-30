package codificacion_documentacion3;

/**
 *
 * @author ASUS
 */
public class Trabajador {

    private String nombre;
    private double sueldo;
    private String categoria;
    private String condicion;

    public Trabajador() {
    }

    public Trabajador(String nombre, double sueldo, String categoria, String condicion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.condicion = condicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double bonificacionTrabajador() {
        double bonificacion = 0;
        switch (condicion) {
            case "si":
                switch (categoria) {
                    case "a":
                        bonificacion = 0.20 * sueldo;
                        break;
                    case "b":
                        bonificacion = 0.18 * sueldo;
                        break;
                    case "c":
                        bonificacion = 0.15 * sueldo;
                        break;
                    case "d":
                        bonificacion = 0.12 * sueldo;
                        break;
                }break;
            case "no":
                switch (categoria) {
                    case "a":
                        bonificacion = 0.17 * sueldo;
                        break;
                    case "b":
                        bonificacion = 0.15 * sueldo;
                        break;
                    case "c":
                        bonificacion = 0.14 * sueldo;
                        break;
                    case "d":
                        bonificacion = 0.10 * sueldo;
                        break;
                }
        }
        return bonificacion;
    }

    public double descuentoTrabajador() {
        double descuento = 0;
        switch (condicion) {
            case "si":
                descuento = 0.06 * (sueldo + bonificacionTrabajador());
                break;

        }
        switch (condicion) {
            case "no":
                descuento = 0.04 * (sueldo + bonificacionTrabajador());
                break;

        }
        return descuento;
    }
    
    public double pagoTotal(){
        return sueldo + bonificacionTrabajador() - descuentoTrabajador();
 }
}
