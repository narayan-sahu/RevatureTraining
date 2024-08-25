package com.revature;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingUsingCharacter {
    public static void main(String[] args) {
        try (FileReader input = new FileReader("input2.txt");
             FileWriter output = new FileWriter("output2.txt")) {
             
            int c;
            while ((c = input.read()) != -1) {
                System.out.println(c);
                output.write(c);
            }
            
            // No need to explicitly flush or close resources, it's handled by try-with-resources

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
