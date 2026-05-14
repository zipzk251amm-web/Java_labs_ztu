package com.education.ztu;

public class Operation {
    public static int addition(int... numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return sum;
    }

    public static int subtraction(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) result -= numbers[i];
        return result;
    }

    public static int multiplication(int... numbers) {
        int result = 1;
        for (int num : numbers) result *= num;
        return result;
    }

    public static double division(int... numbers) {
        if (numbers.length < 2 || numbers[1] == 0) return 0;
        return (double) numbers[0] / numbers[1];
    }

    public static double average(int... numbers) {
        if (numbers.length == 0) return 0;
        return (double) addition(numbers) / numbers.length;
    }

    public static int maximum(int... numbers) {
        if (numbers.length == 0) return Integer.MIN_VALUE;
        int max = numbers[0];
        for (int num : numbers) if (num > max) max = num;
        return max;
    }

    public static int minimum(int... numbers) {
        if (numbers.length == 0) return Integer.MAX_VALUE;
        int min = numbers[0];
        for (int num : numbers) if (num < min) min = num;
        return min;
    }
}