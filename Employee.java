package com.chime.lib;

public class Employee extends Person {
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName, int age, int id) {
        super(firstName, lastName, age);
        this.id = id;
    }
}
