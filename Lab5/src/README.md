# Лабораторна робота №5

## Тема: Java Collections Framework

## Мета роботи:
робота з Java Collections Framework: List, Queue, Set, Map та утилітним класом Collections.

---

## 📁 Структура проєкту
Lab_5/
└── src/
└── com/education/ztu/
├── Product.java # Клас Product (товар)
└── Main.java # Демонстрація всіх колекцій

text

---

## ✅ Виконані завдання

### Завдання 2 – Клас Product
- [x] Поля: id, name, category, price, quantity
- [x] Конструктори, геттери, сеттери
- [x] Перевизначено `toString()`, `equals()`, `hashCode()`
- [x] Реалізовано `Comparable<Product>` (сортування за назвою)

### Завдання 3 – ArrayList (динамічний масив)
Демонстрація методів:
- `add`, `addAll`, `get`, `indexOf`, `lastIndexOf`
- `iterator`, `listIterator`, `remove`, `set`, `sort`
- `subList`, `clear`, `contains`, `isEmpty`
- `retainAll`, `size`, `toString`

### Завдання 4 – LinkedList (черга)
Демонстрація методів:
- `push`, `offerLast`, `getFirst`, `peekLast`
- `pop`, `removeLast`, `pollLast`

### Завдання 5 – TreeSet (множина)
Демонстрація методів:
- `add`, `first`, `last`, `headSet`, `subSet`, `tailSet`
- `ceiling`, `floor`, `higher`, `lower`
- `pollFirst`, `pollLast`, `descendingSet`

### Завдання 6 – HashMap (Map)
Демонстрація методів:
- `put`, `get`, `containsKey`, `containsValue`
- `putIfAbsent`, `keySet`, `values`, `putAll`
- `remove`, `size`, `entrySet` (з `getKey`, `getValue`, `setValue`)

### Завдання 7 – Утилітний клас Collections
Демонстрація методів:
- `binarySearch`, `reverse`, `shuffle`, `fill`
- `max`, `min`, `copy`, `rotate`, `frequency`

---

## 🚀 Як запустити

1. Відкрити проєкт у **IntelliJ IDEA**
2. Запустити `Main.java`

---
========== Завдання 3: ArrayList ==========

Після add: 3
Після addAll: 6
get(0): Ноутбук
indexOf(Миша): 1
lastIndexOf(Миша): 4
iterator: Ноутбук Миша Клавіатура Монітор Навушники Колонки Миша
listIterator (з кінця): Миша Колонки Навушники Монітор Клавіатура Миша Ноутбук
Після remove(Миша): 6
Після set: Ноутбук Pro
Сортування за ціною: Ноутбук Pro Навушники Колонки Монітор Клавіатура
subList (0-2): 3
contains(Ноутбук): true
isEmpty: false
Після retainAll: 3
size: 3
toString: [Product{id=1, name='Ноутбук Pro', ...}, Product{id=3, name='Клавіатура', ...}, Product{id=5, name='Навушники', ...}]
Після clear, size: 0
## 📸 Приклад виконання


### LinkedList (черга)

========== Завдання 4: LinkedList (черга) ==========

Після push: Новий продукт
Після offerLast: Останній
getFirst: Новий продукт
peekLast: Останній
pop: Новий продукт
removeLast: Останній
pollLast: Флешка


### TreeSet (множина)

========== Завдання 5: TreeSet ==========

first: Ноутбук
last: Чохол
headSet (до Монітор): Ноутбук Клавіатура Колонки Миша Монітор
subSet (Миша до Навушники): Миша Монітор
tailSet (від Навушники): Навушники Ноутбук Про Флешка Чохол
ceiling (нижче Монітор): Монітор
floor (вище Монітор): Монітор
higher (вище Монітор): Навушники
lower (нижче Монітор): Миша
pollFirst: Зарядка
pollLast: Чохол
descendingSet: Флешка Ноутбук Навушники Монітор Миша Клавіатура Колонки


### HashMap

========== Завдання 6: HashMap ==========

Після put, size: 10
get(Ноутбук): 25000.0
containsKey(Миша): true
containsValue(p1): true
putIfAbsent: Ноутбук
keySet: Ноутбук Миша Клавіатура Монітор Навушники Колонки Флешка Зарядка Чохол Стіл
values: Ноутбук Миша Клавіатура Монітор Навушники Колонки Флешка Зарядка Чохол Стіл
Після putAll, size: 11
Після remove, size: 10

entrySet:
Ключ: Ноутбук, Значення: Миша
Ключ: Миша, Значення: Миша
...


### Методи Collections

========== Завдання 7: Методи Collections ==========

binarySearch(30): 2
reverse: [50, 40, 30, 20, 20, 10]
shuffle: [20, 50, 30, 10, 40, 20]
fill(100): [100, 100, 100, 100, 100, 100]
max: 9
min: 1
copy: [5, 2, 8, 1, 9, 3]
rotate(2): [9, 3, 5, 2, 8, 1]
frequency(2): 3


---

## 👤 Автор

**Андросович Максим**  
GitHub: [zipzk251amm-web](https://github.com/zipzk251amm-web)
