package com.tom.box;

import java.util.*;

public class BoxTester {
    public static void main(String[] args) {
        /*List<Box> boxes = new ArrayList<>();
        boxes.add(new Box1());
        boxes.add(new Box2());
        boxes.add(new Box3());*/
        /*List<Box> boxes = Arrays.asList(
                new Box1(),
                new Box2(),
                new Box3()
        );*/
        Map<Integer, Box> map = new HashMap<>();
        map.put(1, new Box1());
        map.put(2, new Box3());
        Box b = map.get(2);
        System.out.println(b.name);

        Set<Box> boxes = new HashSet<>();
        boxes.add(new Box1());
        boxes.add(new Box2());
        boxes.add(new Box3());
        int length = 3;
        int width = 14;
        int height = 6;
        boolean matched = false;
        for (Box box : boxes) {
            if (box.validate(length, width, height)) {
                System.out.println("Please choose " + box.name);
                matched = true;
                break;
            }
        }
        if (!matched) {
            System.out.println("No box for your object");
        }
    }
}
