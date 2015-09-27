// calculator program from lab 4
// continue asking user for input until they reply n or N
// to the question 'Type n or N to stop'

import java.util.Scanner;
public class CalculatorSpecial {
    public static void main(String [] args) {

// loop
    boolean Y=true;
    boolean n=true;
    boolean N=true;
    while (Y != n || N){

// enter integers for calculator
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = myScanner.nextInt();
                System.out.print("Enter second integer: ");
        int b = myScanner.nextInt();
        System.out.print("Enter operator: ");

// scanner for operator above in the switch statement below
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

// ask for stop after switch
    System.out.println("Type n or N to stop");
    System.out.println(Y);
        }
    }
}