package org.example;

import java.util.LinkedList;

public class Shop extends Storage {
    private LinkedList<Employee> employees = new LinkedList<>();
    public LinkedList<Product> displayedProducts = new LinkedList<>();
    public Storage storage;
    public Storage display;

    public int getIncome() {
        return income;
    }

    private int income;

    public Shop(LinkedList<Employee> employees, LinkedList<Product> displayedProducts, Storage storage) {
        this.employees = employees;
        this.displayedProducts = displayedProducts;
        this.storage = storage;
        this.display = new Storage();
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

    public void moveProductByName(String name, int quantity, Integer price) {
        Product toTake = storage.takeProductByName(name, quantity);
        toTake.setPrice(price);
        display.addProduct(toTake);
        System.out.println("Product moved to display: " + name);
    }

    public void buyProduct(String name, int quantity) {
        Product toBuy = display.takeProductByName(name, quantity);
        int price;
        if (toBuy.getDiscount() == null) {
            price = toBuy.getPrice() * quantity;
            System.out.println("Customer bought product: " + name + " Price: " + price);
        } else {
            price = Math.round((toBuy.getPrice() * quantity) * ((100f - toBuy.getDiscount()) / 100));
            System.out.println("Customer bought product WITH DISCOUNT!: " + name + " Price: " + price + " discount: " + toBuy.getDiscount() + "%");
        }
        this.income = this.income + price;
    }

    public void addDiscount(String name, int discount) {
        this.display.getProductByName(name).setDiscount(discount);
    }

    public void printAllProductsInDisplay() {
        System.out.println("Printing all products in display:");
        this.display.printAllProducts();
    }

    public void printAllProductsInStorage() {
        System.out.println("Printing all products in storage:");
        this.storage.printAllProducts();
    }
}
