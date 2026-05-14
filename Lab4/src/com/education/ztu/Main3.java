package com.education.ztu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("========== Завдання 5: Інтернаціоналізація ==========\n");

        // Товари
        String[][] items = {
                {"Jeans", "Women's clothing", "1500.78"},
                {"Skirt", "Women's clothing", "1000.56"},
                {"Tie", "Men's clothing", "500.78"},
                {"Shirt", "Men's clothing", "899.99"},
                {"Dress", "Women's clothing", "2500.00"},
                {"Jacket", "Men's clothing", "3500.50"},
                {"Hat", "Children's clothing", "299.99"},
                {"Scarf", "Children's clothing", "199.99"},
                {"Belt", "Men's clothing", "450.00"},
                {"Bag", "Women's clothing", "1200.00"}
        };

        // Англійська
        System.out.println("\n========== ENGLISH ==========\n");
        printReceipt(items, "en");

        // Українська
        System.out.println("\n========== УКРАЇНСЬКА ==========\n");
        printReceipt(items, "ua");

        // Німецька
        System.out.println("\n========== DEUTSCH ==========\n");
        printReceipt(items, "de");
    }

    public static void printReceipt(String[][] items, String lang) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        // Заголовки залежно від мови
        String title, dateLabel, col1, col2, col3, totalLabel, currency;

        switch (lang) {
            case "ua":
                title = "Чек покупки";
                dateLabel = "Дата та час покупки:";
                col1 = "Товар";
                col2 = "Категорія";
                col3 = "Ціна";
                totalLabel = "Разом:";
                currency = "грн";
                break;
            case "de":
                title = "Kaufbeleg";
                dateLabel = "Datum und Uhrzeit des Kaufs:";
                col1 = "Produkt";
                col2 = "Kategorie";
                col3 = "Preis";
                totalLabel = "Gesamt:";
                currency = "EUR";
                break;
            default:
                title = "Purchase Receipt";
                dateLabel = "Date and time of purchase:";
                col1 = "Product";
                col2 = "Category";
                col3 = "Price";
                totalLabel = "Total:";
                currency = "USD";
                break;
        }

        System.out.println(title);
        System.out.println(dateLabel + " " + now.format(formatter));
        System.out.println("===========================================");
        System.out.printf("%-3s %-18s %-22s %-12s%n", "№", col1, col2, col3);
        System.out.println("===========================================");

        double total = 0;
        for (int i = 0; i < items.length; i++) {
            double price = Double.parseDouble(items[i][2]);
            total += price;
            System.out.printf("%-3d %-18s %-22s %-12.2f %s%n",
                    (i + 1), items[i][0], items[i][1], price, currency);
        }

        System.out.println("===========================================");
        System.out.printf("%s %-10.2f %s%n", totalLabel, total, currency);
    }
}