package com.coderbd.methodsBasic;

public class MethodEx2 {

    static int p;
    static int q = 400;

    /*
    1. It is Default Constructor
    2. It has a name named according class name
    3. It must have terminal/paranethesis
    4.It must have body {}
    5. Parameters/arguments is optional
    6. Constructor Two types: A. Default Constructor B. Argumentative Constructor
    7. Without any parameter is called Default Constructor
    8. If Constructor has one or more arguments or parameters, then it is called Argumentative Constructor.
     */
    public MethodEx2() {
    }
//Argumentative Constructor.

    public MethodEx2(int p) {
        this.p = p;
    }

    public static void main(String[] args) {
        //Calling Method Way-1
        System.out.println(display1());
        System.out.println(display2());
        System.out.println(display3());
        System.out.println(display4());
        //Calling Method Way-1
        System.out.println("=================Way-2===============");
        int m1 = display1();
        System.out.println("M1: " + m1);
        int m2 = display2();
        System.out.println("M2: " + m2);
        int m3 = display3();
        System.out.println("M3: " + m3);
        int m4 = display4();
        System.out.println("M4: " + m4);
        //Calling Method Way-3
        System.out.println("=================Way-3===============");
// Make an object of class MethodEx2
        MethodEx2 m = new MethodEx2();
        System.out.println("Method1: " + m.display1());
        System.out.println("Method2: " + m.display2());
        System.out.println("Method3: " + m.display3());
        System.out.println("Method4: " + m.display4());

    }

    //Method 1
    public static int display1() {
        return 100;
    }

    //Method 2
    public static int display2() {
        int x = 200;
        return x;
    }

    //Method 3
    public static int display3() {
        p = 300;
        return p;
    }

    //Method 4
    public static int display4() {
        return q;
    }

}
