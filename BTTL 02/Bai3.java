package com.cmc.btltchuong2;

import java.util.concurrent.CompletableFuture;

public class Bai3 {

    public static void main(String[] args) {

        CompletableFuture<String> validateCustomer =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                    System.out.println("Đã xác thực khách hàng");
                    return "Customer OK";
                });

        CompletableFuture<String> issueTicket =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {}
                    System.out.println("Đã xuất vé xem phim");
                    return "Ticket Issued";
                });

        // Kết hợp hai task
        CompletableFuture<String> result =
                validateCustomer.thenCombine(issueTicket,
                        (a, b) -> a + " & " + b);

        System.out.println(result.join());

        System.out.println("Hoàn thành hệ thống đặt vé");
    }
}
