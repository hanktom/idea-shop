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
        Product toothbrush =
                new Product("牙刷", Category.CATEGORY_LIFE); //call constructor
//                new Product("牙刷", categories.get(0)); //call constructor
        toothbrush.publish();
        Product mouse = new Product("滑鼠", Category.CATEGORY_COMPUTER);
        mouse.publish();
        System.out.println(mouse.id);
        //Order
        OrderItem item = new OrderItem(mouse, 3);
        OrderItem item2 = new OrderItem(toothbrush);

    }
}