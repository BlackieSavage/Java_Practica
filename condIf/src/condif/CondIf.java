package condif;

public class CondIf {

    public static void main(String[] args) 
    {
        //Creamos las variables
        int num1 = 5, num2 = 10;
        
        //Creamos el condicional
        if (num1 < num2)
        {
            //Mostramos un mensaje si la condicion es verdadera
            System.out.print(num1 + " es menor que " + num2);
        }  
        else 
        {
            System.out.print(num1 + " no es menor que " + num2);
        }
    }
    
}
