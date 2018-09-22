package com.coderbd;

public class TestStackOfIntegers {

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
