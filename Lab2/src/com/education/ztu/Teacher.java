package com.education.ztu;

public class Teacher extends Person {
    private String university;
    private String subject;
    private Car car;
    private static int counter = 0;

    {
        this.university = "Unknown University";
        this.subject = "Unknown";
        this.car = new Car("Unknown Car");
    }

    public Teacher() {
        super();
        counter++;
    }

    public Teacher(String firstName, String lastName, int age, Gender gender, Location location,
                   String university, String subject, Car car) {
        super(firstName, lastName, age, gender, location);
        this.university = university;
        this.subject = subject;
        this.car = car;
        counter++;
    }

    public String getUniversity() { return university; }
    public void setUniversity(String university) { this.university = university; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }

    public static int showCounter() { return counter; }

    @Override
    public String getOccupation() {
        return "Teacher at " + university + ", subject: " + subject;
    }

    @Override
    public void whoIAm() {
        System.out.println("I am a teacher");
    }
}