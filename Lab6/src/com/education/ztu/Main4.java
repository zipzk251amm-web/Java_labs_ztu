package com.education.ztu;

import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("========== Завдання 6: Робота з класом File ==========\n");

        String basePath = "directory_for_files";
        String innerDirPath = basePath + "/inner_directory";

        // Створення нової папки
        File innerDir = new File(innerDirPath);
        if (innerDir.mkdir()) {
            System.out.println("Папку створено: " + innerDirPath);
        } else {
            System.out.println("Не вдалося створити папку (можливо, вже існує).");
        }

        // Абсолютний шлях
        System.out.println("Абсолютний шлях: " + innerDir.getAbsolutePath());

        // Ім'я батьківської директорії
        System.out.println("Батьківська директорія: " + innerDir.getParent());

        // Створення двох текстових файлів
        File file1 = new File(innerDirPath + "/file1.txt");
        File file2 = new File(innerDirPath + "/file2.txt");

        try {
            if (file1.createNewFile()) System.out.println("Створено: " + file1.getName());
            if (file2.createNewFile()) System.out.println("Створено: " + file2.getName());
        } catch (IOException e) {
            System.out.println("Помилка створення файлу: " + e.getMessage());
        }

        // Видалення одного файлу
        if (file1.delete()) {
            System.out.println("Видалено: " + file1.getName());
        }

        // Перейменування папки
        File renamedDir = new File(basePath + "/renamed_inner_directory");
        if (innerDir.renameTo(renamedDir)) {
            System.out.println("Папку перейменовано на: " + renamedDir.getName());
        }

        // Виведення списку файлів та папок у directory_for_files
        System.out.println("\n========== Вміст папки directory_for_files ==========\n");
        File baseDir = new File(basePath);
        File[] files = baseDir.listFiles();
        if (files != null) {
            for (File f : files) {
                String type = f.isDirectory() ? "Папка" : "Файл";
                System.out.printf("%-30s %-10s %d байт%n", f.getName(), type, f.length());
            }
        }
    }
}