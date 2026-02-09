/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;
import java.util.function.Function;

public class Bai4 {
    public static void main(String[] args) {

        List<String> money = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> convert =
                s -> Integer.valueOf(s.replace("$", ""));

        List<Integer> result = new ArrayList<>();
        for (String s : money) {
            result.add(convert.apply(s));
        }

        System.out.println(result);
    }
}

