package com.coderbd.p337;

public class StaticNonStaticEx {
    
    int x = 10;
    static int y = 20;
    
    public static void main(String[] args) {
        StaticNonStaticEx obj1 = new StaticNonStaticEx();
        System.out.println("X: " + obj1.x);
        
        System.out.println("Y: " + y);
        System.out.println(obj1.makeSum(500));
        System.out.println("makeSum2: " + makeSum2(200));
    }
    
    public int makeSum(int bonus) {
        int sum = x + y + bonus;
        return sum;
    }
    
    public static int makeSum2(int bonus) {
        StaticNonStaticEx obj3 = new StaticNonStaticEx();
        int sum = obj3.x + y + bonus;
        return sum;
    }
}
