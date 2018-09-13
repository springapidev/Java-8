package com.coderbd.methodsBasic.wow;

public class C {

    public int makeSubstituteFromTwoMethods(int n1, int n2) {
        A a = new A();
        B b = new B();
        int rs = b.makeMulti(n1, n2) - a.makeSum(n1, n2);
        return rs;
    }
}
