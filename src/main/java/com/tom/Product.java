package com.tom;

public class Product {
    //屬性 field, property
    int id;  //成員, Member, Instance
    String name;  //成員, Member
    int price = 1;  //成員, Member
    //Constructor
    public Product() {
        super();
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
    void publish() { //成員, Member

    }
}
