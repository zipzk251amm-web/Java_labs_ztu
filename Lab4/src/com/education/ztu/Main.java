package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Завдання 2: Методи класу String ==========\n");

        String str = "I learn Java!!!";

        System.out.println("Останній символ: " + str.charAt(str.length() - 1));
        System.out.println("Закінчується на '!!!': " + str.endsWith("!!!"));
        System.out.println("Починається з 'I learn ': " + str.startsWith("I learn "));
        System.out.println("Містить 'Java': " + str.contains("Java"));
        System.out.println("Позиція 'Java': " + str.indexOf("Java"));
        System.out.println("Заміна 'a' на 'o': " + str.replace('a', 'o'));
        System.out.println("Верхній регістр: " + str.toUpperCase());
        System.out.println("Нижній регістр: " + str.toLowerCase());
        System.out.println("Вирізати 'Java': " + str.replace("Java", ""));

        System.out.println("\n========== Завдання 3: StringBuilder ==========\n");

        int a = 4, b = 36;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        sb.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        sb.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(sb.toString());

        // Insert + deleteCharAt
        StringBuilder sb2 = new StringBuilder("4 + 36 = 40");
        int index = sb2.indexOf("=");
        sb2.deleteCharAt(index);
        sb2.insert(index, "рівно");
        System.out.println("\nInsert + deleteCharAt: " + sb2);

        // Replace
        StringBuilder sb3 = new StringBuilder("4 + 36 = 40");
        sb3.replace(sb3.indexOf("="), sb3.indexOf("=") + 1, "рівно");
        System.out.println("Replace: " + sb3);

        // Reverse
        StringBuilder sb4 = new StringBuilder("4 + 36 = 40");
        System.out.println("Reverse: " + sb4.reverse());

        // Length та capacity
        StringBuilder sb5 = new StringBuilder("Hello");
        System.out.println("Довжина: " + sb5.length());
        System.out.println("Capacity: " + sb5.capacity());
    }
}