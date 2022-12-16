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

    private Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Product(String title, String manufacturer, Date dateOfManufacture, Date dateOfExpiration, Integer quantity, Integer price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpiration = dateOfExpiration;
        this.quantity = quantity;
        this.price = price;
        this.discount = null;
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

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}
