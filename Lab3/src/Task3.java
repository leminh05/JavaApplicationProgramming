
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // Use a try-with-resources statement to ensure the scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            // Loop indefinitely until the user types "exit"
            while (true) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                // Check for the exit condition
                if ("exit".equalsIgnoreCase(name)) {
                    System.out.println("Exiting program.");
                    break;
                }

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                int age = 0;
                // Loop to ensure a valid integer is entered for age
                while (true) {
                    try {
                        System.out.print("Enter age: ");
                        age = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character left by nextInt()
                        break; // Exit the age-input loop if successful
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid number for age.");
                        scanner.nextLine(); // Consume the invalid input
                    }
                }


                // Create the profile string
                String profile = String.format("Name: %s, Email: %s, Age: %d%n", name, email, age);

                // Use a try-with-resources for FileWriter to ensure it's closed and handles exceptions
                try (FileWriter writer = new FileWriter("D:\\Document\\Github\\JavaApplicationProgramming\\Lab3\\data\\task3.profiles.txt", true)) { // 'true' for append mode
                    writer.write(profile);
                    System.out.println("Profile saved successfully.");
                } catch (IOException e) {
                    System.err.println("An error occurred while writing to the file: " + e.getMessage());
                }
                System.out.println(); // Add a blank line for better readability
            }
        }
    }
}
