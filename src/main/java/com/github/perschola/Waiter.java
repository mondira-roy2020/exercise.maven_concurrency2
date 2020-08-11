package com.github.perschola;

public class Waiter implements Runnable {
    private Message msg;

    public Waiter(Message msg){
        this.msg = msg;
    }
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        synchronized (msg){
            try{
                System.out.println(threadName + "waiting to get notified at time:" + System.currentTimeMillis());
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " Thread got notified at time:" + System.currentTimeMillis());
            System.out.println(threadName+"processed:" + msg.getMessage());
        }
    }
}
