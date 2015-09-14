import java.util.Scanner;
public class Timer {
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the current time: ");
        double currentTime = myScanner.nextDouble();
        System.out.print("Enter the time you will be eating dinner: ");
        double dinnerTime = myScanner.nextDouble();

        double timeLeftTillDinner = dinnerTime-currentTime;
        int hourLeftTillDinner = (int)(timeLeftTillDinner/100);
        int minuteLeftTillDinner = (int)(timeLeftTillDinner-
            (hourLeftTillDinner*100));
        
        System.out.println("You have "+hourLeftTillDinner+"hours and "+
            minuteLeftTillDinner+"minutes until dinner.");
    }
}