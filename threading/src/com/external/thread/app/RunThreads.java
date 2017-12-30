package com.external.thread.app;


/**
 * Hence, for creation of a thread we need a Runnable instance,
 * which has define run method. Thread object has start() method
 * which basically call run method of runnable instance.
 *
 * Main is also a thread which is called by JVM.
 *
 * Each of the thread has its own stack of running.
 */
public class RunThreads implements Runnable {

    public static void main(String[] args) {

        // Make one runnable instance.
        RunThreads runner = new RunThreads();


        // Make two threads, with the same Runnable (same job)
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        // Set name of the thread.
        alpha.setName("Alpha Thread");
        beta.setName("Beta Thread");

        // It basically call run() method of runnable instance.
        alpha.start();
        beta.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}
