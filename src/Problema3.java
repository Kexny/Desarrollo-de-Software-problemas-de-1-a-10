import java.util.Scanner;
public class Problema3 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Double a, b, c, triangulo, area = 0.0, perimetro=0.0, sp;

        System.out.println("¿Que triangulo desea calcular?");
        System.out.println("0.Triángulo equilátero");
        System.out.println("1.Triángulo isósceles");
        System.out.println("2.Triángulo escaleno");
        triangulo = scan.nextDouble();

        if(triangulo==0)
        {
            System.out.println("Triángulo equilátero");
            System.out.println("Introduzca los lados iguales");
            a = scan.nextDouble();

            area = (Math.sqrt(3)/(4)*Math.pow(a, 2 ));
            perimetro = 3*a;
        }

        else if(triangulo==1)
        {
            System.out.println("Triángulo isósceles");
            System.out.println("Instroduzca la base");
            b = scan.nextDouble();
            System.out.println("Introduzca los lados");
            a = scan.nextDouble();

            area= b * (Math.sqrt((Math.pow(a, 2))-((Math.pow(b, 2))/4)));
            area = area / 2;
            perimetro = 2 * a + b;
        }

        else if(triangulo==2)
        {
            System.out.println("Triángulo escaleno");
            System.out.println("Instroduzca el lado a");
            a = scan.nextDouble();
            System.out.println("Instroduzca el lado b");
            b = scan.nextDouble();
            System.out.println("Instroduzca el lado c");
            c = scan.nextDouble();

            sp= (a+b+c)/2;
            area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
            perimetro = a+b+c;
        }

        else
        {
            System.out.println("Respuesta invalida");
        }

        System.out.println("El area del triángulo es: " + area);
        System.out.println("El perimetro del triángulo es: " + perimetro);
        scan.close();
    }//Final main
}//Final class