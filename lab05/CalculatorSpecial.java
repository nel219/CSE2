// calculator program from lab 4
// continue asking user for input until they reply n or N
// to the question 'Type n or N to stop'

import java.util.Scanner;
public class CalculatorSpecial {
    public static void main(String [] args) {

// loop, set boolean values
    boolean Y=true;
    boolean n=true;
    boolean N=true;
    while (Y != n || N){
    // while loop continues until loop manually broken

// enter integers for calculator
// ask user to input numbers and an operator
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = myScanner.nextInt();
                System.out.print("Enter second integer: ");
        int b = myScanner.nextInt();
        System.out.print("Enter operator: ");

// scanner for operator above in the switch statement below
// find sum, difference, product, and quotient accordingly
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