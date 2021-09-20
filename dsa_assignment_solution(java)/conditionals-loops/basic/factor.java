import java.util.Scanner;

public class factor{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1;i*i<=n;i++){
             if(n%i==0){
                 if(i*i != n){
                    System.out.println(i+" "+n/i);
                 }
                 else{
                     System.out.println(i);
                 }
             }
        }
    }
}