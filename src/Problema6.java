import java.util.Scanner;
public class Problema6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int inicio=1, num, contador=0;

        System.out.println("Introduzca el valor");
        num= scan.nextInt();

		for (int x = inicio; x <= num; x++) 
        {
			if(esPrimo(x)) 
            {
				contador++;
				System.out.print(String.valueOf(x) + ",");
			}
		}
		System.out.printf("\nTotal: %d", contador);
		scan.close();
    }//Final main

    public static boolean esPrimo(int numero) 
    {
		if (numero == 0 || numero == 1 || numero == 4) 
        {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) 
        {
			if (numero % x == 0)
				return false;
		}
		return true;
    }//Final main
}//Final class
