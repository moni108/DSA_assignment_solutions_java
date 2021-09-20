import java.util.Scanner;

public class simpleinterest{
    public static void main(String[] arr){
        Scanner scan =new Scanner(System.in);
        int p = scan.nextInt();
        int t = scan.nextInt();
        int r = scan.nextInt();

        int SI = (p*r*t) /100;

        System.out.println(SI);
        
    }
}