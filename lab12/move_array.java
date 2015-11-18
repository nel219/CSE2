//

import java.util.Scanner;
public class move_array {
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        
        try{
            // Ask user to specify size of array >0
            System.out.println("Enter size of array.");
            int size = myScanner.nextInt();                 // obtain array size
            int [] array = new int[size];                   // declare int array
            for (int i=0; i<size; i++){
                int randomN = (int)(Math.random() * 100);   // obtain random #
                array[i] = randomN;                         // assign random # to array
                // print original to compare
                System.out.println("Original array["+i+"] = "+array[i]);
            }
            
            
            // Ask user to enter value of array index to be moved
            // 0 < value < array length-1

            System.out.println("Enter value of array index to be moved.");
            int index = myScanner.nextInt();            // obtain index position
            // check if index is valid aka exsists
            try{
                // only purpose of check variable is to exist for java to check value validity
                int check = array[index];
            }
            // catch if invalid index entered
            catch(Exception e){
                System.out.println("Invalid index. End program.");
            }
            
            // Move value at index '0 to array length' to end of array
            if (index==0 && index<array.length){
                int temp = array[index];                // store value at index in temp variable
                // shift all values at position 'index+1' to 'end of array' one position to left
                for(int j=index+1; j<array.length-1; j++){
                    int temp2 = array[j+1];             // store index+1 to temp value
                    array[j+1] = array[j];              // move it back to position index
                    array[j] = temp2;                   // put temp variable in position index
                }
                array[index] = array[array.length-1];   // put temporary variable at end of array
                array[array.length-1] = temp;
            
                // seperate for loop to print shifted array
                // use a different variable but just print the previous loop
                for (int k=0; k<array.length; k++){
                    System.out.println("Shifted array["+k+"] = "+array[k]);
                }
            }
        }
        
        // catch if invalid size entered
        catch(Exception e){
            System.out.println("Invalid size. End Program.");
        }
    }
}