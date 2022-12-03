package org.example;

import java.util.Calendar;

public class Product {
    private String title;
    private String manufacturer;
    private Calendar dateOfManufacture;
    private Calendar dateOfExpiration;
    private Integer quantity;

    private Integer price;

    public Product(String title, String manufacturer, Calendar dateOfManufacture, Calendar dateOfExpiration, Integer quantity, Integer price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpiration = dateOfExpiration;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getTitle() {
        return title;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
