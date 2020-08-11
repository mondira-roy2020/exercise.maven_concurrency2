package com.github.perschola;

public class MainApplicationPart3 {


        public static void main(String[] args) {
            Runnable myObject = new MyObject();
            Thread myThread1 = new Thread(myObject, "My First Thread");
            myThread1.run();

            Runnable myObject2 = new MyObject();
            Thread myThread2 = new Thread(myObject2, "My Second Thread");
            myThread2.start();

            Runnable myObject3 = new MyObject();
            Thread myThread3 = new Thread(myObject3, "My Third Thread");
            myThread3.start();
        }
    }


