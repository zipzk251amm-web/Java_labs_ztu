package com.education.ztu;

public class ArithmeticRunnable implements Runnable {
    private static int result = 0;

    public static synchronized void printAndIncrement() {
        System.out.print(result + " ");
        result++;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            printAndIncrement();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}