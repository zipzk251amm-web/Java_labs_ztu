package com.education.ztu;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("========== Завдання 6: Робота з датами ==========\n");

        // Дата початку лабораторної
        LocalDateTime labStart = LocalDateTime.of(2026, Month.MAY, 14, 14, 30, 0);
        System.out.println("Початок лабораторної: " + labStart.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));

        // Виведення компонентів дати
        System.out.println("День тижня: " + labStart.getDayOfWeek());
        System.out.println("День у році: " + labStart.getDayOfYear());
        System.out.println("Місяць: " + labStart.getMonth());
        System.out.println("Рік: " + labStart.getYear());
        System.out.println("Години: " + labStart.getHour());
        System.out.println("Хвилини: " + labStart.getMinute());
        System.out.println("Секунди: " + labStart.getSecond());

        // Перевірка на високосний рік
        System.out.println("Рік високосний: " + labStart.toLocalDate().isLeapYear());

        // Поточний час
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nПоточний час: " + now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));

        // Порівняння
        System.out.println("Початок лабораторної після поточного часу? " + labStart.isAfter(now));
        System.out.println("Початок лабораторної перед поточним часом? " + labStart.isBefore(now));

        // Зміна значень
        LocalDateTime modified = labStart.withHour(10).withMinute(0).withSecond(0).plusDays(5);
        System.out.println("\nЗмінена дата: " + modified.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
    }
}