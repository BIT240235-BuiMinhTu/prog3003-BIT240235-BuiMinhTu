package com.cmc.bailt11;


public class Bai1 {

    // Generic Method
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Python", "C++"};

        System.out.println("Mảng Integer:");
        printArray(intArray);

        System.out.println("Mảng String:");
        printArray(strArray);
    }
}
