//Brian Coe
//06/08/20220
//
import java.util.Scanner;


public class MatrixMath {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] red_pill = new int [2][2];
        int[][] blue_pill = new int [2][2];

        System.out.println("Time to load the first matrix!");
        System.out.println("Enter number 1:");
        red_pill[0][0] = scanner.nextInt();
        System.out.println("Enter number 2:");
        red_pill[0][1] = scanner.nextInt();
        System.out.println("Enter number 3:");
        red_pill[1][0] = scanner.nextInt();
        System.out.println("Enter number 4:");
        red_pill[1][1] = scanner.nextInt();

        System.out.println();

        System.out.println("==    ==");
        System.out.println("| " + red_pill[0][0] + "   " + red_pill[0][1] + " |");
        System.out.println("| " + red_pill[1][0] + "   " + red_pill[1][1] + " |");
        System.out.println("==    ==");
        System.out.println();
        System.out.println();

        System.out.println("Time to load the second matrix!");
        System.out.println("Enter number 1:");
        blue_pill[0][0] = scanner.nextInt();
        System.out.println("Enter number 2:");
        blue_pill[0][1] = scanner.nextInt();
        System.out.println("Enter number 3:");
        blue_pill[1][0] = scanner.nextInt();
        System.out.println("Enter number 4:");
        blue_pill[1][1] = scanner.nextInt();

        System.out.println();

        System.out.println("==    ==");
        System.out.println("| " + blue_pill[0][0] + "   " + blue_pill[0][1] + " |");
        System.out.println("| " + blue_pill[1][0] + "   " + blue_pill[1][1] + " |");
        System.out.println("==    ==");
        System.out.println();

        System.out.println("Matrix A added to Matrix B is:");
        System.out.println();

        System.out.println("==    ==");
        System.out.println("| " + (blue_pill[0][0] + red_pill[0][0]) + "   " + (blue_pill[0][1] + red_pill[0][1]) + " |");
        System.out.println("| " + (blue_pill[1][0] + red_pill[1][0]) + "   " + (blue_pill[1][1] + red_pill[1][1]) + " |");
        System.out.println("==    ==");
        System.out.println();

        System.out.println("Matrix B subtracted from Matrix A is:");
        System.out.println();

        System.out.println("==    ==");
        System.out.println("| " + (red_pill[0][0] - blue_pill[0][0]) + "   " + (red_pill[0][1] - blue_pill[0][1]) + " |");
        System.out.println("| " + (red_pill[1][0] - blue_pill[1][0]) + "   " + (red_pill[1][1] - blue_pill[1][1]) + " |");
        System.out.println("==    ==");
        System.out.println();

        System.out.println("GAME OVER MAN!");


        scanner.close();
    }
}