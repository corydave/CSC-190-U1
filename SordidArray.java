// Brian Coe
// This lab will have the user populate the ArrayList with words and sort it every time

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SordidArray {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        final String SENTINEL = "~*QUIT*~";
        
        // Insert yer wonderful code right here.

        String input = "";

        while (!input.equals(SENTINEL)) {
            System.out.println("Enter a word:");
            input = scanner.nextLine();
            list.add(input);
            list.remove(new String("~*QUIT*~"));
            Collections.sort(list);
            if (input.equals(SENTINEL)) {
                list.remove(new String("~*QUIT*~"));
                break;
            } else {
                System.out.print(list + "\n\n");
            }
        }


        System.out.println("The sorted array looks like this:");
        System.out.println(list);

        
        System.out.println("\n\nGAME OVER MAN!");
        
        scanner.close();
    } // End MAIN method
    
}







