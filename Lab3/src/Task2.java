// File: Task2.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This class reads content from "input.txt", prepends line numbers,
 * and writes the result to "output.txt".
 */
public class Task2 {

    public static void main(String[] args) {
        String inputFile = "D:\\Document\\Github\\JavaApplicationProgramming\\Lab3\\data\\task2.input.txt";
        String outputFile = "D:\\Document\\Github\\JavaApplicationProgramming\\Lab3\\data\\task2.output.txt";

        int lineNumber = 1;

        // Use try-with-resources for both reader and writer to ensure they are closed.
        // BufferedWriter is used for efficient writing.
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String currentLine;

            // Read from the input file until the end.
            while ((currentLine = reader.readLine()) != null) {
                // Write the line number and the content to the output file.
                writer.write(lineNumber + ": " + currentLine);
                // Write a new line character.
                writer.newLine();
                lineNumber++;
            }

            System.out.println("Successfully copied '" + inputFile + "' to '" + outputFile + "' with line numbers.");

        } catch (FileNotFoundException e) {
            // This block executes if "input.txt" does not exist.
            System.err.println("Error: The input file '" + inputFile + "' was not found.");
        } catch (IOException e) {
            // This block handles other potential I/O errors during reading or writing.
            System.err.println("An error occurred during file processing: " + e.getMessage());
        }
    }
}