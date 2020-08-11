package com.github.perschola;


public class WaitNotifyTest {
    public static void main(String[] args) {
        Message message = new Message("process it");
        Waiter waiter = new Waiter(message);
        new Thread(waiter,"waiter1").start();

        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1,"waiter2").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier,"notifier").start();
        System.out.println("All the Threads are started");
    }
}
