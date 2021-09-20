import java.io.*; 
import java.util.Scanner;

class leapyear {
    public static void main(String arr[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two year value");
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=i+j;

        if(k%4==0){
            if(k%100==0){
                System.out.println(k+" is not a leap");
            }
            else{
                System.out.println(k+" is Leap");
            }
        }
        else{
            System.out.println(k+" is not a leap");    
        }
        
    }
}