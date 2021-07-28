package com.tom;

import com.tom.Product;

public class OrderItem extends Product {
    int qty; //數量

    public OrderItem(Product product, int qty) {
        this.qty = qty;
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.category = product.category;
    }

    //TODO: 作業
    public OrderItem(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        qty = 1;
    }
}
