package com.github.perschola;

public class MainApplicationPart4 {
    public static void main(String[] args) {
        Runnable myObject1 = new MyObject1();
        Thread myThread1 = new Thread(myObject1, "My First Thread");
        myThread1.setPriority(1);
        myThread1.start();

        Runnable myObject2 = new MyObject1();
        Thread myThread2 = new Thread(myObject2, "My Second Thread");
        myThread2.setPriority(10);
        myThread2.start();

        Runnable myObject3 = new MyObject1();
        Thread myThread3 = new Thread(myObject3, "My Third Thread");
        myThread3.setPriority(5);
        myThread3.start();
    }
    }

