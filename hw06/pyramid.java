// using combination of loops
// ask the user what size pyramid they want to display
// print a scalable pyramid
import java.util.Scanner;
public class pyramid {
    public static void main(String [] args) {

// declare variables
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter size of pyramid: ");
    int userInput = myScanner.nextInt();
    int numberStars = 1;

// loop
    for (int a=1; a<=userInput; a++){
        // limit and increment of stars
        for (int b=1; b<=numberStars; b++){
            System.out.print("*");
        }
        // increasing number of stars b4 move on to next line
        numberStars+=2;
        System.out.println();
        }
    }
}