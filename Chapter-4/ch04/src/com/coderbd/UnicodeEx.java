package com.coderbd;

public class UnicodeEx {
    
    public static void main(String[] args) {
        char ch2 = (char) 0XAB0041;// The lower 16 bits hex code 0041 is
        // assigned to ch
        System.out.println(ch2);
        System.out.println("He said \'Java is fun\'");
        char ch = 'a';
        System.out.println(++ch);
        for (int i = 0; i < 35; i++) {
            System.out.print(" "+ch);
        }
        long x = 10;
        int y = (int) x;
        String text = "Bangladesh";
        System.out.println("Length: " + text.length());
        System.out.println("Length: " + text.charAt(5));
        
        String text2 = " USA";
        System.out.println(text.concat(text2).toLowerCase());
        System.out.println(text2.trim());

        //charter exact from word / sentence
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i)+", ");
        }
    }
}
