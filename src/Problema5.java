import java.util.Scanner;
public class Problema5 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un valor de 5 cifras");
        numero = scan.nextInt();
        System.out.println(numero/10000);
        System.out.println(numero/1000);
        System.out.println(numero/100);
        System.out.println(numero/10);
        System.out.println(numero);
        scan.close();
    }//Final main
}//Final class