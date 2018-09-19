package com.coderbd.immutable;

public final class Building2 {

    private final int id;
    private final String name;

    public Building2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Building2 displayDetails(Building1 b1) {
        Building2 b2 = new Building2(b1.getId(), b1.getName());
        return b2;
    }

    @Override
    public String toString() {
        return "Building2{" + "id=" + id + ", name=" + name + '}';
    }

}
