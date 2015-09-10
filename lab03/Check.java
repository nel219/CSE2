// get input from user and use the data to perform basic computations
// split check evenly
// use Scanner class to get original check from user, % tip, # ways check split

import java.util.Scanner;

// define a class
public class Check{

// main method required for Java programs
    public static void main(String[] args) {

// Scanner constructor: in order to accept input from STDIN
        Scanner myScanner = new Scanner(System.in);

// after run commands, can accept input
// use System.out.print instead of println so cursor not go to
// beginning of next line after displying prompt in ()
        System.out.print("Enter the original cost of the check in the form xx.xx");

// accept user input using:
        double checkCost = myScanner.nextDouble();
        
// prompt user for tip % they wish to pay and accpet input
        System.out.print("Enter the percent tip you wish to pay in the as a whole number in the form of xx");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;   //convert percent into decimal value

// prompt user for # people and accept input, split check by this #
// enter # people who went for dinner
        System.out.print("Enter the number of people who went out to dinner");
        int numPeople = myScanner.nextInt();

// print out output, output amount each person pay
        double totalCost;
        double costPerPerson;
        int dollars,        // whole dollar amount of cost
            dimes, pennies; // for storing digits right of decimal of cost$
        totalCost = checkCost*(1+tipPercent);
        costPerPerson = totalCost/numPeople;
    // get whole amount, drop fraction of decimals
        dollars = (int)costPerPerson;
    // get dime amount
        dimes = (int)(costPerPerson*10)%10;
        pennies = (int)(costPerPerson*100)%10;
        System.out.println("Each person in group owes $" + dollars +"." 
            + dimes + pennies);
        
    } // end of main method
} // end of class

// all Java statements be placed inside braces of main method