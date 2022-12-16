package org.example;

import java.util.Calendar;
import java.util.Date;

public class Product {
    private String title;
    private String manufacturer;
    private Date dateOfManufacture;
    private Date dateOfExpiration;
    private Integer quantity;

    private Integer price;

    public Product(String title, String manufacturer, Date dateOfManufacture, Date dateOfExpiration, Integer quantity, Integer price) {
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
