import java.util.Scanner;
public class Problema10 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String valor;

        System.out.println("0. Introduzca un valor");
        System.out.println("1. Salir");
        valor = scan.nextLine();

        while(!valor.equals("Salir"))
        {

            if(valor.equals("Salir"))
            {   
                System.out.println("Adios, hasta nunca y no vuelvas :3");
            }
            else
                {
                    System.out.println("0.Introduzca otro valor");
                    System.out.println("Salir");
                    valor = scan.nextLine();

                    if(valor.equals("Salir"))
                    {
                        System.out.println("Adios, hasta nunca y no vuelvas :3");
                    }
                }
        }
        
        scan.close();
    }
}
