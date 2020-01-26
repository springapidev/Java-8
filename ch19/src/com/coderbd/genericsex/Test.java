package com.coderbd.genericsex;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Operation op1 = new OperationImpl();
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);
        op1.add(list);
        //////////Add call///////////
        System.out.println(op1.add(list));
        /////////// factorial call/////////////
        System.out.println(op1.factorial(5));
        System.out.println("===========");
        Operation op2 = new OperationImpl2();
        List<Long> list2 = new ArrayList();
        list2.add(1000L);
        list2.add(2000L);

        //////////Add call///////////
        System.out.println(op2.add(list2));
        /////////// factorial call/////////////
        System.out.println(op2.factorial(5));
    }

}
