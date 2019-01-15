package com.coderbd.dynamicbindingpage424;

public class DynamicbindingDemo {

    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object obj) {
        System.out.println(obj.toString());
    }

}
