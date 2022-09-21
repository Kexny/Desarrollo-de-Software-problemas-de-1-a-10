import java.util.Scanner;
public class Problema4 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Double numero;
        System.out.println("Introduzca el numero");
        numero = scan.nextDouble();

        while(numero%2==0)
        {
            System.out.println(numero+"/2 = ");
            numero= numero/2;
            System.out.println(numero);
        }

        while(numero%3==0)
        {
            System.out.println(numero+"/3 = ");
            numero = numero/3;
            System.out.println(numero);
        }

        while(numero%5==0)
        {
            System.out.println(numero+"/5 = ");
            numero= numero/5;
            System.out.println(numero);
        }

        scan.close();
    }//Final main
}//Final class