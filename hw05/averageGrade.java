// continuously prompt for grade until 999 is entered
// when 999 entered, exit repitition loop n find avg of entered #'s
// grade of less than 0 or more than 100 is an invalid grade

import java.util.Scanner;
public class averageGrade {
    public static void main(String [] args) {

// declaring variables
    int i;
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter first grade: ");
    i = myScanner.nextInt();
    int sumGrade=0;
    int numberOfGrades=0;
    
// loop and nested if
    while (i!=999){
        if((i>=0) && (i<=100)){
    // find average
            sumGrade+=i;
            numberOfGrades++;
    // have the user enter another grade
            System.out.print("Enter next grade: ");
            i = myScanner.nextInt();
        }
        else{
            System.out.println("Invalid grade");
            break;
        }
    }
    int average=sumGrade/numberOfGrades;
    System.out.println("Average Grade: "+average);
    }
}