// enter number of employees timesheets to be read
// first input for each employee is integer that specify pay per hour in cents
// ask for 5 integers representing number of hours worked each of day of week
// Write loop n any code that reads data n stores total payroll of employees
// print total payroll of all employees

import java.util.Scanner;
public class timeSheets {
    public static void main(String [] args) {

// declaring variables
    int totalEmployees;
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter total number of employees: ");
    totalEmployees = myScanner.nextInt();
    
    int payPerHour=0;
    System.out.println("Enter amount employee is paid per hour in cents: ");
    payPerHour = myScanner.nextInt();
    
    int hoursMonday=0;
    System.out.println("Enter number hours employee worked Monday: ");
    hoursMonday = myScanner.nextInt();
    
    int hoursTuesday=0;
    System.out.println("Enter number hours employee worked Tuesday: ");
    hoursTuesday = myScanner.nextInt();
    
    int hoursWednesday=0;
    System.out.println("Enter number hours employee worked Wednesday: ");
    hoursWednesday = myScanner.nextInt();
    
    int hoursThursday=0;
    System.out.println("Enter number hours employee worked Thursday: ");
    hoursThursday = myScanner.nextInt();
    
    int hoursFriday=0;
    System.out.println("Enter number hours employee worked Friday: ");
    hoursFriday = myScanner.nextInt();
    
    int amountPaid=0;
    
// loop and nested loops
    while (totalEmployees>0){
        if (int i=totalEmployees){
            amountPaid=((hoursMonday+hoursTuesday+hoursWednesday+hoursThursday+hoursFriday)*payPerHour);
            
        // enter next employees info
            System.out.println("Enter anount next employee is paid per hour: ");
payPerHour = myScanner.nextInt();
System.out.println("Enter number hours employee worked Monday: ");
hoursMonday = myScanner.nextInt();
System.out.println("Enter number hours employee worked Tuesday: ");
hoursTuesday = myScanner.nextInt();
System.out.println("Enter number hours employee worked Wednesday: ");
hoursWednesday = myScanner.nextInt();
System.out.println("Enter number hours employee worked Thursday: ");
hoursThursday = myScanner.nextInt();
System.out.println("Enter number hours employee worked Friday: ");
hoursFriday = myScanner.nextInt();
}
        else{
            System.out.println();
        }
            

        }
    int totalPay = (amountPaid*totalEmployees);
    System.out.println("Total payroll of all employees: "+totalPay);
        }
    }








    }
}








// you will have to add up the numbers worked by each 
// employee and multiply that by that particular employee’s pay rate to 
// get the employee’s pay for the week – and sum those values into total