
package ejerciciológico;

public class EjercicioLógico {

    public static void main(String[] args) 
    {
        //Creamos las variables
       int primerNumero = 35, segundoNumero = 20, aux;
       
       System.out.println("---------------ANTES----------------");
       System.out.println("El primer número es: " + primerNumero);
       System.out.println("El segundo número es: " + segundoNumero);
       
       //Realizamos los intercambios 
       aux = primerNumero;
       primerNumero = segundoNumero;
       segundoNumero = aux;
       
       //Mostramos los resultados en pantalla
       System.out.println("---------------DESPUES----------------");
       System.out.println("El primer número es: " + primerNumero);
       System.out.println("El segundo número es: " + segundoNumero);
    }
    
}
