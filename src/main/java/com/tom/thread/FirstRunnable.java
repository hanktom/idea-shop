package com.tom.thread;

public class FirstRunnable implements Runnable {
    String name;
    public FirstRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + " Running..." + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
