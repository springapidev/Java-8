package com.coderbd.methodsBasic;

public class Test {

    public static void main(String[] args) {
        MethodEx8 m = new MethodEx8();
        int rs = m.makeSubstituteFromTwoMethods(5, 7);
        System.out.println("Rs: " + rs);

        m.makeMultiSingleMethod(5, 7);
    }
}
