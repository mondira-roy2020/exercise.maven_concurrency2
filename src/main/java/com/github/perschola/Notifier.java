package com.github.perschola;


public class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message msg){
        this.msg = msg;
    }
    @Override
    public void run(){
        String threadname = Thread.currentThread().getName();
        System.out.println(threadname + "started");
        try{
            Thread.sleep(1000);
            synchronized(msg){
                msg.setMessage(threadname + " Notifier work done");
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
