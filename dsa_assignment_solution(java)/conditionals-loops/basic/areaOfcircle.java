import java.util.Scanner;

public class areaOfcircle{
    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);

        // area of circle = 2*3.14*r
        System.out.println("Enter radious or Diameter(r/d):");
        char r_d = scan.next().charAt(0);
        System.out.println("Enter value: ");
        double num = scan.nextDouble();

        if(r_d == 'r'){
            System.out.println("Area of circle: "+ 3.14*num*num);
        }
        else{
              System.out.println("Area of circle: "+ (3.14/4)*num*num);
        }
    }
}