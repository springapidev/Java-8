package com.coderbd.equals;

public class Circle {

    double radius;

    public boolean equals(Circle circle) {
        // System.out.println(radius);
        // System.out.println(circle);
        // System.out.println("===Start equals(Circle circle)====");
        // System.out.println(System.identityHashCode(this.radius));
        // System.out.println(this.radius);
        // System.out.println(System.identityHashCode(circle.radius));
        // System.out.println(circle.radius);
        // System.out.println("===End equals(Circle circle)====");
        return this.radius == circle.radius;//false
    }

//    public boolean equals(Object circle) {
//        System.out.println("===Start equals(Object circle) ====");
//        System.out.println(System.identityHashCode(this.radius));
//        System.out.println(this.radius);
//        System.out.println(System.identityHashCode(((Circle) circle).radius));
//        System.out.println(((Circle) circle).radius);
//        System.out.println("===End equals(Object circle)====");
//        return this.radius == ((Circle) circle).radius; // true
//    }
    public static void main(String[] args) {
        Object c1 = new Circle();
        Object c2 = new Circle();
        System.out.println(c1.equals(c2));
        Circle cc = new Circle();
        Circle cc2 = new Circle();
        // System.out.println(cc);
        System.out.println(c1.equals(cc));
        System.out.println("==============");
        System.out.println(cc.equals(cc2));

    }

}
