import java.util.Scanner;
public class average {
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        
        // array of integers of  size (n)
        System.out.println("Enter amount of number to be averaged.");
        int n = myScanner.nextInt();
        int[] arr = new int [n];
        int randomN = 0;
        int sum=0;
        double average=0;
        
        // for loop, initialize array w/ n Random # between 0 and 100
        for (int i=0; i<n; i++){
            randomN = (int)(Math.random() * 100);
            arr[i] = randomN;
            System.out.println("arr[" + i + "] = " + arr[i]);
            sum = sum + randomN;
        }
        
        // average
        average = sum/n;
        System.out.println("Average = "+average);
        
        // print values greater than or equal to average
        System.out.println("Values greater than average:");
        for(int j=0; j<n; j++){
            if(arr[j]>=average){
                System.out.println(arr[j]);
            }
        }
    }
}