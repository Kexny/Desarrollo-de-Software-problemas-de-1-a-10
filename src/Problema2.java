import java.util.Scanner;    
public class Problema2 
{
    public static void main(String[] args) 
    {    
        Scanner scan= new Scanner(System.in);
        double catetoA, catetoB, hipotenusa, resp;
        System.out.println("Que lado deseas encontrar? 0=Los lados de catetos , 1=El lado de la hipotenusa");
        resp = scan.nextDouble();

        if(resp==0)
        {
            System.out.println("Introduzca el valor de la hipotenusa");
            hipotenusa=scan.nextDouble();
            System.out.println("Introduzca el valor del cateto");
            catetoA = scan.nextDouble();

            hipotenusa = Math.pow(hipotenusa, 2);
            catetoA = Math.pow(catetoA, 2);
            resp = Math.sqrt(hipotenusa - catetoA);
        }

        else if(resp==1)
        {
            System.out.println("Introduzca el valor del cateto a");
            catetoA = scan.nextDouble();
            System.out.println("Introdusca el calor del cateto b");
            catetoB = scan.nextDouble();
            
            catetoA = Math.pow(catetoA, 2);
            catetoB = Math.pow(catetoB, 2);
            resp = Math.sqrt(catetoA + catetoB);
        }

        else
        {
            System.out.println("Respuesta invalida");
        }

        System.out.println("El valor del lado es: " + resp);
        scan.close();
    }//Final main
}//Final class