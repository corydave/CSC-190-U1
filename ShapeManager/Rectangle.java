package ShapeManager;
public class Rectangle {
    
    //private String version = "v1.3.0";
    int length;
    int width;
    private String name;
    private int myNumber;
    
    private static int number = 1;
    
    public Rectangle () {
        length = 0;
        width = 0;
        name = "";
        myNumber = number;
        number++;
    }
    
    public Rectangle (int l, int w) {
        length = l;
        width = w;
        name = "";
        myNumber = number;
        number++;        
    }
    
    public Rectangle (int l, int w, String n) {
        length = l;
        width = w;
        name = n;
        myNumber = number;
        number++;
    }
    
    // Accessor or a Getter
    public String getName() {
        return name;
    }
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    // Mutator or a Setter
    public void setName(String newName) {
        name = newName;
    }
    
    public void setLength(int newLength) {
        length = newLength;
    }
    
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    
    public int area() {
        return length * width;
    }
    
    public int perimeter() {
        return 2 * (length + width);
    }

    public int getNumber() {
        return myNumber;
    }
    
    public String toString() {
        return "\nThe area is " + area() + " and the name of the Rectangle  #" + myNumber + " is " + getName();
    }
    
}