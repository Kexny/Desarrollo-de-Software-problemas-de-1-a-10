import java.util.Scanner;
public class Problema9 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Introduzca el numero ascii");
        num = scan.nextInt();

        while(num<0 || num>255)
        {
            System.out.println("Error");
            System.out.println("Introduzca otro valor ascii");
            num = scan.nextInt();
        }   
        System.out.println((char)num);
        scan.close();
    }
}
