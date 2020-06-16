package ShapeManager;
public class Circle {
    
    //private String version = "v1.3.0";
    
    private int radius;
    private String name;
    private int myNumber;
    
    private static int number = 1;
    
    public Circle() {
        radius = 0;
        name = "";
        myNumber = number;
        number++;
    }
    
    public Circle(int r) {
        radius = r;
        name = "";
        myNumber = number;
        number++;        
    }
    
    public Circle(int r, String n) {
        radius = r;
        name = n;
        myNumber = number;
        number++;
    }
    
    // Accessor or a Getter
    public String getName() {
        return name;
    }
    
    public int getRadius() {
        return radius;
    }
    
    // Mutator or a Setter
    public void setName(String newName) {
        name = newName;
    }
    
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    public int getNumber() {
        return myNumber;
    }
    
    public double diameter() {
        return 2 * radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return "\nThe area is " + area() + " and the name of the circle #" + myNumber + " is " + getName();
    }
    
}