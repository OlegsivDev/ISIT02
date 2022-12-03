package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    @Test
    void takeProductsByAmount() {
        Storage storage = new Storage();
        storage.addProduct(new Product("Milk Babaevskoe", "Voronezh Milk Zavod", new GregorianCalendar(2013, 0, 31), new GregorianCalendar(2014, 0, 31), 5, 150));
        storage.takeProductByName("Milk Babaevskoe", 3);
        Assertions.assertEquals(2, storage.getProductByName("Milk Babaevskoe").getQuantity());
    }

    @Test
    void testTakeAllProductByAmount() {
        Storage storage = new Storage();
        storage.addProduct(new Product("Milk Babaevskoe", "Voronezh Milk Zavod", new GregorianCalendar(2013, 0, 31), new GregorianCalendar(2014, 0, 31), 5, 150));
        storage.takeProductByName("Milk Babaevskoe", 5);
        Assertions.assertFalse(storage.haveAnyProducts());
    }
}