import java.util.Scanner;
public class areas {
    
    // area of circle
    public static double area(int radius){
        double circle=0;
        circle = Math.PI * Math.pow(radius, 2);
        return circle;
    }
    // area of rectangle
    public static double area(int length, int width){
        double rectangle=0;
        rectangle = length*width;   
        return rectangle;
    }
    // area of trapezoid
    public static double area(int height, int base1, int base2){
        double trapezoid=0;
        trapezoid = (height*((base1 + base2)/2));
        return trapezoid;
    }
    
    // main method
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter circle, rectangle, or trapezoid.");
        switch (myScanner.next()){
            case "circle":
                System.out.println("Enter radius of circle.");
                double c = area(myScanner.nextInt());
                System.out.println("The area of the circle is: "+c);
                break;
            case "rectangle":
                System.out.println("Enter length and width of rectangle.");
                double r = area(myScanner.nextInt(), myScanner.nextInt());
                System.out.println("The area of the reactangle is: "+r);
                break;
            case "trapezoid":
                System.out.println("Enter height, base 1, and base 2 of trapezoid in that order.");
                double t = area(myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt());
                System.out.println("The area of the trapezoid is: "+t);
                break;
            default:
                System.out.println("not valid");
        }
    }
}