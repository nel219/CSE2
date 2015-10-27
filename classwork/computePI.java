import java.util.Scanner;
public class computePI {
    public static void main(String [] args) {
        double pi=0;
        for (int p=1; p<=50000; p+=4){
            pi = (pi+((1/p)-(1/(p+2))));
        }
        System.out.println(4*pi);
    }
}