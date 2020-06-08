// NAME: 
// DATE:
// PROGRAM DESCRIPTION:

import java.util.Scanner;

public class TwoDimArray {
    
    public static void main (String[] args) {
        
        // Instantiate the SCANNER
        Scanner scanner = new Scanner(System.in);
        
        // Welcome the user!
        System.out.println("Welcome to the Matrix");
        
        System.out.println();
        
        // Prompt the user for the number of rows and columns
        System.out.println("How many rows?");
        int rows = scanner.nextInt();
        
        System.out.println("How many columns?");
        int cols = scanner.nextInt();

        // Create the two dimensional array based on user input
        int[][] matrix = new int[rows][cols];

        System.out.println();
        
        // Invoke method to "load" the matrix with input from the user
        loadMatrix(matrix, scanner); // Pass the SCANNER into the method
        
        // Invoke method to output the values in the matrix
        outputMatrix(matrix);
        
        System.out.println();
        
        // Output some interesting calculations based on the values in the matrix
        System.out.println("The sum of the four corners is " + sumOfFourCorners(matrix));
        System.out.println("The sum of all the values is " + sumOfAllValues(matrix));
        System.out.println("The sum of the left diagonal is " + sumOfLeftDiagonal(matrix));
        
        System.out.println();
        System.out.println("GAME OVER MAN!");
        
    }
    
    // This method takes in both the matrix and the scanner. It will cycle through
    // every cell in the matrix and load it with values given by the user
    public static void loadMatrix(int[][] matrix, Scanner scanner){
        
        // Place code here
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter data for row " + (i + 1) + ", column " + (j + 1) + ":");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.print("\n");
        }
    }
    
    // This method will output the values in each cell of the matrix. Each row should have
    // a dedicated line of output. The numbers should NOT be formatted.
    public static void outputMatrix(int[][] matrix) {
        
        // Place moar code here
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
    
    // This method will return the sum of the numbers in the four corners of the matrix. That
    // includes the top left, the top right, the bottom left, and the bottom right.
    public static int sumOfFourCorners (int[][] matrix) {
        
        int sum = 0;
        
        // Even moar code here  
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int nw = matrix[0][0];
                int ne = matrix[i][0];
                int sw = matrix[0][j];
                int se = matrix[i][j];

                sum = nw + ne + sw + se;
            }

        }
        return sum;
    }

    // This method will return the sum of EVERY value in the matrix.
    public static int sumOfAllValues (int[][] matrix) {
        
        int sum = 0;
        
        // Yet even moar code!!!
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = matrix[i][j] + sum;
            }

        }

        return sum;
        
    }
    
    // This method will start at [0][0] and progress to [1][1], then [2][2], ... [n][n] and
    // will add each of these values. Note that the test input will always guarantee that
    // the number of rows exceeds the number of columns.
    public static int sumOfLeftDiagonal (int[][] matrix) {
        
        int sum = 0;
        
        // ALL THE CODE!
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j) {
                sum = matrix[i][j] + sum;
                }
            }

        }
        
        return sum;
        
    }    
}























