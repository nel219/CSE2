// write 3 methods calculating mean, median,
// and void print method to print results of 10 numbers

import java.util.Scanner;       // scanner class
public class methods {          // class

// mean method, returns mean of 10 numbers
    public static double mean(int a, int b, int c, int d, int e, 
                            int f, int g, int h, int i, int j){
        Scanner myScanner = new Scanner(System.in);
        double sum = a+b+c+d+e+f+g+h+i+j;
        double mean = sum/10;
        return mean;
    }

// median method, returns median of 10 numbers
    public static double median(int a, int b, int c, int d, int e, 
                            int f, int g, int h, int i, int j){
        Scanner myScanner = new Scanner(System.in);
        double midVal = e+f;
        double median = midVal/2;
        return median;
    }

//void print method
// declares common variables used and asked user to initialize them
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers from smallest to largest");
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        for (int n = 1; n <= 10; n++){
            System.out.print("Number "+n+" = ");
            switch(n){
                case 1:
                    a=myScanner.nextInt();
                    break;
                case 2:
                    b=myScanner.nextInt();
                    break;
                case 3:
                    c=myScanner.nextInt();
                    break;
                case 4:
                    d=myScanner.nextInt();
                    break;
                case 5:
                    e=myScanner.nextInt();
                    break;
                case 6:
                    f=myScanner.nextInt();
                    break;
                case 7:
                    g=myScanner.nextInt();
                    break;
                case 8:
                    h=myScanner.nextInt();
                    break;
                case 9:
                    i=myScanner.nextInt();
                    break;
                case 10:
                    j=myScanner.nextInt();
                    break;
            }
        }
        // use methods on variables
        System.out.println("The mean value is: "+mean(a, b, c, d,
                            e, f, g, h, i, j));
        System.out.println("The median value is: "+median(a, b, c,
                            d, e, f, g, h, i, j));
    }
}