package com.coderbd;

public class Building {

    int id;
    String name;
    String location;

    public static void main(String[] args) {
        Building building1 = new Building();
        building1.setId(200);
        building1.setName("Hasina Vila");
        building1.setLocation("Gopalganj");
        System.out.println("ID: " + building1.getId());
        System.out.println("Name: " + building1.getName());
        System.out.println("Location: " + building1.getLocation());
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
