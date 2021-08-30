
package ejecutamayor4numeros3;

/**
 * 
 * @author ASUS
 */
class Mayor4Numeros3 {
    private int numA, numB, numC, numD, nuMayor;


     public void establecerNumA(int a)
     {
        numA = a;    
     }

     public void establecerNumB(int b)
     {
        numB = b;    
     }

     public void establecerNumC(int c)
     {
        numC = c;    
     }

     public void establecerNumD(int d)
     {
        numD = d;    
     }

     public void calcularNuMayor()
     {
        if (numA > numB && numA > numC && numA > numD)
           nuMayor = numA;
        else
          if (numB > numC && numB > numD)
             nuMayor = numB;
          else
             if (numC > numD)
                nuMayor = numC;
             else
                nuMayor = numD;
     }
 

     public int obtenerNuMayor()
     {
        return nuMayor;
     }
}


