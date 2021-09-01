package Ejercicio_12;

/**
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */

class Vendedor {
    //Se declaran las variables a utilizar.
    private String nombreVend;
     private float totalAutosVend;
     private float sueldoVend;
     private float totalVentas;
     private float salarioMinimo;

    //Se establece el nombre del vendedor.
     public void establecerNombreVend(String nom)
     {
        nombreVend = nom;    
     }
     
     //Se establece el total de ventas.
     public void establecerTotalVentas(float toVen)
     {
        totalVentas = toVen;    
     }
     
     //Se establece el total de autos vendidos.
     public void establecerTotalAutosVend(int toAuVen)
     {
        totalAutosVend = toAuVen;    
     }
     
     //Se establece el salario minimo.
     public void establecerSalarioMinimo(float saMi)
     {
        salarioMinimo = saMi;    
     }
     
     //Se calcula el sueldo del vendedor.
     public void calcularSueldoVend()
     {
        sueldoVend = salarioMinimo + (totalAutosVend*100.00F) + (totalVentas*0.02F);   
     }

     //Se obtiene el nombre del vendedor.
     public String obtenerNombreVend()
     {
        return nombreVend;
     }
     //Se obtiene el sueldo del vendedor.
     public float obtenerSueldoVend()
     {
        return sueldoVend;
     }
}


