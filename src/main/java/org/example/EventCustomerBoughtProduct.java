package org.example;

import java.util.LinkedList;
import java.util.Random;

public class EventCustomerBoughtProduct extends Event {

    @Override
    public void runRandom(Shop shop) {
        LinkedList<Product> availableProducts = shop.display.getAllProducts();

        if (shop.display.haveAnyProducts()) {
            Random random_method = new Random();
            int index = random_method.nextInt(availableProducts.size());
            String productName = availableProducts.get(index).getTitle();
            int quantityToBuy = Generator.getRandomIntInRange(1, 3);

            shop.buyProduct(productName, quantityToBuy);
        }
    }
}
