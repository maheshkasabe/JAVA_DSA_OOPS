package com.OOPS.Polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shape = new Shapes();
        Circle circles = new Circle();
        Shapes circle = new Circle();

        shape.area();

        circle.area();
        circles.area();
    }
}
