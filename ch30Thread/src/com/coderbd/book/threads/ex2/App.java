package com.coderbd.book.threads.ex2;

public class App {

    public static void main(String[] args) {
        Uncle uncle = new Uncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("Mr. Jamil");
        uncleThread.setPriority(10);
        uncleThread.start();
        Urmi u = new Urmi();
        Thread urmiThread = new Thread(u);
        urmiThread.setName("Urmi");
        urmiThread.setPriority(1);
        urmiThread.start();
        System.out.println("uncleThread Name " + uncleThread.getName());
        System.out.println("urmiThread name " + urmiThread.getName());
        System.out.println("uncleThread Priority " + uncleThread.getPriority());
        System.out.println("urmiThread Priority " + urmiThread.getPriority());
    }

}
