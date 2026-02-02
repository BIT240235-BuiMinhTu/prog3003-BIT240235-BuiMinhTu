package Baitap;

public class Bai2 {

    public static <E> void printArray(E[] array) {
        for (E x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"Java", "Python", "C++"};

        printArray(a);
        printArray(b);
    }
}

