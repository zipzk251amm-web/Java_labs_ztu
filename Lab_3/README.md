# Лабораторна робота №3

## Тема: Використання узагальнень (generics). Клонування та порівняння об'єктів.

## Мета роботи:
створити міні проект Game з використанням узагальнень, клонування та порівняння об'єктів.

---

## 📁 Структура проєкту
Lab_3/
└── src/
└── com/education/ztu/
├── game/
│ ├── Participant.java # абстрактний клас (Cloneable, Comparable)
│ ├── Schoolar.java # школяр
│ ├── Student.java # студент
│ ├── Employee.java # працівник
│ ├── Team.java # команда (з Generics)
│ ├── AgeComparator.java # компаратор для порівняння за віком
│ └── Game.java # демонстрація Generics
├── Main.java # демонстрація клонування
└── Main2.java # демонстрація сортування


---

## ✅ Виконані завдання

### Завдання 1 – Generics
- [x] Обмеження: до команди можна додавати тільки учасників однієї ліги
- [x] Грати можуть тільки команди з однаковим типом учасників
- [x] Демонстрація у `Game.java`

### Завдання 2 – Клонування
- [x] `Participant` імплементує `Cloneable`, перевизначено `clone()`
- [x] Перевизначено `hashCode()` та `equals()`
- [x] Перевизначено `toString()` для всіх класів
- [x] Глибоке клонування команди через `deepClone()`
- [x] Демонстрація у `Main.java`

### Завдання 3 – Порівняння
- [x] `Participant` імплементує `Comparable` (сортування за іменем)
- [x] Створено `AgeComparator` (сортування за віком)
- [x] Комбінований компаратор (Java 8: ім'я → вік)
- [x] Демонстрація у `Main2.java`

---

## 🚀 Як запустити

1. Відкрити проєкт у **IntelliJ IDEA**
2. Запустити `Game.java` – демонстрація Generics
3. Запустити `Main.java` – демонстрація клонування
4. Запустити `Main2.java` – демонстрація сортування

---

## 📸 Приклад виконання

### Main.java (клонування)
========== Демонстрація клонування ==========

Original: Schoolar{name='Ivan', age=13}
Cloned: Schoolar{name='Ivan', age=13}
p1.equals(p2): true
p1.hashCode(): 71029972
p2.hashCode(): 71029972

### Main2.java (сортування)
========== Демонстрація сортування ==========

До сортування:
Schoolar{name='Olga', age=14}
Schoolar{name='Ivan', age=13}
Schoolar{name='Andriy', age=15}
Schoolar{name='Bohdan', age=12}

Після сортування за іменем:
Schoolar{name='Andriy', age=15}
Schoolar{name='Bohdan', age=12}
Schoolar{name='Ivan', age=13}
Schoolar{name='Olga', age=14}

Після сортування за віком:
Schoolar{name='Bohdan', age=12}
Schoolar{name='Ivan', age=13}
Schoolar{name='Olga', age=14}
Schoolar{name='Andriy', age=15}

### Game.java (Generics)
========== Демонстрація Generics ==========

To the team Dragon was added participant Ivan
To the team Dragon was added participant Mariya
To the team Vpered was added participant Mykola
To the team Vpered was added participant Viktoria
To the team Robotyagi was added participant Andriy
To the team Robotyagi was added participant Oksana
To the team Rozumnyky was added participant Sergey

=== Гра між командами школярів ===
The team Rozumnyky is winner!

text

---

## 👤 Автор

**Андросович Максим**  
GitHub: [zipzk251amm-web](https://github.com/zipzk251amm-web)

---
