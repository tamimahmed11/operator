import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        /*
         * kind of operator 
         * 1.Arithmetic operator
         * 2. Assignment operator 
         * 3.Relational operator
         * 4.Logical  operator
         * 5.Conditional operator
         * 6.Unary operator
         * 7.Unary operator
         * 8.Bitwise operator
         * 9.Special operator
         * 
         * 
         */
    //    int num1,num2,result;
    //    num1 =25;
    //    num2= 2;
    //    result=num1+ num2;
    //    System.out.println("This is sum : "+result);

    //    result=num1- num2;
    //    System.out.println("This is sub : "+result);

    //    result=num1 % num2;
    //    System.out.println("This is mode : "+result);

    //    result=num1* num2;
    //    System.out.println("This is Multyplaying number  : "+result);

    //    result=num1 / num2;
    //    System.out.println("This is divided : "+result);
    Scanner input =new Scanner(System.in);
    int num1, num2, result;
    System.out.println("Enter First number : ");
    num1=input.nextInt();
     System.out.print("Enter 2nd number : ");
     num2=input.nextInt();

     result=num1+ num2;
    System.out.println("This is sum : "+result);

     result=num1- num2;
    System.out.println("This is sum : "+result);

     result=num1/ num2;
    System.out.println("This is sum : "+result);

     result=num1%num2;
    System.out.println("This is sum : "+result);



    }
    
}
