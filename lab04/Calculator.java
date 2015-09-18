// calculator program
// user will enter 2 integers and get a numerical result

import java.util.Scanner;
public class Calculator {
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = myScanner.nextInt();
                System.out.print("Enter second integer: ");
        int b = myScanner.nextInt();
        System.out.print("Enter operator: ");

        switch (myScanner.next()){
            case "+":
                System.out.println("sum = "+(a+b));
                break;
            case "-":
                System.out.println("difference = "+(a-b));
                break;
            case "*":
                System.out.println("product = "+(a*b));
                break;
            case "/":
                System.out.println("quotient = "+(a/b));
                break;
            default:
                System.out.println("illegal operator");
        }
    }
}