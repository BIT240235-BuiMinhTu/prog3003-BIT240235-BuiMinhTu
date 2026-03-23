
package com.cmc.bailt11;

import java.util.*;
import java.util.stream.Collectors;

public class Bai3 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "An", 900),
                new Employee(2, "Binh", 1200),
                new Employee(3, "Cuong", 1500),
                new Employee(4, "Dung", 800)
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Danh sách tên > 1000:");
        result.forEach(System.out::println);
    }
}