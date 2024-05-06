package javaprogramme;

// Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class Pro15LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Nested loop to print the left-angle triangle
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }

}
