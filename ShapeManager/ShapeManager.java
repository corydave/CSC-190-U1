package ShapeManager;
// NAME: Brian Coe
// DATE: 06/11/2020
// PROGRAM DESCRIPTION: Java program to return details of a circle or square based on the user input.

// Skeleton code provided by Dave Ghidiu - FLCC

import java.util.Scanner;
import java.util.ArrayList;

public class ShapeManager {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the shape party!");
        
        // Create an ArrayList that can hold objects of type "Circle"  
        ArrayList<Circle> circles = new ArrayList<Circle>();
      
        // Create an ArrayList that can hold objects of type "Square"  
        ArrayList<Square> squares = new ArrayList<Square>();
        
        int choice = 0;
        
        while (choice != 4) {
            
            displayMenu();
            
            System.out.println("Your choice?");
            choice = scanner.nextInt();
            
            switch (choice) {
                
                case 1:  addCircle(scanner, circles);
                         break;
                case 2:  addSquare(scanner, squares);
                         break;                        
                case 3:  listShapes(circles, squares);
                         break;                
                case 4:  break;
                default: System.out.println("Not a valid choice.");
                         break;                
                         
            }
            
        }
        
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void addCircle(Scanner scanner, ArrayList<Circle> circles) {
        
        System.out.println("Enter a radius:");
        int radius = scanner.nextInt();

        Circle circle01 = new Circle(radius,"CIRCLE");

        System.out.println("You created a circle with radius of " + circle01.getRadius());
        System.out.println();
 
    }
    
    public static void addSquare(Scanner scanner, ArrayList<Square> squares) {
        
        System.out.println("STUB CODE - addSquare");

    }    
    
    public static void listShapes(ArrayList<Circle> circles, ArrayList<Square> squares) {
        
        System.out.println("STUB CODE - List");
      
        System.out.println("The circles are:");
        
        // This line of code is so you do not have to count the dashes :)
        System.out.println("-------------------------------");
        
    }
    
    public static void displayMenu() {

        System.out.println("Please select from the following options:");
        System.out.println("\t1. Create a circle");
        System.out.println("\t2. Create a Square");
        System.out.println("\t3. List all shapes and their properties");
        System.out.println("\t4. Quit");
              
    }

}