package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class EventAddToStorage extends Event {

    @Override
    public void runRandom(Shop shop) {
        Random random = new Random();
        String ProductName = Generator.generateProductName();
        String ProductManufacturer = Generator.generateManufacturerName();
        Date manufacturingDate = Generator.getCurrentDate();
        Date expirationDate = Generator.getRandomDate();
        int quantity = Generator.getRandomIntInRange(1, 50);
        shop.storage.addProduct(new Product(ProductName, ProductManufacturer, manufacturingDate, expirationDate, quantity, null));
        System.out.println("EventAddToStorage: New product added - " + ProductName + " - " + ProductManufacturer + " - " + quantity);
    }
}
