package model;

import behaviors.Expirable;
import behaviors.Shippable;

import java.time.LocalDate;

public class Cheese extends Product implements Shippable, Expirable {
    private double weight;
    private LocalDate expiryDate;

    public Cheese(String name, double price, int quantity, double weight, LocalDate expiryDate) {
        super(name, price, quantity);

        if (weight <= 0 ) {
            throw new IllegalArgumentException("Weight must be greater than 0");
        }

        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    public double getWeight() {
        return weight;
    }


    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
