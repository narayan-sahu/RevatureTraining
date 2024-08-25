package com.revature;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("img.png");
            out = new FileOutputStream("img2.png"); // 'true' for append mode

            // Example of reading from input file and writing to output file
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
