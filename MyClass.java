package com.chime.lib;

public class MyClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Nnadi", "Chime", 24, 120);
        employee.setId(130);
        employee.setFirstName("Charles");
        employee.setAge(20);
        employee.setLastName("Ada");

        System.out.println(employee.personBehaviour());

        Manager manager = new Manager("Olisa", "Emeka", 67, 234, 1);

        System.out.println(manager.getManagerAdmin());

        Cat cat = new Cat();
        cat.setName("Tiger");
        cat.setColor("Black");
        cat.animalType = "Gorilla";

        System.out.println("This animal " + cat.getName() + " has a color " + cat.getColor() + " and the animal type is " + cat.animalType);
    }
}