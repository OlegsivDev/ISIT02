package org.example;

public class Employee {
    private String Name;
    private String Surname;

    public Employee(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }
}
