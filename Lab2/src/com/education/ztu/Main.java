package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Демонстрація роботи класів ==========\n");

        // Створення об'єктів
        Car toyota = new Car("Toyota");
        Car bmw = new Car("BMW");

        Student student = new Student("Ivan", "Petrenko", 20, Gender.MALE, Location.KYIV,
                "KPI", "Computer Science", 2);

        Teacher teacher = new Teacher("Maria", "Shevchenko", 35, Gender.FEMALE, Location.LVIV,
                "LNU", "Mathematics", toyota);

        Employee employee = new Employee("Oleksandr", "Koval", 28, Gender.MALE, Location.ODESA,
                "SoftServe", "Java Developer", bmw);

        // Демонстрація методів
        student.sayFullName();
        student.sayAge();
        student.sayGender();
        student.sayLocation();
        System.out.println("Occupation: " + student.getOccupation());
        student.whoIAm();
        System.out.println();

        teacher.sayFullName();
        teacher.sayAge();
        teacher.sayGender();
        teacher.sayLocation();
        System.out.println("Occupation: " + teacher.getOccupation());
        teacher.whoIAm();
        teacher.getCar().startCar();
        System.out.println();

        employee.sayFullName();
        employee.sayAge();
        employee.sayGender();
        employee.sayLocation();
        System.out.println("Occupation: " + employee.getOccupation());
        employee.whoIAm();
        employee.getCar().stopCar();
        System.out.println();

        // Демонстрація static counter
        System.out.println("========== Static counters ==========");
        System.out.println("Total Persons created: " + Person.showCounter());
        System.out.println("Students created: " + Student.showCounter());
        System.out.println("Teachers created: " + Teacher.showCounter());
        System.out.println("Employees created: " + Employee.showCounter());

        // Демонстрація instanceof
        System.out.println("\n========== Instanceof ==========");
        System.out.println("student instanceof Person: " + (student instanceof Person));
        System.out.println("student instanceof Human: " + (student instanceof Human));
        System.out.println("teacher instanceof Person: " + (teacher instanceof Person));
        System.out.println("employee instanceof Person: " + (employee instanceof Person));
        System.out.println("toyota instanceof Car: " + (toyota instanceof Car));
    }
}