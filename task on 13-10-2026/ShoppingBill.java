/**
 * Task 01 - Shopping Bill - 14/10/2026
 * Kiran Academy Task
 * Student: Prathamesh Mowade
 *
 * Problem Statement:
 * Five item amounts a, b, c, d, e are supplied directly as method arguments.
 * No Scanner, input(), or any input-taking code is used.
 * Every calculation method returns its amount; the main calculation method
 * returns the final payable amount.
 */
public class ShoppingBill {

    // Step 1: Add a + b, then add 18% GST. For 100 and 100: return 236.00
    public static double calculateElectronicsGST(double a, double b) {
        double base = a + b;
        return base + (base * 0.18);
    }

    // Step 2: Add c + d, then add 13% GST. For 100 and 100: return 226.00
    public static double calculateFashionGST(double c, double d) {
        double base = c + d;
        return base + (base * 0.13);
    }

    // Step 3: Add 7% GST to e. For 100: return 107.00
    public static double calculateFoodGST(double e) {
        return e + (e * 0.07);
    }

    // Step 4: Call the three GST methods and add their returned amounts. For sample: return 569.00
    public static double totalBill(double a, double b, double c, double d, double e) {
        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);
        return electronics + fashion + food;
    }

    // Step 5: Call totalBill(), calculate 20% discount on that total, subtract discount, and return final payable amount
    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        return total - discount;
    }

    public static void main(String[] args) {
        // Sample Test Values
        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        // Perform calculations
        double electronicsGST = calculateElectronicsGST(a, b);
        double fashionGST = calculateFashionGST(c, d);
        double foodGST = calculateFoodGST(e);
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        double finalPayable = calculateDiscountedBill(a, b, c, d, e);

        // Display Detailed Breakdown
        System.out.println("======================================================================");
        System.out.println("           SHOPPING BILL -- GST FIRST, DISCOUNT AFTER                 ");
        System.out.println("======================================================================");
        System.out.printf("Electronics: (%.2f + %.2f) + 18%% GST = %.2f\n", a, b, electronicsGST);
        System.out.printf("Fashion:     (%.2f + %.2f) + 13%% GST = %.2f\n", c, d, fashionGST);
        System.out.printf("Food:        %.2f + 7%% GST          = %.2f\n", e, foodGST);
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Total after GST                     = %.2f\n", total);
        System.out.printf("20%% discount on %.2f               = %.2f\n", total, discount);
        System.out.printf("Final payable amount                = %.2f\n", finalPayable);
        System.out.println("======================================================================");
        // Expected Output Summary
        System.out.printf("Total after GST = %.2f | Discount = %.2f | Final payable amount = %.2f\n",
                total, discount, finalPayable);
        System.out.println("======================================================================");
    }
}
