package com.myapp;

import java.sql.*;

public class Bai1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/userdb";
        String user = "root";
        String pass = "Minhtu010906*";

        try {
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users");
                
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " - " +
                                    rs.getString("username") + " - " +
                                    rs.getString("email")
                    );
                }
            }

        } catch (SQLException e) {
        }
    }
}