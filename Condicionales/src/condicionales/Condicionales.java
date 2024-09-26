package condicionales;

public class Condicionales {

    public static void main(String[] args) 
    {
        double sueldo;
        var categoria = "repositor";
        
        switch (categoria)
        {
            case "repositor":
                sueldo = 15890 * (1 + 10/100.0);
                System.out.print("Su sueldo es: " + sueldo);
                break;
            case "cajero":
                sueldo = 25630.89;
                System.out.print("Su sueldo es: " + sueldo);
                break;
            case "supervisor":
                sueldo = (35560.20 * (1 - 11/100.0));
                System.out.print("Su sueldo es: " + sueldo);
                break;
            default:
                System.out.print("Ingrese una categoría valida");
        }
    }
    
}
