package org.example;

import java.util.LinkedList;

public class Storage {
    private LinkedList<Product> storageProducts = new LinkedList<>();

    public void addProduct(Product product) {
        storageProducts.add(product);
    }

    public void printAllProducts() {
        System.out.println("Printing all products in storage:");
        for (int i = 0; i < storageProducts.size(); i++) {
            printProduct(storageProducts.get(i));
        }
    }

    private void printProduct(Product product) {
        System.out.println(product.getTitle() + " - " + product.getManufacturer() + ": " + product.getQuantity());
    }

    protected Product getProductById(int id) {
        return storageProducts.get(id);
    }

    protected Product getProductByName(String keyword) {
        return getProductById(getProductIdByName(keyword));
    }

    protected Integer getProductIdByName(String keyword) {
        for (int i = 0; i < storageProducts.size(); i++) {
            if (storageProducts.get(i).getTitle() == keyword) {
                return i;
            }
        }
        return null;
    }

    protected Product takeProductByName(String keyword, int amount) {
        Integer productId = getProductIdByName(keyword);
        if (productId == null) {
            return null;
        }
        Product toReturn = storageProducts.get(productId);
        int newQuantity = toReturn.getQuantity() - amount;
        if (newQuantity > 0) {
            toReturn.setQuantity(amount);
            storageProducts.get(productId).setQuantity(newQuantity);
        } else {
            storageProducts.remove(storageProducts.get(productId));
        }
        return toReturn;
    }

    protected Product takeProductByName(String keyword) {
        Integer productId = getProductIdByName(keyword);
        if (productId == null) {
            return null;
        }
        Product toReturn = storageProducts.get(productId);
        storageProducts.remove(storageProducts.get(productId));
        return toReturn;
    }

    protected boolean haveAnyProducts() {
        return !this.storageProducts.isEmpty();
    }
}
