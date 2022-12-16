package org.example;

import java.util.LinkedList;
import java.util.Random;

public class EventMoveToDisplay extends Event {
    @Override
    public void runRandom(Shop shop) {
        LinkedList<Product> availableProducts = shop.storage.getAllProducts();

        if (shop.storage.haveAnyProducts()) {
            Random random_method = new Random();
            int index = random_method.nextInt(availableProducts.size());
            String productName = availableProducts.get(index).getTitle();
            int quantityToMove = Generator.getRandomIntInRange(1, 70);
            int price = Generator.getRandomIntInRange(50, 500);

            shop.moveProductByName(productName, quantityToMove, price);
        }
    }
}
