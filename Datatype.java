package module1;

/*
 * Data Types in Java:
 * Data types specify the type of value a variable can store.
 * They are classified into:
 * 1. Primitive Data Types
 * 2. Non-Primitive Data Types
 */

public class Datatype {

    public static void main(String[] args) {

        // ===============================
        // PRIMITIVE DATA TYPES
        // ===============================

        // Integer Type (real-time example: student marks)
        int marks = 85;
        System.out.println("Marks (Integer): " + marks);

        // Decimal / Floating Type (real-time example: product price)
        double price = 199.99;
        System.out.println("Product Price (Decimal): " + price);

        // Character Type (real-time example: grade)
        char grade = 'A';
        System.out.println("Grade (Character): " + grade);

        // Boolean Type (real-time example: login status)
        boolean isLoggedIn = true;
        System.out.println("Login Status (Boolean): " + isLoggedIn);


        // ===============================
        // NUMBER LITERALS EXAMPLES
        // ===============================

        int decimalLiteral = 120;     // Decimal literal
        int binaryLiteral = 0b1010;   // Binary literal
        int octalLiteral = 012;       // Octal literal
        int hexLiteral = 0x1F;        // Hexadecimal literal

        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hex Literal: " + hexLiteral);


        // ===============================
        // NON-PRIMITIVE DATA TYPES
        // ===============================

        // String (real-time example: student name)
        String studentName = "Abhishek";
        System.out.println("Student Name (String): " + studentName);

        // Array (real-time example: storing multiple marks)
        int[] marksArray = {85, 90, 78};
        System.out.println("First Subject Marks (Array): " + marksArray[0]);

    }
}