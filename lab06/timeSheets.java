// enter number of employees timesheets to be read
// first input for each employee is integer that specify pay per hour in cents
// ask for 5 integers representing number of hours worked each of day of week
// Write loop n any code that reads data n stores total payroll of employees
// print total payroll of all employees

import java.util.Scanner;
public class timeSheets {
    public static void main(String [] args) {

// ask user to input number of employees
    int totalEmployees=0;
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter total number of employees: ");
    totalEmployees = myScanner.nextInt();

// declaring variables    
    int hours=0;
    int totalHours=0;
    int amountPaid=0;
    int totalPay=0;
    
// loop and nested loops
// when amounts added, has to be in loops or will only add once
        for (int n=1; n<=totalEmployees; n++){
            System.out.println("Enter amount employee is paid per hour in cents: ");
            int payPerHour = myScanner.nextInt();
            // nested loop: ask to enter number of hours for each employee in loop
            for (int day=1; day<=5; day++){
                System.out.println("Enter number of hours worked for day "+day);
                hours = myScanner.nextInt();
                totalHours += hours;
            }
            // find total pay
            amountPaid = payPerHour*totalHours;
            totalPay += amountPaid;
        }
        System.out.println("Total payroll of all employees in cents: "+totalPay);
    }
}