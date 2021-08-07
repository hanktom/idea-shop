package com.tom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    public Product(int id, Category category, String name, int price) {
        this(id, name, price);
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
    //Encapsulation 封裝
    public static List<Product> getProductsFromFile() {
        List<Category> categories = Category.getCategories();
        //Polymorphism 多型
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader in = new BufferedReader(fileReader);
            String line = in.readLine();
            while(line != null) {
                System.out.println(line);
                String[] tokens = line.split(",");
                //collect data for Product
                int id = Integer.parseInt(tokens[0]);
                //TODO: possible bug for index
                Category category = categories.get(Integer.parseInt(tokens[1])-1);
                String name = tokens[2];
                int price = Integer.parseInt(tokens[3]);
                //Product object
                Product product;
                if (tokens.length > 4) {
                    float discount = Float.parseFloat(tokens[4]);
                    product = new SalesProduct(id, category, name, price,
                            discount);
                } else {
                    product = new Product(id, category, name, price);
                }
                //add to products list
                products.add(product);
                line = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    //方法 method
    void publish() { //成員, Member, 可加修飾字 Modifier

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + getPrice();
    }
}
