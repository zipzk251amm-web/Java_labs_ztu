package com.education.ztu;

import java.util.Random;
import java.util.concurrent.*;

public class ArraySum {

    public static long sumSingleThread(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static long sumMultiThread(int[] array, int threadsCount) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);
        int chunkSize = array.length / threadsCount;
        Future<Long>[] futures = new Future[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            final int start = i * chunkSize;
            final int end = (i == threadsCount - 1) ? array.length : start + chunkSize;
            futures[i] = executor.submit(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                return sum;
            });
        }

        long totalSum = 0;
        for (Future<Long> future : futures) {
            totalSum += future.get();
        }
        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int size = 1_000_000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        // Однопотокове виконання
        long startSingle = System.currentTimeMillis();
        long singleSum = sumSingleThread(array);
        long endSingle = System.currentTimeMillis();
        System.out.println("Однопотокова сума: " + singleSum);
        System.out.println("Час виконання (однопотоково): " + (endSingle - startSingle) + " ms");

        // Багатопотокове виконання
        long startMulti = System.currentTimeMillis();
        long multiSum = sumMultiThread(array, 5);
        long endMulti = System.currentTimeMillis();
        System.out.println("Багатопотокова сума: " + multiSum);
        System.out.println("Час виконання (багатопотоково): " + (endMulti - startMulti) + " ms");
    }
}