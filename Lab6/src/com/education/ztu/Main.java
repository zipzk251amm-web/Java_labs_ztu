package com.education.ztu;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            if (login == null || !login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Login must contain only Latin letters, digits, underscore and be less than 20 characters");
            }
            if (password == null || !password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Password must contain only Latin letters, digits, underscore and be less than 20 characters");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirm password do not match");
            }
            System.out.println("Credentials are valid!");
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static void writeReceiptToFile(String filename) {
        String[][] items = {
                {"Джинси", "Жіночий одяг", "1500.78"},
                {"Спідниця", "Жіночий одяг", "1000.56"},
                {"Краватка", "Чоловічий одяг", "500.78"},
                {"Сорочка", "Чоловічий одяг", "899.99"},
                {"Плаття", "Жіночий одяг", "2500.00"},
                {"Куртка", "Чоловічий одяг", "3500.50"},
                {"Шапка", "Дитячий одяг", "299.99"},
                {"Шарф", "Дитячий одяг", "199.99"},
                {"Ремінь", "Чоловічий одяг", "450.00"},
                {"Сумка", "Жіночий одяг", "1200.00"}
        };

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        double total = 0;
        for (String[] item : items) {
            total += Double.parseDouble(item[2]);
        }

        // Створюємо папку, якщо її немає
        File dir = new File("C:\\Users\\OnkoAdmin\\Desktop\\Java\\Lab6\\directory_for_files");
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println("Папку створено: " + dir.getAbsolutePath());
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Дата та час покупки: " + now.format(formatter));
            writer.println("===========================================");
            writer.printf("%-3s %-15s %-20s %-10s%n", "№", "Товар", "Категорія", "Ціна");
            writer.println("===========================================");

            for (int i = 0; i < items.length; i++) {
                writer.printf("%-3d %-15s %-20s %-10.2f грн%n",
                        (i + 1), items[i][0], items[i][1], Double.parseDouble(items[i][2]));
            }

            writer.println("===========================================");
            writer.printf("Разом: %-10.2f грн%n", total);
            System.out.println("Звіт записано у файл: " + filename);

        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    public static void readReceiptFromFile(String filename) {
        System.out.println("\n========== Вміст файлу звіту ==========\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("========== Завдання 2: Перевірка логіну та паролю ==========\n");

        checkCredentials("user_123", "password123", "password123");
        checkCredentials("користувач", "pass123", "pass123");
        checkCredentials("user123", "verylongpasswordmorethan20chars", "verylongpasswordmorethan20chars");
        checkCredentials("user123", "pass123", "pass456");

        System.out.println("\n========== Завдання 3: Запис та читання звіту ==========\n");

        String receiptPath = "C:\\Users\\OnkoAdmin\\Desktop\\Java\\Lab6\\directory_for_files\\receipt.txt";
        writeReceiptToFile(receiptPath);
        readReceiptFromFile(receiptPath);
    }
}