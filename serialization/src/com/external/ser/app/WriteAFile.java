package com.external.ser.app;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

    public static void main(String[] args) {
        try {
            // if 'file.txt' doesn't exit, FileWriter will create it.
            // A File object represents the name and path of a file or
            // directory on disk.

            // We can do it using FileWriter, itself.
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello World!");

            // Or we can do using BufferWriter.
            // It something like a cart, we will store in a buffer.
            // and write only when Buffer is going to full.
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello World!");
            bufferedWriter.write("Hello Ram");
            bufferedWriter.write("Hello Shyam");

            // We need to flush it, may possible buffer is not flushed to file.
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
