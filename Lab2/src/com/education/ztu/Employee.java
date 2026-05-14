package com.education.ztu;

public class Employee extends Person {
    private String company;
    private String position;
    private Car car;
    private static int counter = 0;

    {
        this.company = "Unknown Company";
        this.position = "Unknown";
        this.car = new Car("Unknown Car");
    }

    public Employee() {
        super();
        counter++;
    }

    public Employee(String firstName, String lastName, int age, Gender gender, Location location,
                    String company, String position, Car car) {
        super(firstName, lastName, age, gender, location);
        this.company = company;
        this.position = position;
        this.car = car;
        counter++;
    }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }

    public static int showCounter() { return counter; }

    @Override
    public String getOccupation() {
        return position + " at " + company;
    }

    @Override
    public void whoIAm() {
        System.out.println("I am an employee");
    }
}