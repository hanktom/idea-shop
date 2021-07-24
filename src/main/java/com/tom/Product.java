package com.tom;

public class Product {
    //屬性 field, property
    protected int id;  //成員, Member, Instance
    String name;  //成員, Member
    int price = 1;  //成員, Member
    Category category;
    //Constructor
    public Product() { //default constructor
        super();
    }

    public Product(String name, Category category) {
        this.id = 0;
        this.name = name;
        this.category = category;
    }
    public Product(int id, String name, int price) {
        this(name, price);
        this.id = id;
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //方法 method
    void publish() { //成員, Member, 可加修飾字 Modifier

    }
}
