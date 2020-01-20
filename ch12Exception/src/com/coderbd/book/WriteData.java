package com.coderbd.book;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws Exception {
        File file = new File("bdc.mejba");
        file.delete();
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Create a file
       PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.print("Mesba ");
        output.println(90);
        output.print("Mijan ");
        output.println(85);
        output.print("Milton ");
        output.println(74);

        // Close the file
        output.close();
    }
}
