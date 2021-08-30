/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacion_documentacion4;

/**
 * Esta clase es para 
 * @author ASUS
 */
public class Estudiante {

    private String nombre;
    private double matricula;
    private String facultad;
    private String planEstudio;
    private int estrato;
    private double pagoBachillerato;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double descuentoFacultad() {
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
    
    
    
    public double pagoTotal(){
        return matricula - descuentoFacultad() + recargoFacultad();
    }
}
