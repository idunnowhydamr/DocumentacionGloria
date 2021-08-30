package ejercicio_11;


class Vendedor {
    private String nombreVend;
     private float totalAutosVend;
     private float sueldoVend;
     private float totalVentas;
     private float salarioMinimo;


     public void establecerNombreVend(String nom)
     {
        nombreVend = nom;    
     }

     public void establecerTotalVentas(float toVen)
     {
        totalVentas = toVen;    
     }

     public void establecerTotalAutosVend(int toAuVen)
     {
        totalAutosVend = toAuVen;    
     }

     public void establecerSalarioMinimo(float saMi)
     {
        salarioMinimo = saMi;    
     }

     public void calcularSueldoVend()
     {
        sueldoVend = salarioMinimo + (totalAutosVend*100.00F) + (totalVentas*0.02F);   
     }


     public String obtenerNombreVend()
     {
        return nombreVend;
     }

     public float obtenerSueldoVend()
     {
        return sueldoVend;
     }
}


