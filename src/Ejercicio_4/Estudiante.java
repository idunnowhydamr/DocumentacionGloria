/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 * Esta clase se usa para crear todas las variables que se necesitan en el codigo, 
 * además se hacen las opreaciones necesarias.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA 
 */
// Se crean las variables que vamos a usar en el codigo.
public class Estudiante {

    private String nombre;
    private double matricula;
    private String facultad;
    private String planEstudio;
    private int estrato;
    private double pagoBachillerato;
  // Se crea el constructor de las variables de los estudiantes.
    public Estudiante(String nombre, double matricula, String facultad, String planEstudio, int estrato, double pagoBachillerato) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.facultad = facultad;
        this.planEstudio = planEstudio;
        this.estrato = estrato;
        this.pagoBachillerato = pagoBachillerato;
    }

    public Estudiante() {
    }
    // Se crea este metodo para poder mostrar el nombre del estudiate.
    public String getNombre() {
        return nombre;
    }
    // Se crea este metodo para modificar el nombre del estudiante.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Se crea este metodo para poder mostrar el valor de la matricula.
    public double getMatricula() {
        return matricula;
    }
    // Se crea este metodo para poder modificar el valor de la matricula.
    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    // Este metodo se usa para sacar el descuento dependiendo de la facultad y el estrato.
    public double descuentoFacultad() {
       // Se inician las variables en cero para que hayan problemas más adelante.
        double descuento = 0;
        double recargo = 0;
        switch (facultad) {
            case "ingenieria":
                switch (planEstudio) {
                    case "mecanica":
                        if (estrato <= 4) {
                            descuento = 0.20 * matricula;
                            recargo = 0;
                        } else {
                            descuento = 0;
                            recargo = 0;
                        }
                        break;
                    case "civil":
                        if (estrato <= 3) {
                            descuento = 0.15 * matricula;
                            recargo = 0;
                        } else {
                            descuento = 0;
                            recargo = 0;
                        }
                        break;
                    case "sistemas":
                        descuento = 0;
                        recargo = 0;
                        break;
                }break;
            case "derecho":
                switch (planEstudio) {
                    case "derecho":
                        descuento = 0;
                        recargo = 0;
                        break;
                }
        }
     return descuento; 
    }
    // Este metodo es para calcular el recargo.
    public double recargoFacultad(){
        double recargo =0;
        double descuento = 0;
        double b = 0;
        switch (facultad) {
        case "salud":
                switch (planEstudio) {
                    case "odontologia":
                        recargo = 0.4 * matricula;
                        break;
                    case "medicina":
                        descuento = 0;
                        break;
                }break;
            case "administracion":
                switch (planEstudio) {
                    case "administracion":
                        recargo = 400000 + (pagoBachillerato * 0.02);
                       
                        break;
                }break;
    }
        return recargo;
    }
    
    
    // Esta clase es para poder calcular el pago total.
    public double pagoTotal(){
        return matricula - descuentoFacultad() + recargoFacultad();
    }
}
