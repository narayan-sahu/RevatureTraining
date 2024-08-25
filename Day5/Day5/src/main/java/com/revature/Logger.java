package com.revature;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Logger {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        try (FileOutputStream out = new FileOutputStream("logs.txt", true)) { // Append mode
            System.out.println("Type lines or words to log them. Type 'exit' to stop.");

            while (true) {
                System.out.print("Enter text: ");
                String input = sn.nextLine(); // Read the entire line

                if (!input.isEmpty()) {
                    // Construct the log message
                    String message =input + "\n";
                    
                    // Write the message to the file
                    out.write(message.getBytes());
                    
                    System.out.println(message);
                } else {
                    System.out.println("No input received.");
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sn.close(); // Close the scanner to release resources
        }
    }
}
