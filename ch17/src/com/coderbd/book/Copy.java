package com.coderbd.book;

import java.io.*;

public class Copy {

    /**
     * Main method
     *
     * @param args[0] for sourcefile
     * @param args[1] for target file
     */
    public static void main(String[] args) throws IOException {
      

        try (
                // Create an input stream
                BufferedInputStream input
                = new BufferedInputStream(new FileInputStream("source.dat"));
                // Create an output stream
                BufferedOutputStream output
                = new BufferedOutputStream(new FileOutputStream("minhaz.dat"));) {
            // Continuously read a byte from input and write it to output
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesCopied++;
            }

            // Display the file size
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}
