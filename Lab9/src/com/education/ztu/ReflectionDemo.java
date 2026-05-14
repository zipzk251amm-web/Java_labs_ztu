package com.education.ztu;

import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) {
        System.out.println("========== Завдання 3: Reflection API ==========\n");

        try {
            // 1. Отримання об'єкта Class трьома способами
            System.out.println("--- Отримання об'єкта Class ---");
            Class<?> class1 = Employee.class;
            System.out.println("1) Employee.class: " + class1.getName());

            Class<?> class2 = Class.forName("com.education.ztu.Employee");
            System.out.println("2) Class.forName(): " + class2.getName());

            Employee emp = new Employee();
            Class<?> class3 = emp.getClass();
            System.out.println("3) obj.getClass(): " + class3.getName());

            System.out.println("\n--- Поля класу (тільки власні) ---");
            Field[] fields = class1.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Поле: " + field.getName() + ", Тип: " + field.getType().getSimpleName()
                        + ", Модифікатор: " + Modifier.toString(field.getModifiers()));
            }

            System.out.println("\n--- Методи класу (тільки власні) ---");
            Method[] methods = class1.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Метод: " + method.getName() + ", Повертає: " + method.getReturnType().getSimpleName()
                        + ", Параметри: " + method.getParameterCount());
            }

            System.out.println("\n--- Конструктори класу ---");
            Constructor<?>[] constructors = class1.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("Конструктор: " + constructor.getName() + ", Параметри: " + constructor.getParameterCount());
            }

            // 2. Створення екземпляра класу
            System.out.println("\n--- Створення екземпляра класу ---");
            Employee employee = (Employee) class1.getDeclaredConstructor().newInstance();
            System.out.println("Створено: " + employee);

            // 3. Виклик методу класу
            System.out.println("\n--- Виклик методу класу ---");
            Method workMethod = class1.getMethod("work");
            workMethod.invoke(employee);

            // 4. Робота з приватним полем
            System.out.println("\n--- Робота з приватним полем ---");
            Field ageField = class1.getDeclaredField("age");
            ageField.setAccessible(true);
            System.out.println("Приватне поле age до зміни: " + ageField.get(employee));
            ageField.set(employee, 30);
            System.out.println("Приватне поле age після зміни: " + ageField.get(employee));

            // 5. Виклик приватного методу
            System.out.println("\n--- Виклик приватного методу ---");
            Method changePositionMethod = class1.getDeclaredMethod("changePosition", String.class);
            changePositionMethod.setAccessible(true);
            changePositionMethod.invoke(employee, "Senior Developer");

        } catch (Exception e) {
            System.out.println("Помилка рефлексії: " + e.getMessage());
        }
    }
}