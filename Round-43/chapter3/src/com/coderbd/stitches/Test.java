package com.coderbd.stitches;

public class Test {

    public static void main(String[] args) {
        // int x = 1;//correct
        //  byte x = 1;//correct
        //  short x = 1;//correct
        //  long x = 1;//Wrong
        //  float x = 1.0f;//Wrong 
        //   double x = 1.0;//wrong
        // char x = 1;//correct
        // boolean x = true;//wrong
        String x = "1";//correct
        switch (5 < 6 ? "1" : "2") {
            case "0":
                System.out.println("Zero");
                break;
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            default:
                System.out.println("Def");
        }
    }
}
