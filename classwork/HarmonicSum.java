import java.util.Scanner;
public class HarmonicSum {
    public static void main(String [] args) {
        double n=0;
        double sum=0;
        for(n=1;n<=50000;n++){
            sum+=(1/n);
        }
        for (n=50000;n>=1;n--);
        
    System.out.println("Sum: "+sum);
    }
}