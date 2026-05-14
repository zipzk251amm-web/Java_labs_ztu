# Лабораторна робота №9

## Тема: Регулярні вирази. Рефлексія. Анотації.

## Мета роботи:
практика роботи з регулярними виразами, використання рефлексії, створення власних анотацій.

---

## 📁 Структура проєкту

Lab_9/
└── src/
└── com/education/ztu/
├── Employee.java # Клас для рефлексії
├── MyAnnotation.java # Власна анотація
├── ReflectionDemo.java # Завдання 3 (Reflection API)
└── Main.java # Завдання 2 (Регулярні вирази)


---

## ✅ Виконані завдання

### Завдання 2 – Регулярні вирази
- [x] Пошук всіх номерів телефонів у тексті
- [x] Пошук всіх email адрес у тексті
- [x] Зміна формату дат (DD.MM.YYYY → YYYY-MM-DD)
- [x] Зміна посад кільком співробітникам

### Завдання 3 – Reflection API
- [x] Отримання об'єкта Class трьома способами
- [x] Отримання всіх полів, методів, конструкторів класу
- [x] Створення екземпляра класу через рефлексію
- [x] Виклик методу класу через рефлексію
- [x] Робота з приватним полем (встановлення та отримання значення)
- [x] Виклик приватного методу через рефлексію

### Завдання 4 – Власна анотація
- [x] Створення анотації `@MyAnnotation` з полями: `name`, `value`, `description`
- [x] Встановлення `@Target` (TYPE, METHOD, FIELD)
- [x] Встановлення `@Retention(RetentionPolicy.RUNTIME)`
- [x] Використання анотації в класі `Employee` та методі `work()`

---

## 🚀 Як запустити

1. Відкрити проєкт у **IntelliJ IDEA**
2. Запустити `Main.java` – демонстрація регулярних виразів
3. Запустити `ReflectionDemo.java` – демонстрація рефлексії

---

## 📸 Приклад виконання

### Main.java (Регулярні вирази)

========== Завдання 2: Регулярні вирази ==========

--- Оригінальний текст ---
Іван Петренко, 25 років, посада: Java Developer, досвід: 3 роки, адреса: м. Київ, вул. Хрещатик 15,
email: ivan.petrenko@example.com, телефон: +380501234567, дата народження: 15.03.1999
...

--- Номери телефонів ---
+380501234567
380971112233
+380931234567
380501234567
+380671234567

--- Email адреси ---
ivan.petrenko@example.com
maria.shevchenko@work.ua
olexiy.kovalenko@gmail.com
elena.gonchar@company.com
andriy.bondarenko@devops.org

--- Дати після зміни формату (DD.MM.YYYY -> YYYY-MM-DD) ---
... дата народження: 1999-03-15
... дата народження: 1994-07-22
... дата народження: 1996-11-10
... дата народження: 1989-05-03
... дата народження: 1997-12-28

--- Текст після зміни посад ---
... посада: Senior Java Developer
... посада: Lead QA Engineer


### ReflectionDemo.java (Reflection API)

========== Завдання 3: Reflection API ==========

--- Отримання об'єкта Class ---

Employee.class: com.education.ztu.Employee

Class.forName(): com.education.ztu.Employee

obj.getClass(): com.education.ztu.Employee

--- Поля класу (тільки власні) ---
Поле: fullName, Тип: String, Модифікатор: public
Поле: age, Тип: int, Модифікатор: private
Поле: position, Тип: String, Модифікатор: protected
Поле: experience, Тип: int, Модифікатор: private
Поле: email, Тип: String, Модифікатор: public
Поле: phone, Тип: String, Модифікатор: private

--- Методи класу (тільки власні) ---
Метод: getFullName, Повертає: String, Параметри: 0
Метод: setFullName, Повертає: void, Параметри: 1
Метод: getAge, Повертає: int, Параметри: 0
Метод: setAge, Повертає: void, Параметри: 1
...

--- Створення екземпляра класу ---
Створено: Employee{fullName='Unknown', age=0, position='Unknown', experience=0, email='unknown@example.com', phone='+0000000000'}

--- Виклик методу класу ---
Unknown is working...

--- Робота з приватним полем ---
Приватне поле age до зміни: 0
Приватне поле age після зміни: 30

--- Виклик приватного методу ---
Position changed to: Senior Developer


---

## 📝 Анотація `@MyAnnotation`

```java
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "DefaultName";
    int value() default 0;
    String description() default "No description";
}

икористання:

На класі Employee: @MyAnnotation(name = "EmployeeClass", value = 1, description = "Class for employee data")

На методі work(): @MyAnnotation(name = "workMethod", value = 2, description = "Method for work")

👤 Автор
Андросович Максим
GitHub: zipzk251amm-web
