package com.education.ztu;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть кількість елементів n: ");
        int n = scanner.nextInt();
        
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        if (n > 1) {
            fibonacci[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = fibonacci[n - 1 - i];
        }
        
        System.out.println("Послідовність Фібоначчі:");
        printArray(fibonacci);
        
        System.out.println("Зворотна послідовність Фібоначчі:");
        printArray(reversed);
        
        scanner.close();
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}