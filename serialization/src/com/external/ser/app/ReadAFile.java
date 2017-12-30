package com.external.ser.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

    public static void main(String[] args) {
        try {

            // Read line by line from the file using FileReader.
            // Very efficient way to read a file.
            FileReader reader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
