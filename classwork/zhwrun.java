import java.util.Scanner;
public class zhwrun {
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first number");
        double firstNum = myScanner.nextDouble();
        System.out.print("Enter second number");
        double secondNum = myScanner.nextDouble();
        System.out.print("Enter third number");
        double thirdNum = myScanner.nextDouble();
        
        double sum;
        sum = ((firstNum+secondNum)+thirdNum);
        double average = sum/3;
        System.out.println("The average of the 3 numbers is" + average);
    }
}