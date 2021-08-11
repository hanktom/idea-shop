package com.tom.thread;

public class Tester {
    public static void main(String[] args) {
        //Lambda
        new Thread(()-> System.out.println("Run!"))
                .start();
        new Thread(() -> {
                for (int i = 0; i < 20; i++) {
                    System.out.println(" Running..." + i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }).start();
        //
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(getName() + " Running..." + i);
                    try {
                        sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
