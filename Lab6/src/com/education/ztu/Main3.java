package com.education.ztu;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("========== Завдання 5: RandomAccessFile ==========\n");

        String filename = "directory_for_files/products.txt";

        // Запис початкового тексту
        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            raf.writeBytes("Список товарів:\n");
            raf.writeBytes("1. Ноутбук - 25000 грн\n");
            raf.writeBytes("2. Миша - 500 грн\n");
            raf.writeBytes("3. Клавіатура - 1200 грн\n");
            System.out.println("Початковий файл створено.");

            // Дописуємо в кінець файлу
            raf.seek(raf.length());
            raf.writeBytes("\nДодаткові товари:\n");
            raf.writeBytes("4. Монітор - 8000 грн\n");
            raf.writeBytes("5. Навушники - 1500 грн\n");
            System.out.println("Товари дописано в кінець файлу.");

            // Замінюємо текст у конкретному місці (позиція 20)
            raf.seek(20);
            raf.writeBytes("НОВИЙ СПИСОК ТОВАРІВ:\n");
            System.out.println("Текст замінено на позиції 20.");

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        // Читання файлу для перевірки
        System.out.println("\n========== Вміст файлу ==========\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка читання: " + e.getMessage());
        }
    }
}