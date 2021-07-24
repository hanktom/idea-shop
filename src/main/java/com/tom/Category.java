package com.tom;

import java.util.ArrayList;
import java.util.List;

public class Category {
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
}
