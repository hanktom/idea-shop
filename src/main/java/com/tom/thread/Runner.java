package com.tom.thread;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello 1");
        new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();
        System.out.println("Hello 2");
    }
}
