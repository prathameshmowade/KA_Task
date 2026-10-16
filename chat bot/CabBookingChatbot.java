import java.util.Random;
import java.util.Scanner;

/**
 * Kiran Academy - Java Programming Task 02
 * Task Name: Cab Booking Chatbot — Menu, Fare & OTP Rules
 * Date: 16 October 2026
 */
public class CabBookingChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=====================================================");
        System.out.println("      WELCOME TO KIRAN ACADEMY CAB BOOKING BOT       ");
        System.out.println("=====================================================");

        // Step 1: Main menu running continuously using while(true)
        while (true) {
            System.out.println("\n------------------- MAIN MENU -------------------");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");

            String mainChoice = scanner.nextLine().trim();

            if (mainChoice.equals("1")) {
                handleRideBooking(scanner, random);
            } else if (mainChoice.equals("2")) {
                // Step 7: Exit cleanly with goodbye message
                System.out.println("\n=====================================================");
                System.out.println("Thank you for using Cab Booking Chatbot! Safe travels!");
                System.out.println("=====================================================");
                break;
            } else {
                System.out.println(">> [Error] Invalid choice! Please enter 1 or 2.");
            }
        }

        scanner.close();
    }

    /**
     * Handles the ride booking flow:
     * 1. Cab type selection
     * 2. Route selection
     * 3. Fare calculation & summary
     * 4. Confirmation / Cancellation before OTP
     * 5. OTP generation & ride lock
     */
    private static void handleRideBooking(Scanner scanner, Random random) {
        // Step 2: Choose cab type
        String cabType = "";
        int ratePerKm = 0;

        while (true) {
            System.out.println("\n--- SELECT CAB TYPE ---");
            System.out.println("1. Auto  (Rs. 12/km)");
            System.out.println("2. Sedan (Rs. 18/km)");
            System.out.println("3. SUV   (Rs. 25/km)");
            System.out.print("Enter your choice (1-3): ");

            String cabChoice = scanner.nextLine().trim();

            if (cabChoice.equals("1")) {
                cabType = "Auto";
                ratePerKm = 12;
                break;
            } else if (cabChoice.equals("2")) {
                cabType = "Sedan";
                ratePerKm = 18;
                break;
            } else if (cabChoice.equals("3")) {
                cabType = "SUV";
                ratePerKm = 25;
                break;
            } else {
                System.out.println(">> [Error] Invalid cab choice! Please select 1, 2, or 3.");
            }
        }

        // Step 3: Choose predefined route
        String source = "";
        String destination = "";
        int distanceKm = 0;

        while (true) {
            System.out.println("\n--- SELECT ROUTE ---");
            System.out.println("1. Pune Station to Shivajinagar (5 km)");
            System.out.println("2. Swargate to Kothrud (8 km)");
            System.out.println("3. Hinjawadi to Wakad (10 km)");
            System.out.print("Enter your route choice (1-3): ");

            String routeChoice = scanner.nextLine().trim();

            if (routeChoice.equals("1")) {
                source = "Pune Station";
                destination = "Shivajinagar";
                distanceKm = 5;
                break;
            } else if (routeChoice.equals("2")) {
                source = "Swargate";
                destination = "Kothrud";
                distanceKm = 8;
                break;
            } else if (routeChoice.equals("3")) {
                source = "Hinjawadi";
                destination = "Wakad";
                distanceKm = 10;
                break;
            } else {
                System.out.println(">> [Error] Invalid route choice! Please select 1, 2, or 3.");
            }
        }

        // Step 4: Calculate fare and display ride details
        int totalFare = ratePerKm * distanceKm;

        System.out.println("\n================ RIDE SUMMARY ================");
        System.out.println("Cab Type         : " + cabType);
        System.out.println("Source           : " + source);
        System.out.println("Destination      : " + destination);
        System.out.println("Distance         : " + distanceKm + " km");
        System.out.println("Rate per km      : Rs. " + ratePerKm + "/km");
        System.out.println("Total Fare       : Rs. " + totalFare + " (" + distanceKm + " km x Rs. " + ratePerKm + ")");
        System.out.println("==============================================");

        // Step 5: Cancellation before OTP
        while (true) {
            System.out.println("\n--- BOOKING CONFIRMATION ---");
            System.out.println("1. Confirm & Share OTP");
            System.out.println("2. Cancel Ride");
            System.out.print("Enter your choice (1 or 2): ");

            String confirmChoice = scanner.nextLine().trim();

            if (confirmChoice.equals("1")) {
                // Step 6: OTP and ride lock
                // Generate 4-digit OTP between 1000 and 9999
                int otp = 1000 + random.nextInt(9000);

                System.out.println("\n----------------------------------------------");
                System.out.println(">> Your 4-Digit Ride OTP is: " + otp);
                System.out.println(">> IMPORTANT RULE: Once the OTP has been shared,");
                System.out.println("   the ride CANNOT be cancelled.");
                System.out.println(">> Booking Confirmed! Have a safe and pleasant journey.");
                System.out.println("----------------------------------------------");
                break;
            } else if (confirmChoice.equals("2")) {
                // Cancelled before OTP sharing
                System.out.println("\n----------------------------------------------");
                System.out.println(">> Ride Cancelled Successfully.");
                System.out.println(">> No OTP has been generated or shared.");
                System.out.println(">> Returning to Main Menu...");
                System.out.println("----------------------------------------------");
                break;
            } else {
                System.out.println(">> [Error] Invalid choice! Please select 1 or 2.");
            }
        }
    }
}
