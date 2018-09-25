package com.coderbd.book.io.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {
        String destFile = "my_second_file.israt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
            bw.append("Dhaka");
            bw.newLine();
            bw.append(" Is");
            bw.newLine();
            bw.append(" The");
            bw.newLine();
            bw.append(" Capital");
            bw.flush();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {

            System.out.println("Writing Done!");
        }
    }
}
