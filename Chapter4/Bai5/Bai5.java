/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Bai5 {
    public static void main(String[] args) {

        Supplier<Double> randomNumber =
                () -> Math.random() * 100;

        Consumer<Double> printNumber =
                n -> System.out.println("Số may mắn: " + n);

        Double number = randomNumber.get();
        printNumber.accept(number);
    }
}

