import java.util.*;

class hcmandlcm{
    public static void main(String arr[]){
        Scanner scan = new Scanner(System.in);
         int k=2;

        int i=scan.nextInt();
        int j=scan.nextInt();
        
        System.out.println("HCF or LCM-:");
        String c = scan.next();
     
        // System.out.println(c);
        if("hcf".equals(c)){
             while(i!=j){
                if(i>j){
                    i=i-j;
                }
                else{
                    j=j-i;
                }
            }
            System.out.println("GCD or HCL "+i);
        }
        else{
            int h=scan.nextInt();
            while(i*j*h != k){
                if(k%i==0 && k%j==0 && k%h==0){
                    System.out.println(k);
                    break;
                }
                else{
                    k++;
                }
            }
        }
    }
}