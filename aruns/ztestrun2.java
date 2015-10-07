import java.util.Scanner;
public class ztestrun2 {
    public static void main(String [] args) {

    int i;
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    i = myScanner.nextInt();

    while (((i%5)!=0)){
        
            System.out.print("Enter next integer: ");
            i = myScanner.nextInt();
        }
    }
}
