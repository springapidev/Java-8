package com.coderbd.boxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingEx {

    ///////////////UnBoxing///////////
    static Integer p = new Integer(10);// p is boxed
    static int q = p;//Auto unboxing
    static int r = p.intValue();//unboxing

/////////////////////////////Boxing
    int x = 10;
    Integer y = x; // Auto Boxing
    Integer z = Integer.valueOf(x);//Boxing

    public static void main(String[] args) {

        System.out.println(p instanceof Integer);
        System.out.println(p + " = " + q);

        /* Here we are creating a list 
          of elements of Integer type. 
          adding the int primitives type values */
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
