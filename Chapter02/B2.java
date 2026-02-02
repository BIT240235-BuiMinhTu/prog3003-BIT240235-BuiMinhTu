/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

/**
 *
 * @author laptop dell
 */
public class B2 {

    interface Notification {
        void notifyUser();
    }

    static class SMSNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Gửi thông báo SMS");
        }
    }

    static class EmailNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Gửi thông báo Email");
        }
    }

    static class NotificationFactory {
        static Notification createNotification(String channel) {
            if (channel.equalsIgnoreCase("SMS"))
                return new SMSNotification();
            else
                return new EmailNotification();
        }
    }

    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("SMS");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("EMAIL");
        n2.notifyUser();
    }
}

