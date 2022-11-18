package org.example;

import java.util.Calendar;

public class product {
    private String title;
    private String manufacturer;
    private Calendar dateOfManufacture;
    private Calendar dateOfExpiration;
    private Integer quantity;

    public product(String title, String manufacturer, Calendar dateOfManufacture, Calendar dateOfExpiration, Integer quantity) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpiration = dateOfExpiration;
        this.quantity = quantity;
    }
}
