package com.coderbd;
// Constructor and getter based

public class ClassRoom {

    int id;
    String location;

    public ClassRoom() {
    }

    public ClassRoom(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(302, "4th Floor");
        System.out.println("ID: " + classRoom1.getId());
        System.out.println("Location: " + classRoom1.getLocation());
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

}
