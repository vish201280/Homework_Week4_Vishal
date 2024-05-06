package javaprogramme;

// Write a program in Java to display the pattern like a diamond.
//   While loop

import java.util.Scanner;

public class Pro14DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
            return;
        }

        int spaces = rows / 2;
        int stars = 1;

        // Upper half of the diamond
        int i = 1;
        while (i <= rows / 2 + 1) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces--;
            stars += 2;
            i++;
        }

        // Lower half of the diamond
        spaces = 1;
        stars = rows - 2;
        while (i <= rows) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces++;
            stars -= 2;
            i++;
        }

        scanner.close();
    }

    // Function to print spaces
    public static void printSpaces(int spaces) {
        while (spaces > 0) {
            System.out.print(" ");
            spaces--;
        }
    }

    // Function to print stars
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
