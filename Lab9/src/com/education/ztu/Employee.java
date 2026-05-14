package com.education.ztu;

@MyAnnotation(name = "EmployeeClass", value = 1, description = "Class for employee data")
public class Employee {
    public String fullName;
    private int age;
    protected String position;
    private int experience;
    public String email;
    private String phone;

    // Конструктори
    public Employee() {
        this.fullName = "Unknown";
        this.age = 0;
        this.position = "Unknown";
        this.experience = 0;
        this.email = "unknown@example.com";
        this.phone = "+0000000000";
    }

    public Employee(String fullName, int age, String position, int experience, String email, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.experience = experience;
        this.email = email;
        this.phone = phone;
    }

    // Геттери та сеттери
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    // Методи
    public void displayInfo() {
        System.out.println("Employee: " + fullName + ", Age: " + age + ", Position: " + position);
    }

    private void changePosition(String newPosition) {
        this.position = newPosition;
        System.out.println("Position changed to: " + newPosition);
    }

    @MyAnnotation(name = "workMethod", value = 2, description = "Method for work")
    public void work() {
        System.out.println(fullName + " is working...");
    }

    @Override
    public String toString() {
        return String.format("Employee{fullName='%s', age=%d, position='%s', experience=%d, email='%s', phone='%s'}",
                fullName, age, position, experience, email, phone);
    }
}