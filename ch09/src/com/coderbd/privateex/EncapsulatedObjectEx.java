package com.coderbd.privateex;

public class EncapsulatedObjectEx {

    private static int id;

    public EncapsulatedObjectEx() {

    }

    public static void main(String[] args) {
        EncapsulatedObjectEx obj = new EncapsulatedObjectEx();
        id = 200;// direct access korte parsi
        obj.mayCar();
        obj.id = 500;// object er maddomeo access korte parsi
        System.out.println("ID: " + obj.id);

    }

    private void mayCar() {
        System.out.println("My Car is private");
    }

    void mayPlane() {
        System.out.println("My Plane is default");
    }

   protected void myAxe() {
        System.out.println("My Axe is Protected");
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        EncapsulatedObjectEx.id = id;
    }
   
   
}
