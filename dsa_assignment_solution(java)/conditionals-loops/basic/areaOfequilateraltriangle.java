import java.util.Scanner;
 
public class areaOfequilateraltriangle{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of Equilateral triangle: ");
        int a = scan.nextInt();

        System.out.println("Area of equilateral triangle is : "+((Math.sqrt(3))*(a*a)/4));
    }
}