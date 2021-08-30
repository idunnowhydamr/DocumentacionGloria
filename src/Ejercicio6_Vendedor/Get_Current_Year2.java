import java.util.*;
  
class Get_Current_Year2 {
  
    public static void main(String args[])
    {
        // Crear obejto de calendar
        Calendar c
            = new GregorianCalendar(
                1991, 2, 11);
  
        /*Obtener el dia, el mes y el año del objeto calendar.
        * Se pasan a String para almacenar el dato completo en una variable
        */
        String año = String.valueOf(c.get(Calendar.YEAR));
        String mes= String.valueOf(c.get(Calendar.MONTH));
        String dia = String.valueOf(c.get(Calendar.DATE));
       
        // Printing the year
        System.out.println("Día: " + dia+" Mes: "+mes+" Año: "+año);
    }
}