package com.coderbd.ex3;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println("1111111111111");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("You can not divide by zero");
        }
        System.out.println("2222222222222");
        try {
            System.out.println(Integer.parseInt("TEN"));
        } catch (Exception e) {
            System.out.println("You can not parse TEN, FIVE etc");
        }
        
        System.out.println("3333333333333333333333333");

    }
}
