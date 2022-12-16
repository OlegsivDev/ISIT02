package org.example;

import java.util.LinkedList;

public class Shop extends Storage {
    private LinkedList<Employee> employees = new LinkedList<>();
    public LinkedList<Product> displayedProducts = new LinkedList<>();
    public Storage storage;

    public Shop(LinkedList<Employee> employees, LinkedList<Product> displayedProducts, Storage storage) {
        this.employees = employees;
        this.displayedProducts = displayedProducts;
        this.storage = storage;
    }

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

    // TODO: Complete moveProductFunction
    public void moveProductByName() {

    }
}
