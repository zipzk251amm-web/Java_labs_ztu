package com.education.ztu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("========== Завдання 4: Чек з товарами ==========\n");

        LocalDateTime purchaseTime = LocalDateTime.of(2019, 3, 28, 13, 25, 12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

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

        double total = 0;
        for (String[] item : items) {
            total += Double.parseDouble(item[2]);
        }

        System.out.println("Дата та час покупки: " + purchaseTime.format(formatter));
        System.out.println("===========================================");
        System.out.printf("%-3s %-15s %-20s %-10s%n", "№", "Товар", "Категорія", "Ціна");
        System.out.println("===========================================");

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-3d %-15s %-20s %-10.2f грн%n",
                    (i + 1), items[i][0], items[i][1], Double.parseDouble(items[i][2]));
        }

        System.out.println("===========================================");
        System.out.printf("Разом: %-10.2f грн%n", total);
    }
}