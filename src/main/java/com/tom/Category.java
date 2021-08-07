package com.tom;

import java.sql.*;
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
        try {
            //1. JDBC Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //2. 連線資料庫, URL String
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mariadb://localhost:3306/shop", "jack", "abc333");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from category");
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                System.out.println(id);
                String name = resultSet.getString(2);
                System.out.println(name);
                int version = resultSet.getInt("version");
                System.out.println(version);
                list.add(new Category(id, name));
            }
            resultSet.close();
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
