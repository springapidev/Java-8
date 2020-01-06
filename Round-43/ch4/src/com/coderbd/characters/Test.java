package com.coderbd.characters;

public class Test {

    public static void main(String[] args) {
        char letter = 'A';
        char numOfA = 9700;
        System.out.println("letter: " + letter + " numOfA: " + numOfA);
        System.out.println("Char Max: " + Character.MAX_VALUE);
        char a = '\u0039';
        System.out.println(a);

        System.out.println("He said \"Java is fun\"");

        byte b = 'a';
        int i = 'a';

        String str = "45Ban5498gladesh984";
        findCharacters(str);

    }

    public static void findCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    public static void findChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
