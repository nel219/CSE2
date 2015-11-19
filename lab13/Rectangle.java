// non static methods

public class Rectangle {
    // declare two non static global variables, right below public class
    double width=0;
    double height=0;
    
    // non static method setWidth
    // take double as argument, set value of width to one of the argument
    public void setWidth(double x){
        width = x;
    }
    
    // non static method setHeight
    // take double as argument, set value of height to one of the argument
    public void setHeight(double y){
        height = y;
    }
    
    // non static method getArea
    // takes no argument, returns product of height width
    public double getArea(){
        double area = width*height;
        return area;
    }
    
    // main method
    public static void main(String [] args){
        // variable r1 of type Rectangle
        Rectangle r1 = new Rectangle();
        // use setHeight and setWidth to initialize height and width of r1
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        // print value of r1 area
        System.out.println(r1.getArea());
    }
}