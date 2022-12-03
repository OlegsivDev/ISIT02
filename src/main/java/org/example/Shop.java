package org.example;

import java.util.LinkedList;

public class Shop extends Storage{
    private LinkedList<Employee> employees = new LinkedList<>();
    private LinkedList<Product> displayedProducts = new LinkedList<>();

    public void addEmployee(Employee employee) {

        if (!employees.isEmpty()) {
            for (int i = 0; i < employees.size(); i++) {
                if ((employee.getName() == employees.get(i).getName()) && (employee.getSurname() == employees.get(i).getSurname())) {
                    throw new IllegalArgumentException("It is impossible to add an employee, such an employee already exists.");
                }
            }
        }
        employees.add(employee);
    }

    public void moveProductByName() {

    }
}
