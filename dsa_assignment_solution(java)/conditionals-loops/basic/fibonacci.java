import java.util.Scanner;

public class fibonacci{
    public static void main(String[] arr){
        int a=0;
        int b=1,c;
        System.out.println(a);

        for(int i=1; i<20; i++){
            System.out.println(c = a+b);
            a=b;
            b=c;
        }
    }
}