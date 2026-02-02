/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

/**
 *
 * @author laptop dell
 */
public class B3 {

    static class TV {
        void on() {
            System.out.println("TV bật");
        }
    }

    static class SoundSystem {
        void on() {
            System.out.println("Loa bật");
        }
    }

    static class DVDPlayer {
        void on() {
            System.out.println("DVD bật");
        }
    }

    static class HomeTheaterFacade {
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        DVDPlayer dvd = new DVDPlayer();

        void watchMovie() {
            System.out.println("Chuẩn bị xem phim...");
            tv.on();
            sound.on();
            dvd.on();
            System.out.println("Xem phim 🎬");
        }
    }

    public static void main(String[] args) {
        HomeTheaterFacade home = new HomeTheaterFacade();
        home.watchMovie();
    }
}

