import java.util.Scanner;

public class largest{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if(num1>num2){
            System.out.println(num1+" is Largest");
        }
        else{
            System.out.println(num2+" is Largest");
        }

    }
}