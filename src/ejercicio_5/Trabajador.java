package ejercicio_5;

/**
 * Se crean las clases y los metodos que se usarán en el codigo del trabajador.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA 
 */
public class Trabajador {
    // Se crea las clases que seran usadas para guardar los datos.
    private String nombre;
    private double sueldo;
    private String categoria;
    private String condicion;
       
    public Trabajador() {
    }
    // Se crea el constructor del trabajador con las clases.
    public Trabajador(String nombre, double sueldo, String categoria, String condicion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.condicion = condicion;
    }
    // Este metodo sirve para mostrar la variable nombre.
    public String getNombre() {
        return nombre;
    }
    // Con este metodo se puede modificar el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Con este metodo se puede mostrar el sueldo.
    public double getSueldo() {
        return sueldo;
    }
    // Con este metodo se puede modificar el sueldo.
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    // Se crea este metodo que se usa para calcular la bonificación dependiendo de la categoria y la condición.
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
     // Se crea este metodo para calcular el descuento del trabajador.
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
    // Se crea este metodo para calcular el pago total.
    public double pagoTotal(){
        return sueldo + bonificacionTrabajador() - descuentoTrabajador();
 }
}
