package com.tom.area;

import java.util.ArrayList;
import java.util.List;

public class AreaTester {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(10, 10));
        shapes.add(new Rectangle(10, 10));
        shapes.add(new Triangle(20, 30));
        int r = 10;
        Shape circle = new Shape() {
            @Override
            public float getArea() {
                return 10*10*3.14159f;
            }
        };
        shapes.add(circle);
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
