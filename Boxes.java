// Dave Ghidiu
// Boxes

import java.util.Scanner;

public class Boxes {
    
    // Create a global, static variable that is the maximum width
    // of a box.
    static final int LIMIT = 30;
    
    public static void main (String[] args ) {
        
        // Instantiate a Scanner named 'scanner'.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a phrase and store it in 'phrase'.
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();
        
        // Prompt the user for a character to use for the box border.
        // Store it in 'character' (which is a String) and then ensure
        // that only one character is kept.
        System.out.println("\nEnter a character:");
        String character = scanner.nextLine();
        character = character.substring(0, 1);
        
        // Create 'topLine', which uses the method 'determinTopLine()' to 
        // figure out how long it should be. This will also be the bottom line
        // of the box.
        String topLine = determineTopLine(phrase, character);
        
        // Output a blank line.
        System.out.println();
        
        // Output the top border of the box using the 'topLine' String.
        System.out.println(topLine);
        
        // Use the 'parsePhrase' method to output the original String broken
        // into lines no more than 34 characters (including the left and right
        // borders).
        System.out.println(parsePhrase(phrase, character));
        
        // Output the bottom border of the box using the 'topLine' String.
        System.out.println(topLine);
        
        // Output two blank lines.
        System.out.println();
        System.out.println();
        
        // Output "GAME OVER MAN", a signal to the end of your program and
        // also an ode to Bill Paxton from the movie "Aliens".
        System.out.println("GAME OVER MAN!");
        
        scanner.close();
    }


    /*
     * This method should determine the absolute width of the box. The maximum width is 34
     *    - asterisk
     *    - space
     *    - up to 30 characters
     *    - space
     *    - asterisk
     *
     * It is entirely possible the width is fewer than 34 characters though. Consider the 
     * String "this is a test"; the box is only 18 characters wide
     *    - asterisk
     *    - space
     *    - 14 characters
     *    - space
     *    - asterisk
     */
    
    public static String determineTopLine(String phrase, String character) {
        
        String topLine = "";
        int phrase_length = phrase.length();
        int current_length = 0;

        while (current_length < phrase_length) {
            System.out.print(character);
            current_length++;
        }

        //for(int i=0; i != phrase_length; i++){
           //mid_top_line = character;
        //}
        
        
        // Insert yer code here
        
        return topLine;
        
    }

    
    
    /*
     * This method takes two parameters, the "phrase" and the "character". It should return one String. The
     * String that is returned should be no more than 34 characters wide, but it can (and should!) contain 
     * the new line escape character. Don't forget that each line of text should contain:
     *    - asterisk
     *    - space
     *    - up to 30 characters
     *    - space
     *    - asterisk
     */
    public static String parsePhrase(String phrase, String character) {
        
        // Insert yer code here
        
        return ""; // dummy code to make the program work out of the box.
    
    }
    

}













