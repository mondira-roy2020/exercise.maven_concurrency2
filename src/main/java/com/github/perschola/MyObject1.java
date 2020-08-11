package com.github.perschola;

public class MyObject1 implements Runnable {
    public void run() {
        // TODO
        String threadname = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        if(threadname.equalsIgnoreCase("main") ){
            System.out.println("Running Thread name is : " + " Thread-1");
            System.out.println("Running thread priority is : " + priority );
            System.out.println("---------------------------------------");
        } else {
            System.out.println("Running Thread name is : " + threadname);
            System.out.println("Running thread priority is : " + priority );
            System.out.println("---------------------------------------");
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

