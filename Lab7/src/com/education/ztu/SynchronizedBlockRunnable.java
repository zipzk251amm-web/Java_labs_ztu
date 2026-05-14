package com.education.ztu;

public class SynchronizedBlockRunnable implements Runnable {
    private static int result = 0;
    private static final Object lock = new Object();

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (lock) {
                System.out.print(result + " ");
                result++;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}