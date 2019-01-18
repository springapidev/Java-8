package com.coderbd.interfaces.page496;

public class TestGeometricObject {

    public static void main(String[] args) {
        GeometricObject geoObj1 = new Circle(5);
        GeometricObject geoObj2 = new Rectangle(5, 3);
        System.out.println("The two objects have the same area? " + equalArea(geoObj1, geoObj1));
        displayGeObj(geoObj1);
        displayGeObj(geoObj2);

    }

    public static boolean equalArea(GeometricObject Object1, GeometricObject Object2) {
        return Object1.getArea() == Object2.getArea();
    }

    public static void displayGeObj(GeometricObject Object) {
        System.out.println();
        System.out.println("The area is " + Object.getArea());
        System.out.println("The perimeter is " + Object.getPerimeter());
    }
}
