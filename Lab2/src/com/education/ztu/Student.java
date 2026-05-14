package com.education.ztu;

public class Student extends Person {
    private String university;
    private String speciality;
    private int course;
    private static int counter = 0;

    {
        this.university = "Unknown University";
        this.speciality = "Unknown";
        this.course = 1;
    }

    public Student() {
        super();
        counter++;
    }

    public Student(String firstName, String lastName, int age, Gender gender, Location location,
                   String university, String speciality, int course) {
        super(firstName, lastName, age, gender, location);
        this.university = university;
        this.speciality = speciality;
        this.course = course;
        counter++;
    }

    // Геттери та сеттери
    public String getUniversity() { return university; }
    public void setUniversity(String university) { this.university = university; }
    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public static int showCounter() { return counter; }

    @Override
    public String getOccupation() {
        return "Student of " + university + ", " + speciality + ", course " + course;
    }

    @Override
    public void whoIAm() {
        System.out.println("I am a student");
    }
}