# Лабораторна робота №2

## Тема: Створення структури класу заданої предметної області

## Мета роботи:
створити ієрархію класів заданої предметної області, робота зі статичними методами.

---

## 📁 Структура проєкту
Lab2/
└── src/
└── com/education/ztu/
├── Main.java # Демонстрація роботи класів
├── Main2.java # Демонстрація Operation + Location
├── Human.java # Інтерфейс
├── Person.java # Абстрактний клас
├── Student.java # Студент
├── Teacher.java # Викладач
├── Employee.java # Працівник
├── Car.java # Автомобіль (з внутрішнім класом Engine)
├── Gender.java # Enum (MALE, FEMALE)
├── Location.java # Enum (KYIV, RIVNE, LVIV, ODESA, KHARKIV)
└── Operation.java # Математичні операції (varargs)

---

## ✅ Виконані завдання

### Завдання 1 – Створення ієрархії класів
- [x] Поля класів – `private` / `protected`
- [x] Конструктори (без аргументів та з аргументами)
- [x] Блок ініціалізації (значення за замовчуванням)
- [x] Геттери та сеттери
- [x] Статична змінна `counter` + статичний метод `showCounter()`
- [x] Enum `Location` та `Gender`
- [x] Інтерфейс `Human` (з default методом `whoIAm`)
- [x] Абстрактний клас `Person` (з абстрактним методом `getOccupation`)
- [x] Класи `Student`, `Teacher`, `Employee` (успадковують `Person`)
- [x] У `Teacher` та `Employee` – поле `Car`
- [x] Внутрішній клас `Engine` у `Car` (методи: `startEngine`, `stopEngine`, `isEngineWorks`)
- [x] Додаткові поля та методи (за бажанням)
- [x] Демонстрація `instanceof` у `Main`

### Завдання 2 – Клас Operation
- [x] Методи: `addition`, `subtraction`, `multiplication`, `division`, `average`, `maximum`, `minimum`
- [x] Використання `varargs` (необмежена кількість аргументів)
- [x] Демонстрація у `Main2`
- [x] Виведення всіх значень `Location`

### Завдання 3 – UML діаграма
- [ ] [UML діаграма Lab2](UML_Lab2.png)

---

## 🚀 Як запустити

1. Відкрити проєкт у **IntelliJ IDEA**
2. Запустити `Main.java` – демонстрація ієрархії класів
3. Запустити `Main2.java` – демонстрація математичних операцій

---

## 📸 Приклад виконання

### Main.java (фрагмент)
========== Демонстрація роботи класів ==========

Full name: Ivan Petrenko
Age: 20
Gender: MALE
Location: KYIV
Occupation: Student of KPI, Computer Science, course 2
I am a student

Full name: Maria Shevchenko
Age: 35
Gender: FEMALE
Location: LVIV
Occupation: Teacher at LNU, subject: Mathematics
I am a teacher
Toyota engine started

Total Persons created: 3
student instanceof Person: true


### Main2.java (фрагмент)
========== Демонстрація Operation ==========
Addition (1,2,3,4): 10
Division (10,3): 3.3333333333333335
Maximum (1,5,2,8,3): 8

========== Всі значення Location enum ==========
KYIV
RIVNE
LVIV
ODESA
KHARKIV

---

## 👤 Автор

**Андросович Максим**  
GitHub: [zipzk251amm-web](https://github.com/zipzk251amm-web)

---
