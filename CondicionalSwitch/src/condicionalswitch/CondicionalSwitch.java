package condicionalswitch;

public class CondicionalSwitch {

    public static void main(String[] args) 
    {
        int numero = 4;
        String mes;
        
        switch(numero) 
        {
            case 1 -> { 
                mes = "Enero";
                System.out.print("Mes: " + mes);
            }
            case 2 -> { 
                mes = "Febrero";
                System.out.print("Mes: " + mes);
            }
            case 3 -> { 
                mes = "Marzo";
                System.out.print("Mes: " + mes);
            }
            case 4 -> { 
                mes = "Abril";
                System.out.print("Mes: " + mes);
            }
            case 5 -> { 
                mes = "Mayo";
                System.out.print("Mes: " + mes);
            }
            case 6 -> { 
                mes = "Junio";
                System.out.print("Mes: " + mes);
            }
            case 7 -> { 
                mes = "Julio";
                System.out.print("Mes: " + mes);
            }
            case 8 -> { 
                mes = "Agosto";
                System.out.print("Mes: " + mes);
            }
            case 9 -> { 
                mes = "Septiembre";
                System.out.print("Mes: " + mes);
            }
            case 10 -> { 
                mes = "Octubre";
                System.out.print("Mes: " + mes);
            }
            case 11 -> { 
                mes = "Noviembre";
                System.out.print("Mes: " + mes);
            }
            case 12 -> { 
                mes = "Diciembre";
                System.out.print("Mes: " + mes);
            }
            default -> System.out.print("Ingreso un númeor invalido");                    
        }
    }
    
}
