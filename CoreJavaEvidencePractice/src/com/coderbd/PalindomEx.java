package com.coderbd;

public class PalindomEx {

    public static void main(String[] args) {
        // System.out.println(isPalindom("madam"));
        String[] arrs = {"mom", "abc", "madam", "bye", "mim", "eye"};//4 palindoms
        System.out.println(countPalindom(arrs));
    }

    public static boolean isPalindom(String s) {
        boolean status = false;
        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(s)) {
            status = true;
        }
        return status;
    }

    public static int countPalindom(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPalindom(s[i])) {
                counter++;
            }
        }
        return counter;
    }

}
