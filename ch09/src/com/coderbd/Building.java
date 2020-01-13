package com.coderbd;

public class Building {

    int id;
    String name;
    String location;

    int x = 10;// instance or non-static variable
    static int y = 200;//static or class level variable

    public Building() {
    }

    public Building(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public static void main(String[] args) {
        //Ref.    instance/obj   constructor
        Building building1 = new Building();
        building1.setId(200);
        building1.setName("Hasina Vila");
        building1.setLocation("Gopalganj");
        System.out.println("ID: " + building1.getId());
        System.out.println("Name: " + building1.getName());
        System.out.println("Location: " + building1.getLocation());

        ///////////another object.........
        Building building2 = new Building();
        building2.setId(300);
        building2.setName("Gono Bhobon");
        building2.setLocation("College Gate");

        building1.sayHello();
        building2.sayHello();
        new Building().sayHello();

        Building building3 = new Building(400, "PM Residence", "C Gate");
        System.out.println("ID: " + building3.getId());
        System.out.println("Name: " + building3.getName());
        System.out.println("Location: " + building3.getLocation());

        Building building4 = new Building();
        System.out.println("ID: " + building4.getId());
        System.out.println("Name: " + building4.getName());
        System.out.println("Location: " + building4.getLocation());
        ///////////////////Static/////////////
        Building.y = 300;// belongs to class
        building4.x = 5000;// belongs to object
    }

    public void sayHello() {
        System.out.println("Hi..........");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
