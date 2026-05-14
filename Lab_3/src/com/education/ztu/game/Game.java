package com.education.ztu.game;

public class Game {
    public static void main(String[] args) {
        // Команда школярів
        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(new Schoolar("Ivan", 13));
        schoolarTeam.addNewParticipant(new Schoolar("Mariya", 15));

        // Команда студентів
        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(new Student("Mykola", 20));
        studentTeam.addNewParticipant(new Student("Viktoria", 21));

        // Команда працівників
        Team<Employee> employeeTeam = new Team<>("Robotyagi");
        employeeTeam.addNewParticipant(new Employee("Andriy", 28));
        employeeTeam.addNewParticipant(new Employee("Oksana", 25));

        // Команда школярів 2
        Team<Schoolar> schoolarTeam2 = new Team<>("Rozumnyky");
        schoolarTeam2.addNewParticipant(new Schoolar("Sergey", 12));
        schoolarTeam2.addNewParticipant(new Schoolar("Olga", 14));

        // Гра можлива тільки між командами одного типу
        schoolarTeam.playWith(schoolarTeam2);  // OK
        // schoolarTeam.playWith(employeeTeam); // Помилка компіляції!
    }
}