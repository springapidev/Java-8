package com.coderbd.methodsBasic;

public class MethodEx8 {

   

    public int makeMulti(int num1, int num2) {
        int multiRs = num1 * num2;
        return multiRs;
    }

    public int makeSubstituteFromTwoMethods(int n1, int n2) {
        int rs = makeMulti(n1, n2) - makeSum(n1, n2);
        return rs;
    }

    protected void makeMultiSingleMethod(int num1, int num2) {
        int rs = (num1 * num2) - (num1 + num2);
        System.out.println("Rs: " + rs);
    }

     public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
       public static void main(String[] args) {
        MethodEx8 m = new MethodEx8();
        int rs = m.makeSubstituteFromTwoMethods(5, 7);
        System.out.println("Rs: " + rs);

        m.makeMultiSingleMethod(5, 7);
    }
}
