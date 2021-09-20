import java.util.Scanner;

public class areaOfrectangle{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Length and breadth: ");
        int l = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Area of rectangle: "+ (l*b));
        

    }
}    