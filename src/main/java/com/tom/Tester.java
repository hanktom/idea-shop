package com.tom;

public class Tester {
    public static void main(String[] args) {
        //購物
        //商品: id, 名, price
        //System.out.println("Hello world!");
        int n = 10;
        Product toothbrush =
                new Product(1, "牙刷", 150); //call constructor
        toothbrush.publish();
        Product mouse = new Product("滑鼠", 99);
    }
}
