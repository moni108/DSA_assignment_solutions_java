import java.util.Scanner;

public class factorial{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long m = n;
        while(n!=1){
            n--;
            m*=n;
        }
        System.out.println("factorial "+m);


    }
}