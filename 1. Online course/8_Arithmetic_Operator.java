package beginnerjava;
import java.util.Scanner;
public class ArithmeticDemo{

    public static void main(String[] args){
        Scanner input=new Scanner(System.in); 
        int num1, num2,result;

       // num1=20;
      //  num2=10;
      
      System.out.print("Enter The First Number: ");
      num1=input.nextInt();
      System.out.print("Enter The Second Number:");
      num2=input.nextInt();

        result=num1+num2;
        System.out.println("Sum = "+result);

        result=num1-num2;
        System.out.println("Sub = "+result);

        result=num1*num2;
        System.out.println("Multiplication = "+result);

        double result2=(double)num1/num2;
        System.out.println("SuDevided = "+result2);

        result=num1%num2;
        System.out.println("Reminder = "+result);

    }
}