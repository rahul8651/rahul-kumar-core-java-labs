package com.ibm.core.java.Day4.MultiThreading;

public class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker thread started");

        for (int i = 0; i < 10; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("Worker thread finished");
    }

    public static void main(String[] args) {

        Worker worker = new Worker();

        Thread thread = new Thread(worker);

        thread.start();

        System.out.println("Main thread finished");
    }
}