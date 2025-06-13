
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        // The name of the file to read from.
        String fileName = "D:\\Document\\Github\\JavaApplicationProgramming\\Lab3\\data\\task1.numbers.txt";

        int sum = 0;
        int validLines = 0;
        int invalidLines = 0;
        int lineNumber = 1;

        // Using try-with-resources to ensure the BufferedReader is closed automatically.
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;

            // Read the file line by line.
            while ((currentLine = reader.readLine()) != null) {
                try {
                    // Attempt to parse the string line into an integer.
                    int number = Integer.parseInt(currentLine.trim());
                    sum += number;
                    validLines++;
                } catch (NumberFormatException e) {
                    // This block executes if the line is not a valid integer.
                    System.out.println("Invalid number on line " + lineNumber + ": " + currentLine);
                    invalidLines++;
                }
                lineNumber++;
            }

            // Print the final summary.
            System.out.println("Sum = " + sum);
            System.out.println("Valid lines: " + validLines);
            System.out.println("Invalid lines: " + invalidLines);

        } catch (FileNotFoundException e) {
            // This block executes if "numbers.txt" is not found.
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            // This block executes for other potential reading errors.
            System.err.println("Error reading the file '" + fileName + "': " + e.getMessage());
        }
    }
}
