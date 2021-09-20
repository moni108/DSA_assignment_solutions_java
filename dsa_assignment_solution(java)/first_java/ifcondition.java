import java.util.Scanner;

public class ifcondition{
    public static void main(String arr[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 =  scan.nextInt();
        System.out.print("Enter what operation you want to perform (+,-,*,/): ");
        char spchar = scan.next().charAt(0);

        if(spchar == '+'){                 //'' this for char and "" this for string.......
            System.out.println("Sum is: "+ (num1+num2));
        }
        else if(spchar == '-'){
              System.out.println("Subtraction is: " + (num1-num2));
        }
        else if(spchar == '*'){
             System.out.println("Multiplication is: "+num1*num2);
        }
        else{
             System.out.println("Divition  is: "+num1/num2);
        }


    }
}