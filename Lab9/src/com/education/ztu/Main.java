package com.education.ztu;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Завдання 2: Регулярні вирази ==========\n");

        // Текст із даними співробітників
        String text = """
                Іван Петренко, 25 років, посада: Java Developer, досвід: 3 роки, адреса: м. Київ, вул. Хрещатик 15,
                email: ivan.petrenko@example.com, телефон: +380501234567, дата народження: 15.03.1999
                
                Марія Шевченко, 30 років, посада: Project Manager, досвід: 7 років, адреса: м. Львів, вул. Січових Стрільців 10,
                email: maria.shevchenko@work.ua, телефон: 380971112233, дата народження: 22.07.1994
                
                Олексій Коваленко, 28 років, посада: QA Engineer, досвід: 5 років, адреса: м. Одеса, вул. Дерибасівська 20,
                email: olexiy.kovalenko@gmail.com, телефон: +380931234567, дата народження: 10.11.1996
                
                Олена Гончар, 35 років, посада: Team Lead, досвід: 10 років, адреса: м. Дніпро, вул. Яворницького 5,
                email: elena.gonchar@company.com, телефон: 380501234567, дата народження: 03.05.1989
                
                Андрій Бондаренко, 27 років, посада: DevOps Engineer, досвід: 4 роки, адреса: м. Харків, вул. Сумська 50,
                email: andriy.bondarenko@devops.org, телефон: +380671234567, дата народження: 28.12.1997
                """;

        System.out.println("--- Оригінальний текст ---");
        System.out.println(text);

        // Пошук телефонів
        System.out.println("\n--- Номери телефонів ---");
        Pattern phonePattern = Pattern.compile("\\+?380\\d{9}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }

        // Пошук email
        System.out.println("\n--- Email адреси ---");
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher emailMatcher = emailPattern.matcher(text);
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }

        // Зміна формату дат (DD.MM.YYYY -> YYYY-MM-DD)
        System.out.println("\n--- Дати після зміни формату (DD.MM.YYYY -> YYYY-MM-DD) ---");
        Pattern datePattern = Pattern.compile("(\\d{2})\\.(\\d{2})\\.(\\d{4})");
        Matcher dateMatcher = datePattern.matcher(text);
        String textWithNewDates = text;
        while (dateMatcher.find()) {
            String oldDate = dateMatcher.group();
            String newDate = dateMatcher.group(3) + "-" + dateMatcher.group(2) + "-" + dateMatcher.group(1);
            textWithNewDates = textWithNewDates.replace(oldDate, newDate);
        }
        System.out.println(textWithNewDates);

        // Зміна посад кільком співробітникам
        System.out.println("\n--- Текст після зміни посад ---");
        String finalText = textWithNewDates
                .replace("Java Developer", "Senior Java Developer")
                .replace("QA Engineer", "Lead QA Engineer");
        System.out.println(finalText);
    }
}