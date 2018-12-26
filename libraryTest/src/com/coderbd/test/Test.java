package com.coderbd.test;

import com.coderbd.WhileLoop;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        WhileLoop.printFirstNumToSecondNum(1, 10);
        System.out.println("Sum: " + WhileLoop.makeSumFromFirstNumToSecondNum(1, 10));
        
        Scanner sc = new Scanner(System.in);
        WhileLoop.workWithSentinelvalue(sc);
        
    }
}


