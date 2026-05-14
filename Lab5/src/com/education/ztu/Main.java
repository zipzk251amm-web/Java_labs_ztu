package com.education.ztu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Лабораторна робота №5 ==========\n");

        // Створення продуктів
        Product p1 = new Product(1, "Ноутбук", "Електроніка", 25000, 5);
        Product p2 = new Product(2, "Миша", "Електроніка", 500, 20);
        Product p3 = new Product(3, "Клавіатура", "Електроніка", 1200, 15);
        Product p4 = new Product(4, "Монітор", "Електроніка", 8000, 3);
        Product p5 = new Product(5, "Навушники", "Електроніка", 1500, 10);
        Product p6 = new Product(6, "Колонки", "Електроніка", 2000, 7);
        Product p7 = new Product(7, "Флешка", "Електроніка", 300, 50);
        Product p8 = new Product(8, "Зарядка", "Електроніка", 400, 25);
        Product p9 = new Product(9, "Чохол", "Аксесуари", 250, 30);
        Product p10 = new Product(10, "Стіл", "Меблі", 5000, 2);

        // ========== Завдання 3: ArrayList ==========
        System.out.println("========== Завдання 3: ArrayList ==========\n");

        List<Product> productList = new ArrayList<>();

        // add
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        System.out.println("Після add: " + productList.size());

        // addAll
        List<Product> additional = Arrays.asList(p4, p5, p6);
        productList.addAll(additional);
        System.out.println("Після addAll: " + productList.size());

        // get
        System.out.println("get(0): " + productList.get(0).getName());

        // indexOf, lastIndexOf
        productList.add(p2);
        System.out.println("indexOf(Миша): " + productList.indexOf(p2));
        System.out.println("lastIndexOf(Миша): " + productList.lastIndexOf(p2));

        // iterator
        System.out.print("iterator: ");
        Iterator<Product> it = productList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().getName() + " ");
        }
        System.out.println();

        // listIterator
        System.out.print("listIterator (з кінця): ");
        ListIterator<Product> lit = productList.listIterator(productList.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous().getName() + " ");
        }
        System.out.println();

        // remove
        productList.remove(p2);
        System.out.println("Після remove(Миша): " + productList.size());

        // set
        productList.set(0, new Product(1, "Ноутбук Pro", "Електроніка", 35000, 3));
        System.out.println("Після set: " + productList.get(0).getName());

        // sort
        productList.sort(Comparator.comparing(Product::getPrice));
        System.out.print("Сортування за ціною: ");
        for (Product p : productList) System.out.print(p.getName() + " ");
        System.out.println();

        // subList
        List<Product> subList = productList.subList(0, 3);
        System.out.println("subList (0-2): " + subList.size());

        // contains
        System.out.println("contains(Ноутбук): " + productList.contains(p1));

        // isEmpty
        System.out.println("isEmpty: " + productList.isEmpty());

        // retainAll
        List<Product> toRetain = Arrays.asList(p1, p3, p5);
        productList.retainAll(toRetain);
        System.out.println("Після retainAll: " + productList.size());

        // size
        System.out.println("size: " + productList.size());

        // toString
        System.out.println("toString: " + productList);

        // clear
        productList.clear();
        System.out.println("Після clear, size: " + productList.size());

        // Повертаємо дані для наступних завдань
        productList.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        // ========== Завдання 4: LinkedList (черга) ==========
        System.out.println("\n========== Завдання 4: LinkedList (черга) ==========\n");

        LinkedList<Product> queue = new LinkedList<>(productList);

        // push, offerLast, getFirst, peekLast, pop, removeLast, pollLast
        queue.push(new Product(11, "Новий продукт", "Інше", 999, 1));
        System.out.println("Після push: " + queue.getFirst().getName());

        queue.offerLast(new Product(12, "Останній", "Інше", 1, 1));
        System.out.println("Після offerLast: " + queue.peekLast().getName());

        System.out.println("getFirst: " + queue.getFirst().getName());
        System.out.println("peekLast: " + queue.peekLast().getName());

        Product popped = queue.pop();
        System.out.println("pop: " + popped.getName());

        Product removedLast = queue.removeLast();
        System.out.println("removeLast: " + removedLast.getName());

        Product polledLast = queue.pollLast();
        System.out.println("pollLast: " + (polledLast != null ? polledLast.getName() : "null"));

        // ========== Завдання 5: TreeSet (множина) ==========
        System.out.println("\n========== Завдання 5: TreeSet ==========\n");

        TreeSet<Product> treeSet = new TreeSet<>(productList);

        System.out.println("first: " + treeSet.first().getName());
        System.out.println("last: " + treeSet.last().getName());

        System.out.print("headSet (до Монітор): ");
        for (Product p : treeSet.headSet(p4)) System.out.print(p.getName() + " ");
        System.out.println();

        System.out.print("subSet (Миша до Навушники): ");
        for (Product p : treeSet.subSet(p2, p5)) System.out.print(p.getName() + " ");
        System.out.println();

        System.out.print("tailSet (від Навушники): ");
        for (Product p : treeSet.tailSet(p5)) System.out.print(p.getName() + " ");
        System.out.println();

        System.out.println("ceiling (нижче Монітор): " + treeSet.ceiling(p4).getName());
        System.out.println("floor (вище Монітор): " + treeSet.floor(p4).getName());
        System.out.println("higher (вище Монітор): " + treeSet.higher(p4).getName());
        System.out.println("lower (нижче Монітор): " + treeSet.lower(p4).getName());

        Product firstPolled = treeSet.pollFirst();
        System.out.println("pollFirst: " + firstPolled.getName());
        Product lastPolled = treeSet.pollLast();
        System.out.println("pollLast: " + lastPolled.getName());

        System.out.print("descendingSet: ");
        for (Product p : treeSet.descendingSet()) System.out.print(p.getName() + " ");
        System.out.println();

        // Повертаємо дані
        treeSet.addAll(productList);

        // ========== Завдання 6: HashMap ==========
        System.out.println("\n========== Завдання 6: HashMap ==========\n");

        Map<String, Product> productMap = new HashMap<>();

        // put
        for (Product p : productList) {
            productMap.put(p.getName(), p);
        }
        System.out.println("Після put, size: " + productMap.size());

        // get
        System.out.println("get(Ноутбук): " + productMap.get("Ноутбук").getPrice());

        // containsKey, containsValue
        System.out.println("containsKey(Миша): " + productMap.containsKey("Миша"));
        System.out.println("containsValue(p1): " + productMap.containsValue(p1));

        // putIfAbsent
        productMap.putIfAbsent("Новий", p1);
        System.out.println("putIfAbsent: " + productMap.get("Новий").getName());

        // keySet, values
        System.out.print("keySet: ");
        for (String key : productMap.keySet()) System.out.print(key + " ");
        System.out.println();

        System.out.print("values: ");
        for (Product p : productMap.values()) System.out.print(p.getName() + " ");
        System.out.println();

        // putAll
        Map<String, Product> newMap = new HashMap<>();
        newMap.put("Тест", p1);
        productMap.putAll(newMap);
        System.out.println("Після putAll, size: " + productMap.size());

        // remove
        productMap.remove("Тест");
        System.out.println("Після remove, size: " + productMap.size());

        // entrySet
        System.out.println("\nentrySet:");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println("  Ключ: " + entry.getKey() + ", Значення: " + entry.getValue().getName());
            entry.setValue(p2);
        }

        // ========== Завдання 7: Методи Collections ==========
        System.out.println("\n========== Завдання 7: Методи Collections ==========\n");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20, 30));

        // binarySearch
        Collections.sort(numbers);
        System.out.println("binarySearch(30): " + Collections.binarySearch(numbers, 30));

        // reverse
        Collections.reverse(numbers);
        System.out.println("reverse: " + numbers);

        // shuffle
        Collections.shuffle(numbers);
        System.out.println("shuffle: " + numbers);

        // fill
        Collections.fill(numbers, 100);
        System.out.println("fill(100): " + numbers);

        // max, min
        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9, 3);
        System.out.println("max: " + Collections.max(nums));
        System.out.println("min: " + Collections.min(nums));

        // copy
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0));
        Collections.copy(dest, nums);
        System.out.println("copy: " + dest);

        // rotate
        Collections.rotate(dest, 2);
        System.out.println("rotate(2): " + dest);

        // frequency
        List<Integer> freqList = Arrays.asList(1, 2, 3, 2, 4, 2, 5);
        System.out.println("frequency(2): " + Collections.frequency(freqList, 2));
    }
}