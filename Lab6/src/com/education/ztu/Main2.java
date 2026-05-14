package com.education.ztu;

import java.io.*;

public class Main2 {

    // Копіювання текстового файлу
    public static void copyTextFile(String source, String dest) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Текстовий файл скопійовано: " + source + " -> " + dest);

        } catch (IOException e) {
            System.out.println("Помилка копіювання текстового файлу: " + e.getMessage());
        }
    }

    // Копіювання зображення (бінарний файл)
    public static void copyImageFile(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Зображення скопійовано: " + source + " -> " + dest);

        } catch (IOException e) {
            System.out.println("Помилка копіювання зображення: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("========== Завдання 4: Копіювання файлів ==========\n");

        // Копіювання текстового файлу
        copyTextFile("directory_for_files/receipt.txt", "directory_for_files/copy_receipt.txt");

        // Копіювання зображення (якщо є файл image.jpg)
        // Спочатку створіть тестовий файл або використайте будь-яку картинку
        String imageSource = "directory_for_files/image.jpg";
        String imageDest = "directory_for_files/image_copy.jpg";

        File imageFile = new File(imageSource);
        if (imageFile.exists()) {
            copyImageFile(imageSource, imageDest);
        } else {
            System.out.println("Файл зображення не знайдено. Створіть " + imageSource + " для тестування.");
        }
    }
}