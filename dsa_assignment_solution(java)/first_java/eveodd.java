import java.util.Scanner;


public class eveodd{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        int evorod = scan.nextInt();
        if(evorod % 2 == 0){
            System.out.println(evorod + " value is Even");
        }
        else{
             System.out.println(evorod + " value is Odd");
        }
    }
}