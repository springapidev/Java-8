package com.coderbd.interfaces.page496;

import java.util.Date;

public abstract class GeometricObject {

    private String color = "White";
    private boolean filled;
    private Date deateCreated;

    protected GeometricObject() {
        Date date = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        Date date = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDeateCreated() {
        return deateCreated;
    }

    public void setDeateCreated(Date deateCreated) {
        this.deateCreated = deateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", deateCreated=" + deateCreated + '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
