package com.education.ztu;

import java.io.*;
import java.util.zip.*;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("========== Завдання 7: Створення архіву ==========\n");

        String basePath = "directory_for_files";
        String zipPath = basePath + "/archive.zip";

        // Створення архіву
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath))) {
            File baseDir = new File(basePath);
            File[] files = baseDir.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && !file.getName().endsWith(".zip")) {
                        try (FileInputStream fis = new FileInputStream(file)) {
                            ZipEntry zipEntry = new ZipEntry(file.getName());
                            zos.putNextEntry(zipEntry);

                            byte[] buffer = new byte[1024];
                            int length;
                            while ((length = fis.read(buffer)) >= 0) {
                                zos.write(buffer, 0, length);
                            }
                            zos.closeEntry();
                            System.out.println("Додано до архіву: " + file.getName());
                        }
                    }
                }
            }
            System.out.println("\nАрхів створено: " + zipPath);

        } catch (IOException e) {
            System.out.println("Помилка створення архіву: " + e.getMessage());
        }

        // Виведення списку файлів з архіву
        System.out.println("\n========== Вміст архіву ==========\n");
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipPath))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("Файл в архіві: " + entry.getName());
                zis.closeEntry();
            }
        } catch (IOException e) {
            System.out.println("Помилка читання архіву: " + e.getMessage());
        }
    }
}