package com.learning.Threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 10;i>=0;i--){
            System.out.println("2nd thread value is "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThreadWithInt t = new MyThreadWithInt();
        Thread thr = new Thread(t);
        myThread.start();
//        thr.start();

    }
}

class MyThreadWithInt implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
