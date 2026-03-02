package com.myapp;

import java.sql.*;

public class Bai2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/userdb";
        String user = "root";
        String pass = "Minhtu010906*";

        int id = 5; 

        try {
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
                String sql = "DELETE FROM users WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                
                int rows = ps.executeUpdate();
                
                if (rows > 0) {
                    System.out.println("Xóa thành công!");
                } else {
                    System.out.println("Không tìm thấy user để xóa");
                }
            }

        } catch (SQLException e) {
        }
    }
}