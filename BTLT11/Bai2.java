/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.bailt11;


public class Bai2 {

    // Interface
    interface MessageService {
        void sendMessage(String message);
    }

    // Email
    static class EmailService implements MessageService {
        @Override
        public void sendMessage(String message) {
            System.out.println("Gửi Email: " + message);
        }
    }

    // SMS
    static class SMSService implements MessageService {
        @Override
        public void sendMessage(String message) {
            System.out.println("Gửi SMS: " + message);
        }
    }

    // Notification (Setter Injection)
    static class Notification {
        private MessageService messageService;

        public void setMessageService(MessageService messageService) {
            this.messageService = messageService;
        }

        public void notifyUser(String message) {
            messageService.sendMessage(message);
        }
    }

    // Main
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello Email!");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello SMS!");
    }
}
