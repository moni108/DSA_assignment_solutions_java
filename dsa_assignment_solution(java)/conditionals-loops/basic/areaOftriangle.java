import java.util.Scanner;

public class areaOftriangle{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Base and Height in cm: ");
        int b = scan.nextInt();
        int h = scan.nextInt();
        System.out.println("Area of triangle: "+ (0.5*(b*h))+" cm^2");
    }
}