package com.tom.box;
//1號 10,10,10
//2號 15,10,10
//...
//length,width,height -> OK?

public class Box {
    int length;
    int width;
    int height;
    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public boolean validate(int length, int width, int height) {
        //TODO:
        return length<=this.length && width <= this.width && height <= this.height;
    }
}