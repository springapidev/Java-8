package com.coderbd.book;

import java.util.Scanner;

public class ReadFileFromURL {

    public static void main(String[] args) {
        long sm = System.currentTimeMillis();

        System.out.print("Enter a URL: ");
        String uRLString = new Scanner(System.in).next();

        try {
            java.net.URL url = new java.net.URL("https://www.lipsum.com/");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
                System.out.println(count + ": " + line);
            }

            System.out.println("The file size is " + count + " characters");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("IO Errors");
        }
        long lm = System.currentTimeMillis();
        long spentime = (lm - sm);
        System.out.println("Ms: " + spentime);
    }
}
