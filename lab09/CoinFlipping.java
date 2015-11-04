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
        int coinFlip;
        // result of coin flip
        coinFlip = (int)(Math.round(Math.random()));
        // print result based on random number
        switch(coinFlip){
            case 0:
                System.out.println("Result: Heads");
                break;
            case 1:
                System.out.println("Result: Tails");
                break;
        }
        // return result
        return coinFlip;
    }
    
// flip method, parameter
    public static int[] numberFlips(){
        System.out.println("Enter number of times to flip.");
        Scanner myScanner = new Scanner(System.in);
        // n=total number of times flipped
        int n = myScanner.nextInt();
        int totalTails = 0;
        for (int i=0; i<n; i++){
            // saved total number of tails b/c tails=1
            int aFlip = flip();
            // total # tails = sum of coinflip results
            totalTails = totalTails+(aFlip);
        }
        // need return 2 values so use array
        int [] arr = new int[2];
        arr[0] = totalTails;
        arr [1] = n;
        return arr;
    }
    
// main method
    public static void main(String [] args){
        System.out.println("Enter integer between 0 and 100");
        Scanner myScanner = new Scanner(System.in);
        // declare array 2
        int [] arr2= new int[2];
        int totalTails = 0;
        int n = 0;
        int i = myScanner.nextInt();
        if(i==0){
            flip();
        }
        else if(i>0 && i<=100){
            // set array 2 as return value of #flips = array 1
            arr2 = numberFlips();
            totalTails = arr2 [0];
            n = arr2 [1];
            System.out.println("Total tails = "+totalTails);
            System.out.println("Total heads = "+(n-totalTails));
        }
        else{
            System.out.println("End program");
        }
    }
}