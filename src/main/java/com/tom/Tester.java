package com.tom;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //購物
        //商品: id, 名, price
        List<Category> categories = Category.getDummyCategories();
        for (Category cat : categories) {
            System.out.println(cat.name);
        }
        int n = 10;
        Product toothbrush =
                new Product("牙刷", categories.get(0)); //call constructor
        toothbrush.publish();
        Product mouse = new Product("滑鼠", categories.get(1));
        mouse.publish();
    }
}