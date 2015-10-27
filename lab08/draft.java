// 3 methods, calculate mean, median, void print mehtod to print results

import java.util.Scanner;       // scanner class
public class methods {          // class

// mean method
    public static double mean(){
        Scanner myScanner = new Scanner(System.in);
        double values = 0;
        double sum = 0;
        System.out.println("Enter 10 numbers");
        for (int i = 1; i <= 10; i++){
            values = myScanner.nextDouble();
            sum+= values;
        }
        double mean = sum/10;
        return mean;
    }

// median method
    public static double median(){
        Scanner myScanner = new Scanner(System.in);
        double values = 0;
        double midVal = 0;
        System.out.println("Enter same 10 numbers from smallest to largest");
        for (int i = 1; i <= 10 ; i++){
            values = myScanner.nextDouble();
            midVal = ((i=5)+(i=6));
        }
        double median = midVal/2;
        return median;
    }

//void print method
    public static void main(String [] args) {
        System.out.println("The mean value is: "+mean());
        System.out.println("The median value is: "+median());
    }
}