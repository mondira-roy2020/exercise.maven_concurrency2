package com.github.perschola;

public class MainApplicationPart2 {
    public static void main(String[] args) {
        //Runnable myObject = new MyObject();
        //myObject.run();
        Runnable myObject1 = new MyObject();
        Thread myThread1 = new Thread(myObject1);
        myThread1.start();

        Runnable myObject2 = new MyObject();
        Thread myThread2 = new Thread(myObject2);
        myThread2.start();
    }
}
