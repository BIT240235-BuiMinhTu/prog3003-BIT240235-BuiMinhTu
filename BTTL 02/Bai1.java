
package com.cmc.btltchuong2;

import java.util.TreeSet;

public class Bai1 {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sách :");
        System.out.println(names);

        String first = names.first();
        String last = names.last();

        System.out.println("Phần tử nhỏ nhất: " + first);
        System.out.println("Phần tử lớn nhất: " + last);
    }
}
