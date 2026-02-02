/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

/**
 *
 * @author laptop dell
 */
public class B1 {

    private static B1 instance;

    private B1() {
        System.out.println("Tạo kết nối Database");
    }

    public static B1 getInstance() {
        if (instance == null) {
            instance = new B1();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Đang kết nối database...");
    }

    public static void main(String[] args) {
        B1 db1 = B1.getInstance();
        B1 db2 = B1.getInstance();

        db1.connect();
        System.out.println(db1 == db2); // true
    }
}

