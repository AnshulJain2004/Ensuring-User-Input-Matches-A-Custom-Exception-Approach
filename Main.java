import java.util.Scanner;

// Main class to take input from the user and check if it matches a predefined string
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.println("Enter a string:"); // Prompt the user to enter a string
        String input = scanner.nextLine(); // Read the input string from the user
        scanner.close(); // Close the scanner to prevent resource leak

        try {
            // Check if the input string matches the predefined string "India"
            if (!input.equals("India")) {
                // If the strings do not match, throw a NOMATCHEXCP with details
                throw new NOMATCHEXCP("String does not match 'India'", input, Thread.currentThread().getStackTrace()[1].getLineNumber());
            }
            // If the strings match, display a success message
            System.out.println("Entered string matches 'India'.");
        } catch (NOMATCHEXCP e) { // Catch the custom exception NOMATCHEXCP
            System.out.println(e); // Print the exception details
        }
    }
}