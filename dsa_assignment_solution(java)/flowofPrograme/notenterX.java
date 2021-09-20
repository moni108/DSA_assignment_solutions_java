import java.util.*;

class notenterX{
    public static void main(String arr[]){
        Scanner scan = new Scanner(System.in);
       
        String n;
        int i=0,a;
        int large=0;

        while(true){
            n=scan.next();
            if("x".equals(n))
            {
                break;
            }
            else{
                i=i+Integer.parseInt(n);
                a=Integer.parseInt(n);
                if(large<a)
                {
                    large=a;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("total sum -: "+i);
        System.out.println("the largest number -: "+large );
    }
}