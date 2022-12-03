package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test(/* Exception expected */)
    void addSameEmployee() {
        Shop shop = new Shop();
        shop.addEmployee(new Employee("marina", "yakovleva"));
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            shop.addEmployee(new Employee("marina", "yakovleva"));
        });
    }

    @Test
    void addEmployeeWithoutException() {
        Shop shop = new Shop();
        shop.addEmployee(new Employee("marina", "yakovleva"));
        assertAll(() -> {
            shop.addEmployee(new Employee("Pavel", "Tosterov"));
        });
    }
}