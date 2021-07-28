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
        List<Product> products = Product.getProductsFromFile();
        for (Product product : products) {
            System.out.println(product.name + "*");
        }
        //Order
//        OrderItem item = new OrderItem(mouse, 3);
//        OrderItem item2 = new OrderItem(toothbrush);

    }
}