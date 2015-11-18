// calculator program
// user will enter 2 integers and get a numerical result

// import scanner class
import java.util.Scanner;
public class Calculator {
    public static void main(String [] args) {
        
        // prompt user to enter amounts to be imput into calculator
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = myScanner.nextInt();
                System.out.print("Enter second integer: ");
        int b = myScanner.nextInt();
        System.out.print("Enter operator: ");

// scanner for operator above in the switch statement below
        switch (myScanner.next()){
            // if user enters +, find sum
            case "+":
                System.out.println("sum = "+(a+b));
                break;
            // if user enters -, find difference
            case "-":
                System.out.println("difference = "+(a-b));
                break;
            // if user enters *, find product
            case "*":
                System.out.println("product = "+(a*b));
                break;
            // if user enters /, find quotient
            case "/":
                System.out.println("quotient = "+(a/b));
                break;
            // if another operation is entered, print default
            default:
                System.out.println("illegal operator");
        }
    }
}