
package Ejercicio_10;

/**
 * Esta pantalla sirve pedir los numeros que se van a utilizar para encontrar el mayor de todos ellos e imprimilos en pantallas.
 * @author EMANUEL ORTIZ
 * @author DIEGO MUÑOZ
 * @author SAMUEL DIOSA
 */
class Mayor4Numeros3 {
    //Se declaran las variables para almacenar los numeros y para guardar el resultado.
    private int numA, numB, numC, numD, nuMayor;

    //Se establece el primer numero.
     public void establecerNumA(int a)
     {
        numA = a;    
     }
     
     //Se establece el segundo numero.
     public void establecerNumB(int b)
     {
        numB = b;    
     }
     
     //Se establece el tercer numero.
     public void establecerNumC(int c)
     {
        numC = c;    
     }
     
     //Se establece el cuarto numero.
     public void establecerNumD(int d)
     {
        numD = d;    
     }
     //Este metodo calcula el numero mayor de los 4.
     public void calcularNuMayor()
     {
        //Si numero 1 es mayor que los otros
        if (numA > numB && numA > numC && numA > numD)
           nuMayor = numA;
        //Si numero 2 es mayor que los otros
        else
          if (numB > numC && numB > numD)
             nuMayor = numB;
          //Si numero 3 es mayor que los otros
          else
             if (numC > numD)
                nuMayor = numC;
             //Si numero 4 es mayor que los otros
             else
                nuMayor = numD;
     }
 
    //Metodo para obtener el numero mayor.
     public int obtenerNuMayor()
     {
        return nuMayor;
     }
}


