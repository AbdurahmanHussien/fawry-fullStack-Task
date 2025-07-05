package model;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int amount) {
        quantity -= amount;
    }
}
