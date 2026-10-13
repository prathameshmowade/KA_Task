public class Hello {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("     Java Basic Programs - Kiran Academy");
        System.out.println("========================================");

        // a) Print Hello World
        System.out.println("\n--- Program (a): Hello World ---");
        System.out.println("Hello, World!");

        // Defining two variables for arithmetic operations
        int num1 = 20;
        int num2 = 6;
        System.out.println("\nVariables initialized: num1 = " + num1 + ", num2 = " + num2);

        // b) Create two variables and print their addition
        System.out.println("\n--- Program (b): Addition ---");
        int sum = num1 + num2;
        System.out.println("Addition (" + num1 + " + " + num2 + ") = " + sum);

        // c) Print their difference
        System.out.println("\n--- Program (c): Difference ---");
        int difference = num1 - num2;
        System.out.println("Difference (" + num1 + " - " + num2 + ") = " + difference);

        // d) Print their multiplication
        System.out.println("\n--- Program (d): Multiplication ---");
        int product = num1 * num2;
        System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + product);

        // e) Print their division
        System.out.println("\n--- Program (e): Division ---");
        int quotient = num1 / num2;
        double exactQuotient = (double) num1 / num2;
        System.out.println("Division (" + num1 + " / " + num2 + ") = " + quotient);
        System.out.println("Exact Division (" + num1 + " / " + num2 + ") = " + exactQuotient);

        // f) Print their modulus
        System.out.println("\n--- Program (f): Modulus ---");
        int remainder = num1 % num2;
        System.out.println("Modulus (" + num1 + " % " + num2 + ") = " + remainder);

        System.out.println("\n========================================");
    }
}
