package module1;

import java.util.Scanner;

/*
 * Dynamic Reading in Java:
 * Dynamic reading means taking input from the user at runtime.
 * Scanner class is used for this purpose.
 */

public class DynamicReading {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // ===============================
        // INTEGER INPUT
        // ===============================
        // Real-time example: student marks

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();


        // ===============================
        // DECIMAL INPUT
        // ===============================
        // Real-time example: product price

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();


        // ===============================
        // CHARACTER INPUT
        // Real-time example: grade
        // ===============================

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);


        // ===============================
        // STRING INPUT
        // Real-time example: student name
        // ===============================

        System.out.print("Enter student name: ");
        String name = sc.next();


        // ===============================
        // BOOLEAN INPUT
        // Real-time example: login status
        // ===============================

        System.out.print("Enter login status (true/false): ");
        boolean isLoggedIn = sc.nextBoolean();


        // DISPLAYING OUTPUT

        System.out.println("\n----- User Details -----");
        System.out.println("Marks: " + marks);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Login Status: " + isLoggedIn);

        // Closing scanner
        sc.close();
    }
}