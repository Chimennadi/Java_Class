package com.chime.lib;

public class Manager extends Employee{
    private int admin;

    public Manager(String firstName, String lastName, int age, int id, int admin) {
        super(firstName, lastName, age, id);
        this.admin = admin;
    }

    public String getManagerAdmin() {
       return "The manager admin panel is: " + this.admin;
    }
}
