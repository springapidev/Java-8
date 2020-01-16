package com.coderbd.immutable;

public class ImmutableBojai {

    public final int id;
    private final String name;

    public ImmutableBojai(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableBojai{" + "id=" + id + ", name=" + name + '}';
    }

}
