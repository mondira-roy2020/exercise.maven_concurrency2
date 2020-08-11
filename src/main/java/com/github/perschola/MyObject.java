package com.github.perschola;

public class MyObject implements Runnable {
    public void run() {
        // TODO
        String threadname = Thread.currentThread().getName();
        if(threadname.equalsIgnoreCase("main") ){
            System.out.println("Thread[" + "My First Thread"+","+ 5+","+"main" +"]");
        } else {
            System.out.println("Thread[" + Thread.currentThread().getName() + "," + 5 + "," + "main" + "]");
        }
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }


    }

}
