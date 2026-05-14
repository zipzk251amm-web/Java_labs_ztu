package com.education.ztu;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("========== Завдання 2: MyThread ==========");
        MyThread myThread = new MyThread();
        System.out.println("Стан потоку після створення (NEW): " + myThread.getState());
        System.out.println("Ім'я потоку: " + myThread.getName());
        System.out.println("Пріоритет потоку: " + myThread.getPriority());
        System.out.println("Чи є демоном? " + myThread.isDaemon());
        System.out.println("Чи живий? " + myThread.isAlive());

        myThread.setName("Мій люблюJavaПотік");
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\nПісля зміни:");
        System.out.println("Нове ім'я: " + myThread.getName());
        System.out.println("Новий пріоритет: " + myThread.getPriority());

        myThread.start();
        System.out.println("Стан після start() (RUNNABLE): " + myThread.getState());

        myThread.join();
        System.out.println("Після join() (TERMINATED): " + myThread.getState());

        Thread mainThread = Thread.currentThread();
        System.out.println("\nГоловний потік - ім'я: " + mainThread.getName());
        System.out.println("Головний потік - пріоритет: " + mainThread.getPriority());

        System.out.println("\n========== Завдання 3: MyRunnable ==========");
        Thread thread1 = new Thread(new MyRunnable(), "Потік-1");
        Thread thread2 = new Thread(new MyRunnable(), "Потік-2");
        Thread thread3 = new Thread(new MyRunnable(), "Потік-3");

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(2000);
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();

        System.out.println("\n========== Завдання 4: Арифметична прогресія (синхронізований метод) ==========");
        Thread arith1 = new Thread(new ArithmeticRunnable(), "Прогресія-1");
        Thread arith2 = new Thread(new ArithmeticRunnable(), "Прогресія-2");
        Thread arith3 = new Thread(new ArithmeticRunnable(), "Прогресія-3");
        arith1.start();
        arith2.start();
        arith3.start();

        Thread.sleep(3000);
        System.out.println("\n\n========== Завдання 5: Блок синхронізації ==========");
        Thread sync1 = new Thread(new SynchronizedBlockRunnable(), "Синхронізований-1");
        Thread sync2 = new Thread(new SynchronizedBlockRunnable(), "Синхронізований-2");
        Thread sync3 = new Thread(new SynchronizedBlockRunnable(), "Синхронізований-3");
        sync1.start();
        sync2.start();
        sync3.start();
        sync1.join();
        sync2.join();
        sync3.join();
    }
}