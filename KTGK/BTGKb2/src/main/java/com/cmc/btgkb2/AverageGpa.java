package com.cmc.btgkb2;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AverageGpa {

    public static double calculateAverageGpa(List<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }

    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV01", "Bui Minh Tu", 3.2));
        manager.add(new Student("SV02", "Dang Tuan Dung", 3.6));
        manager.add(new Student("SV03", "Vu Tung Duong", 3.0));

        System.out.println("Dang tinh GPA trung binh...");

        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); 
                return calculateAverageGpa(manager.getAll());
            } catch (InterruptedException e) {
                throw new RuntimeException("Loi khi tinh GPA", e);
            }
        });

        future.thenAccept(avg -> {
            System.out.println("Diem trung binh GPA cua he thong la: " + avg);
        }).exceptionally(ex -> {
            System.out.println("Da xay ra loi: " + ex.getMessage());
            return null;
        });

        System.out.println("Main thread van tiep tuc chay...");

        future.join();
    }
}
