package ShapeManager;
public class Square {
    
    //private String version = "v1.3.0";
    int side;
    private String name;
    private int myNumber;
    
    private static int number = 1000;
    
    public Square() {
        side = 0;
        name = "";
        myNumber = number;
        number++;
    }
    
    public Square(int s) {
        side = s;
        name = "";
        myNumber = number;
        number++;        
    }
    
    public Square(int s, String n) {
        side = s;
        name = n;
        myNumber = number;
        number++;
    }
    
    // Accessor or a Getter
    public String getName() {
        return name;
    }
    
    public int getSide() {
        return side;
    }
    
    // Mutator or a Setter
    public void setName(String newName) {
        name = newName;
    }
    
    public void setSide(int newSide) {
        side = newSide;
    }
    
    
    
    public int area() {
        return side * side;
    }
    
    public int perimeter() {
        return 4 * side;
    }
    
    public String toString() {
        return "\nThe area is " + area() + " and the name of the square #" + myNumber + " is " + getName();
    }
    
}