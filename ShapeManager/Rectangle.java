public class Rectangle {
    
    static final double VERSION = 1.1;
    
    // INSTANCE VARIABLES
    double length;
    double width;
    
    // CONSTUCTORS
    public Rectangle (double l, double w) {
        length = l;
        width = w;
    }
    
    public Rectangle (double s) {
        length = s;
        width = s;
    }
    
    public Rectangle () {
        length = 10;
        width = 5;
    }
    
    // METHODS
    public static double getVersion() {
        return VERSION;
    }
    
    public void computeArea() {
        System.out.println("\tThe area is:" + (length * width));
    }

    public void computePerimeter() {
        System.out.println("\tThe perimeter is: " + ((length + width)*2));
    }    
    
}
