package com.education.ztu;

import com.education.ztu.game.Schoolar;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Демонстрація клонування ==========\n");

        Schoolar p1 = new Schoolar("Ivan", 13);
        Schoolar p2 = (Schoolar) p1.clone();

        System.out.println("Original: " + p1);
        System.out.println("Cloned: " + p2);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
    }
}