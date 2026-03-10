package com.cmc.btltchuong2;


public class Bai2 {
    public static void main(String[] args) {

        Computer pc1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        Computer pc2 = new Computer.ComputerBuilder("500GB", "8GB")
                .build();

        System.out.println(pc1);
        System.out.println(pc2);
    }
}
