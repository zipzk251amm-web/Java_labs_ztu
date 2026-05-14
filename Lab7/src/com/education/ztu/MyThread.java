package com.education.ztu;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("\n=== Стан потоку: RUNNING ===");
        for (int i = 0; i < 100; i++) {
            System.out.println("Я люблю програмувати!!!");
        }
    }
}