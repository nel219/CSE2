// Write method named flip() that use random numbers to simulate flip of a coin
// method should print output of flip in following format
// tail followed by # of tail (0 or 1), head followed by # of head (0 or 1)

// Call flip in main method

// another method named flip() that takes integer (n) as parameter and calls 
// first flip method to simulate n flips of a coin
// method should print the total number of heads and tails

// Modify main method to ask user to enter integer between 0 and 100
// If the user enters 0 call 1st flip method, otherwise call 2nd flip method
// End program when the user enters a number greater than 100


import java.util.Scanner;
public class CoinFlipping {

// flip method, random numbers
    public static int flip(){
        int head = 0;
        int tail = 1;
        
        int coinFlip = randomNum.nextInt(2);
        if(coinFlip == 0){
            
            System.out.println("Heads");
        }
        else{
            
            System.out.println("Tails");
        }
        return coinFlip;
    }
    
// flip method, parameter
    public static int numberFlips(){
        
    }
    
// main method
    public static void main(String [] args){
        System.out.println("Enter integer between 0 and 100");
        Scanner myScanner = new Scanner(System.in);
        int i = myScanner.nextInt();
        if(i==0){
            flip();
        }
        else if(i>0 && i<=100){
            numberFlips();
        }
        else{
            System.out.println("End program");
        }
    }
}





/* http://stackoverflow.com/questions/24174078/simple-coin-toss-using-random-class-in-java-the-do-while-loop-doesnt-seem-to-g
