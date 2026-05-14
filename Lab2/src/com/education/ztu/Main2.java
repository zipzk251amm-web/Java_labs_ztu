package com.education.ztu;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("========== Демонстрація Operation ==========");
        System.out.println("Addition (1,2,3,4): " + Operation.addition(1, 2, 3, 4));
        System.out.println("Subtraction (10,2,3): " + Operation.subtraction(10, 2, 3));
        System.out.println("Multiplication (2,3,4): " + Operation.multiplication(2, 3, 4));
        System.out.println("Division (10,3): " + Operation.division(10, 3));
        System.out.println("Average (1,2,3,4,5): " + Operation.average(1, 2, 3, 4, 5));
        System.out.println("Maximum (1,5,2,8,3): " + Operation.maximum(1, 5, 2, 8, 3));
        System.out.println("Minimum (1,5,2,8,3): " + Operation.minimum(1, 5, 2, 8, 3));

        System.out.println("\n========== Всі значення Location enum ==========");
        for (Location loc : Location.values()) {
            System.out.println(loc);
        }
    }
}