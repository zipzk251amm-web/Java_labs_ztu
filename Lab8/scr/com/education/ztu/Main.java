package com.education.ztu;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Завдання 2: Власний функціональний інтерфейс ==========\n");

        // Лямбда вираз для Printable
        Printable printable = () -> System.out.println("Привіт з лямбда виразу!");
        printable.print();

        System.out.println("\n========== Завдання 3a: Predicate ==========\n");

        // Лямбда для перевірки, чи рядок є числом
        Predicate<String> isNumber = s -> {
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        };

        System.out.println("123 є числом? " + isNumber.test("123"));
        System.out.println("abc є числом? " + isNumber.test("abc"));
        System.out.println("12.5 є числом? " + isNumber.test("12.5"));

        // Використання and()
        Predicate<String> isPositiveNumber = isNumber.and(s -> Double.parseDouble(s) > 0);
        System.out.println("5 є додатним числом? " + isPositiveNumber.test("5"));
        System.out.println("-3 є додатним числом? " + isPositiveNumber.test("-3"));

        System.out.println("\n========== Завдання 3b: Consumer ==========\n");

        Consumer<String> startLesson = s -> System.out.println("Пара почалася о " + s);
        Consumer<String> endLesson = s -> System.out.println("Пара закінчилася о " + s);

        Consumer<String> lessonSchedule = startLesson.andThen(endLesson);
        lessonSchedule.accept("8:30");

        System.out.println("\n========== Завдання 3c: Supplier ==========\n");

        Supplier<String> threeUpperCaseLetters = () -> {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                char c = (char) ('A' + random.nextInt(26));
                sb.append(c);
            }
            return sb.toString();
        };

        System.out.println("Випадкові 3 великі літери: " + threeUpperCaseLetters.get());

        System.out.println("\n========== Завдання 3d: Function ==========\n");

        Function<String, Integer> productOfNumbers = s -> {
            String[] parts = s.split(" ");
            int product = 1;
            for (String part : parts) {
                product *= Integer.parseInt(part);
            }
            return product;
        };

        System.out.println("Добуток чисел '2 3 4': " + productOfNumbers.apply("2 3 4"));
        System.out.println("Добуток чисел '1 5 2': " + productOfNumbers.apply("1 5 2"));

        System.out.println("\n========== Завдання 4: Stream API ==========\n");

        List<Product> products = Arrays.asList(
                new Product("Ноутбук", "Asus", 25000, 5),
                new Product("Миша", "Logitech", 500, 20),
                new Product("Клавіатура", "Logitech", 1200, 15),
                new Product("Монітор", "Samsung", 8000, 3),
                new Product("Навушники", "Sony", 1500, 10),
                new Product("Колонки", "JBL", 2000, 7),
                new Product("Флешка", "Kingston", 300, 50),
                new Product("Зарядка", "Baseus", 400, 25)
        );

        // Всі бренди (map)
        System.out.println("Всі бренди:");
        products.stream().map(Product::getBrand).distinct().forEach(System.out::println);

        // 2 товари з ціною менше 1000 (filter, limit)
        System.out.println("\n2 товари з ціною менше 1000:");
        products.stream()
                .filter(p -> p.getPrice() < 1000)
                .limit(2)
                .forEach(System.out::println);

        // Сума всіх товарів на складі (reduce)
        int totalCount = products.stream().mapToInt(Product::getCount).sum();
        System.out.println("\nЗагальна кількість товарів на складі: " + totalCount);

        // Групування за брендом (groupingBy)
        System.out.println("\nТовари за брендами:");
        Map<String, List<Product>> byBrand = products.stream()
                .collect(Collectors.groupingBy(Product::getBrand));
        byBrand.forEach((brand, productList) -> {
            System.out.println(brand + ": " + productList.size() + " товарів");
        });

        // Сортування за ціною (sorted)
        System.out.println("\nТовари, відсортовані за ціною:");
        Product[] sortedProducts = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toArray(Product[]::new);
        for (Product p : sortedProducts) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }

        System.out.println("\n========== Завдання 5: Посилання на методи ==========\n");

        // Заміна лямбди на посилання на метод
        System.out.println("Бренди через посилання на метод:");
        products.stream().map(Product::getBrand).distinct().forEach(System.out::println);

        // Заміна toArray
        Product[] productsArray = products.stream().toArray(Product[]::new);
        System.out.println("Кількість товарів у масиві: " + productsArray.length);

        System.out.println("\n========== Завдання 6: Optional ==========\n");

        List<Integer> numbers = Arrays.asList(10, 25, 7, 33, 18);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println("Максимальне значення: " + max.orElseThrow(() -> new RuntimeException("Числа відсутні")));

        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> maxEmpty = emptyList.stream().max(Integer::compareTo);
        System.out.println("Результат для порожнього списку: " + maxEmpty.orElse(null));

        // Додаткова демонстрація Optional
        String result = maxEmpty.map(String::valueOf).orElse("Числа відсутні");
        System.out.println("Результат з повідомленням: " + result);
    }
}