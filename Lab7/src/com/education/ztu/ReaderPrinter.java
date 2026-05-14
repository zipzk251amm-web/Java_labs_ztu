package com.education.ztu;

import java.util.Scanner;

public class ReaderPrinter {
    private String data;
    private boolean dataAvailable = false;

    public synchronized void read() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть рядок (або 'exit' для виходу): ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Програма завершена.");
                System.exit(0);
            }
            data = input;
            dataAvailable = true;
            notify();
            try {
                wait(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        scanner.close();
    }

    public synchronized void print() {
        while (true) {
            while (!dataAvailable) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Printer вивів: " + data);
            dataAvailable = false;
            notify();
        }
    }

    public static void main(String[] args) {
        ReaderPrinter rp = new ReaderPrinter();

        Thread readerThread = new Thread(rp::read);
        Thread printerThread = new Thread(rp::print);

        readerThread.start();
        printerThread.start();
    }
}