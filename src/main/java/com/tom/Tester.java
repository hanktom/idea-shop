package com.tom;

public class Tester {
    public static void main(String[] args) {
        //購物
        //商品: id, 名, price
        //System.out.println("Hello world!");
        int n = 10;
        Product toothbrush = new Product();
        toothbrush.id = 1;
        toothbrush.name = "牙刷";
        toothbrush.price = 150;
        Product mouse = new Product();
        mouse.id = 2;
        mouse.name = "滑鼠";
        mouse.price = 99;
    }
}
