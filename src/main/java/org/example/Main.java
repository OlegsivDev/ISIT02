package org.example;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Storage storage = new Storage();
        Shop shop = new Shop();

        storage.addProduct(new Product("Milk Babaevskoe", "Voronezh Milk Zavod", new GregorianCalendar(2013, 0, 31), new GregorianCalendar(2013, 0, 31), 5, 150));
        storage.takeProductByName("Milk Babaevskoe", 3);
        storage.printAllProducts();
    }
}