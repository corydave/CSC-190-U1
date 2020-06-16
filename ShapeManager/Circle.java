public class Circle {
    
    final double VERSION = 1.1;
    
    // INSTANCE VARIABLES
    double radius;
    
    // CONSTRUCTORS
    // Constructor that takes in a double
    public Circle(double r) {
        radius = r;
        System.out.println("You created a circle with radius of " + radius);        
    }
    
    // Default constructor
    public Circle() {
        radius = 1.0;
    }
    
    // METHODS
    public double getVersion() {
        return VERSION;
    }
    
    public void computeArea() {
        // System.out.println("Computing the area of a circle:");
        // System.out.println("PLEASE STAND BY!");
        // System.out.println();
        System.out.println("\tThe area is: " + (Math.PI * Math.pow(radius, 2)));                
    }
    
    public void computeCircumference() {
        // System.out.println("Computing the circumference of a circle:");
        // System.out.println("PLEASE STAND BY!");
        // System.out.println();
        System.out.println("\tThe circumference is: " + (Math.PI * radius * 2));        
    }

    public void computeDiameter() {
        // System.out.println("Computing the diameter of a circle:");
        // System.out.println("PLEASE STAND BY!");
        // System.out.println();
        System.out.println("\tThe diameter is: " + (2 * radius));
    }    
    
}















