package com.education.ztu;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть ціле додатне число: ");
        int number = scanner.nextInt();
        
        int sum = sumOfDigits(number);
        System.out.println("Сума цифр числа " + number + " = " + sum);
        
        scanner.close();
    }
    
    public static int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}