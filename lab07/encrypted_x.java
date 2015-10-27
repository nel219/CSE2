
import java.util.Scanner;
public class encrypted_x {
    public static void main(String [] args) {
    
// declaring variables
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter dimensions of square board: ");
    int input = myScanner.nextInt();
    
// validate input with if statement
        if (input>=1 && input<=100){
            System.out.println("Size of board: "+input+"x"+input);
        }
        else {
            System.exit(-1);
        }

// loops
// i is rows j is columns
        for (int i = 0; i < input; i++){            // how many lines printed
            for (int j = 0; j < input; j++){        // what will be printed on each line
                if ((j==i) || (i==(input-(j+1)))){  // print the \ or / part of the x
                    System.out.print(" ");
                }
                else if ((j!=i) || (i!=(input-(j+1)))){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}