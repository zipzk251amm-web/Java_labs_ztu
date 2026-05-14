package com.education.ztu;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть перше додатне число: ");
        int a = scanner.nextInt();
        
        System.out.print("Введіть друге додатне число: ");
        int b = scanner.nextInt();
        
        int gcd = findGCD(a, b);
        System.out.println("НСД(" + a + ", " + b + ") = " + gcd);
        
        scanner.close();
    }
    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}