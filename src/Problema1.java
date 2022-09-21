import java.util.Scanner;
public class Problema1 {
    public static void main(String[] args) {

        Scanner celcius = new Scanner(System.in);
            float c, F;
            System.out.println("Valor de celcius: "); 
            c = celcius.nextFloat();           
            F= (c*9/5)+32;
            System.out.println("Grados fahrenheit: " + F );
            celcius.close();       
    }//Final main
}//Final class
