package com.coderbd.interfaces.page496;


public class  Circle extends GeometricObject{
    private double  radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius ;
    }
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public void printCircle(){
        System.out.println("The circle is created"+getDeateCreated()+"and the readius is "+radius);
    }

    
}
