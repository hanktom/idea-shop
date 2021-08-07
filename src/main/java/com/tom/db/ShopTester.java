package com.tom.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShopTester {
    public static void main(String[] args) {

        try {
            //1. JDBC Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //2. 連線資料庫, URL String
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mariadb://localhost:3306/shop?user=root&password=abc123");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
