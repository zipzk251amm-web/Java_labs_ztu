package com.education.ztu;

public abstract class Person implements Human {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private Location location;

    private static int counter = 0;

    // Блок ініціалізації (значення за замовчуванням)
    {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.gender = Gender.MALE;
        this.location = Location.KYIV;
    }

    // Конструктор без аргументів
    public Person() {
        counter++;
    }

    // Конструктор з аргументами
    public Person(String firstName, String lastName, int age, Gender gender, Location location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.location = location;
        counter++;
    }

    // Геттери та сеттери
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }
    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    // Статичний метод для підрахунку
    public static int showCounter() { return counter; }

    // Звичайний метод
    public String getFullInfo() {
        return firstName + " " + lastName + ", " + age + " years, " + gender + ", " + location;
    }

    // Абстрактний метод
    public abstract String getOccupation();

    // Реалізація методів інтерфейсу Human
    @Override
    public void sayFullName() {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    @Override
    public void sayAge() {
        System.out.println("Age: " + age);
    }

    @Override
    public void sayLocation() {
        System.out.println("Location: " + location);
    }

    @Override
    public void sayGender() {
        System.out.println("Gender: " + gender);
    }
}