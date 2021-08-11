package com.tom.thread;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello 1");
        /*new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();*/
        //Runnable
//        Thread thread = new Thread(new FirstRunnable());
//        thread.start();
        new Thread(new FirstRunnable("h1")).start();
        new Thread(new FirstRunnable("h2")).start();
        new Thread(new FirstRunnable("h3")).start();
        System.out.println("Hello 2");
        //Dead lock
    }
}
