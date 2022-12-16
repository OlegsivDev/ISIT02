package org.example;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test(/* Exception expected */)
    void addSameEmployee() {
        Shop shop = new Shop(new LinkedList<Employee>(), new LinkedList<Product>(), new Storage());
        shop.addEmployee(new Employee("marina", "yakovleva"));
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            shop.addEmployee(new Employee("marina", "yakovleva"));
        });
    }

    @Test
    void addEmployeeWithoutException() {
        Shop shop = new Shop(new LinkedList<Employee>(), new LinkedList<Product>(), new Storage());
        shop.addEmployee(new Employee("marina", "yakovleva"));
        assertAll(() -> {
            shop.addEmployee(new Employee("Pavel", "Tosterov"));
        });
    }
}