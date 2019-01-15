package com.coderbd.finalkeyword;

public class Tommy extends Dog {

    @Override
    public void sayHello() {
        System.out.println("Hi I am Tommy");
    }

    public static void main(String[] args) {
        Tommy tommy = new Tommy();
        tommy.sayHello();
        Dog tommy1 = new Tommy();
        tommy1.sayHello();
        Dog dog = new Dog();
        dog.sayHello();

    }
}
