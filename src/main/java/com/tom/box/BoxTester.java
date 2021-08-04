package com.tom.box;

public class BoxTester {
    public static void main(String[] args) {
        int length = 11;
        int width = 8;
        int height = 6;
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        if (box1.validate(length, width, height)) {
            System.out.println("Please choose BOX #1");
        } else if (box2.validate(length, width, height)) {
            System.out.println("Please choose BOX #2");
        } else {
            System.out.println("No box for your object");
        }
    }
}
