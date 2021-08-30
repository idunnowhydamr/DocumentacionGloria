
package Ejercicio6_Vendedor;

/**
 *
 * @author EMANUEL ORTIZ
 */
public class Vendedor {
    //Declaracion de variables
    private String nombre;
    private String comisiona;
    private int codigo;
    private int añosEmpresa;
    private int edad;
    private int unidadVendidas;
    private double comision;
    private double valorVenta;
    private double valorUnitario; 
    private double salario;
    private double codigoOp;
  
    public Vendedor() {
    }
    
    //Metodo para establecer el codigo
    public void establecerCodigo(int codigo){
        this.codigo=codigo;
    }
    //metodo para establecer nombre.
    public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    //Metodo para establecer el valor unitario por venta.
    public void establecerValorUnitario(double valorUnitario){
        this.valorUnitario=valorUnitario;
    }
    //Metodo para establecer la cantidad de ventas.
    public void establecerUnidadVendidas(int unidadVendidas){
        this.unidadVendidas=unidadVendidas;
    }
    //Metodo para establecer el valor de la venta.
    public void establecerValorVenta(){
        valorVenta=unidadVendidas*valorUnitario;
    }
    //Metodo para establecer los años que lleva el vendedor en la empresa.
    public void establecerAñosEmpresa(int añoIngreso){
        añosEmpresa=2021-añoIngreso;
    }
    //Metodo para establecer la edad.
    public void establecerEdad(int añoNacimiento){
        edad=2021-añoNacimiento;
    }
    //Metodo para establecer la comision.
    public void establecerComision(int porcentaje){
        if(valorUnitario>=20000000){
            comision=valorVenta*porcentaje/100;
            comisiona="Si comisiona.";
        }else{
            comisiona="No comisiona.";
        }
    }
     //Metodo para establecer el salario total del vendedor.
    public void establecerSalario(double salario, int porcentaje){
        establecerComision(porcentaje);
        if(comisiona.equalsIgnoreCase("si comisiona")){
            this.salario=valorVenta*salario;
        }else if(comisiona.equalsIgnoreCase("no comisiona")){
            this.salario=salario;
        }
        
    }
    //Metodo sirve para calcular dependiendo del caso que se seleccione.
    public void Caluclar(int caso, double salario, int añoNacimiento, int añoIngreso, int porcentaje){
        switch(caso){
            /*Calcular y mostrar el valor de venta del vendedor
            * Ademas de mostrar el cubo al codigo del vendedor
            */
            case 1:
                establecerValorVenta();
                //Se calcula el codigo al cubo.
                codigoOp=Math.pow(codigo, 3);
                //Se imprime el resultado
                System.out.println("Valor de la venta: " +valorVenta);
                System.out.println("Codigo al cubo: "+codigoOp);
                break;
            case 2:
                establecerValorVenta();
                establecerSalario(salario,porcentaje);
                //Se imprime el total que recibe el vendedor.
                System.out.println("Salario: "+ salario);
                //Se divide el codigo entre 3 con el operador modulo.
                codigoOp=codigo%3;
                //Se imprime si es o no multiplo de 3.
                if(codigoOp==0){
                    System.out.println("El codigo del vendedor si es multiplo de 3");
                }else{
                    System.out.println("El codigo del vendedor no es multiplo de 3");
                }
                break;
            case 3:
               establecerEdad(añoNacimiento);
               establecerAñosEmpresa(añoIngreso);
               //Se imprime el resultado
                System.out.println("Edad del vendedor: "+edad);
                System.out.println("Años que lleva en la empresa: "+añosEmpresa);
                break;
        }
    }
    
   
    
}
