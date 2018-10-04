package com.coderbd.book;

public class TestStack {
    
    public static void main(String[] args) {
        GenericStack<Bosta> bostaLit = new GenericStack<>();
        System.out.println("Now Size: " + bostaLit.getSize());
        bostaLit.push(new Bosta(100, "50 KG"));
        bostaLit.push(new Bosta(110, "60 KG"));
        bostaLit.push(new Bosta(120, "70 KG"));
        System.out.println("Size: " + bostaLit.getSize());
        System.out.println("peek: " + bostaLit.peek());
        Bosta[] bosta = {new Bosta(500, "20 KG"), new Bosta(700, "30 KG")};
        GenericMethodDemo.<Bosta>print(bosta);

        //Stack is LIFO= last in first out
        /*   GenericStack<Integer> liStack = new GenericStack<>();
        liStack.push(100);
        liStack.push(200);
        liStack.pop();//remove
        System.out.println(liStack.peek());
         */
    }
    
}
