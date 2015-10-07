import java.util.Scanner;
public class ztestrun {
    public static void main(String [] args) {

    Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = myScanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = myScanner.nextInt();
        System.out.print("Enter third integer: ");
        int c = myScanner.nextInt();
    
            if (a>b){
                System.out.println(b);
            }
            else if (b>c){
                System.out.println(c);
            }
            else if (c>a){
                System.out.println(a);
            }
    }
}