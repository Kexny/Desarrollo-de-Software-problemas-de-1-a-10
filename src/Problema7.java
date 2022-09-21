import java.util.Scanner;
public class Problema7 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3, promedio;
        System.out.println("Introduzca el primer numero");
        n1 = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        n2 = scan.nextInt();
        System.out.println("Introduzca el tercero numero");
        n3 = scan.nextInt();

        //El numero mayor
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("El mayor es: " + n1);
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println("El mayor es: " + n2);
        }
        else
        {
            System.out.println("El mayor es: " + n3);
        }

        //El numero menor
        if(n1 < n2 && n1 < n3)
        {
            System.out.println("El menor es: " + n1);
        }
        else if(n2 < n1 && n2 < n3)
        {
            System.out.println("El menor es: " + n2);
        }
        else
        {
            System.out.println("El menor es: " + n3);
        }

        //Promedio
        promedio = n1+n2+n3;
        System.out.println("El promedio es: " + promedio);

        scan.close();
    }
}