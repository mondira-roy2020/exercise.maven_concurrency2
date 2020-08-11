package com.github.perschola;

public class MainApplicationPart2B {

        public static void main(String[] args) {
            Runnable myObject = new MyObject();
            Thread myThread1 = new Thread(myObject);
            myThread1.run();

            Runnable myObject2 = new MyObject();
            Thread myThread2 = new Thread(myObject2);
            myThread2.start();

            Runnable myObject3 = new MyObject();
            Thread myThread3 = new Thread(myObject3);
            myThread3.start();
        }
    }

