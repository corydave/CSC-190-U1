import java.util.Scanner;

public class AverageFun {
    public static void main (String[] args) {
        
    // please put your beautiful code here 
    Scanner scanner = new Scanner(System.in);
    
    int numberOfInts = 0;
    int total = 0;
    double average = 0;

    System.out.print("How many numbers do you want to take the average of? \n");
    numberOfInts = scanner.nextInt();
    System.out.print("\n");

    int[] numbers = new int[numberOfInts];

    for (int i = 0; i < numbers.length; i++) {
        System.out.print("Enter a number: \n");
        numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
        total += numbers[i];
    }

    //double doubleOfInts = numberOfInts;
    average = ((total*100.0)/100.0)/numberOfInts;

    System.out.print("\nThe numbers are:\n");
    for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
    }

    System.out.println();

    System.out.print("\nThe numbers in reverse are:\n");
    for (int i = numbers.length-1; i >= 0; i--) {  
        System.out.print(numbers[i] + " ");  
    }

    System.out.println();

    System.out.print("\nThe average is: " + average + "\n");

    System.out.println();

    System.out.print("The average rounded is: " + Math.round(average*10.0)/10.0);
    
        
    scanner.close();
    }

}