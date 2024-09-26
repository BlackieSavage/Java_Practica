package holamundo;

public class HolaMundo {

    public static void main(String[] args) 
    {
        System.out.print("Hola mundo"); //Mostramos un mensaje en la consola con la función print
        
        //Tipos de datos en Java
        int entero = 10;
        double decimal = 4.52;
        boolean VOF = false;
        char letra = 'a';
        String texto = "Hola amigos";
        long numeroGrande = 99999999;
               
        //Operadores en Java
        //Aritmeticos
        int x = 10, y = 5, z, w = 20;
        
            //Suma
        z = x + y;
        
            //Resta
        z = x - y;
        
            //Multiplicación
        z = x * y;
        
            //División
        z = x / y;
        
        //Relacionales
        boolean resultado;
        
            //Igualdad
        resultado = x == y; 
        
            //Mayor que
        resultado = x > y;
        
            //Menor que
        resultado = x < y;
        
            //Mayor o igual que
        resultado = x >= y;
        
            //Menor o igual que
        resultado = x <= y;
        
            //Diferente que
        resultado = x != y;
        
        //Condicionales
        
            //Operador Lógico AND
        resultado = (x < y && x < w);
        
            //Operador Lógico OR
        resultado = (x > y || x < w);
        
            //Operador Lógico NOT
        resultado = !(x > y || x < w);
             
    }
    
}
