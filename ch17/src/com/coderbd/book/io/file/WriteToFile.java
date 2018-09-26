package com.coderbd.book.io.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("my_second_file.israt"))) {
            bw.append("Dhaka");
            bw.newLine();
            bw.append(" Is");
            bw.newLine();
            bw.append(" The");
            bw.newLine();
            bw.append(" Capital");
             bw.newLine();
             bw.append(" Wednesday");
            bw.newLine();
            bw.flush();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {

            System.out.println("Writing Done!");
        }
    }
}
