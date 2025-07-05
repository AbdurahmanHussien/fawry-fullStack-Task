package model;

public class Customer {
    private String name;
    private double balance;
    private Cart cart;

    public Customer(String name, double balance) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be empty");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("balance can't be negative");
        }

        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public Cart getCart() {
        return cart;
    }
}
