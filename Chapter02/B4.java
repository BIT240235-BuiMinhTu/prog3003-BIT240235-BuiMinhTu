/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

/**
 *
 * @author laptop dell
 */
public class B4 {

    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardPayment implements PaymentStrategy {
        @Override
        public void pay(int amount) {
            System.out.println("Thanh toán " + amount + " bằng Credit Card");
        }
    }

    static class PayPalPayment implements PaymentStrategy {
        @Override
        public void pay(int amount) {
            System.out.println("Thanh toán " + amount + " bằng PayPal");
        }
    }

    static class ShoppingCart {
        PaymentStrategy paymentStrategy;

        void setPaymentStrategy(PaymentStrategy ps) {
            this.paymentStrategy = ps;
        }

        void checkout(int amount) {
            paymentStrategy.pay(amount);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}

