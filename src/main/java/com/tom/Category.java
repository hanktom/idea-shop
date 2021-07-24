package com.tom;

import java.util.ArrayList;
import java.util.List;

public class Category {
    static final Category CATEGORY_LIFE = new Category(1, "生活用品");
    static final Category CATEGORY_COMPUTER = new Category(2, "電腦");
//    final float PI = 3.14159f;
    int id;
    String name;
    int version = 1;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Category> getDummyCategories() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1, "生活用品"));
        list.add(new Category(2, "電腦零組件"));
        return list;
    }

    public static List<Category> getCategories() {
        List<Category> list = new ArrayList<>();
        //TODO: read categories from database
        return list;
    }
}
