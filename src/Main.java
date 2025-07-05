import model.*;
import service.CheckoutService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cheese cheese = new Cheese("Cheese", 100, 5, 0.2, LocalDate.now().plusDays(2));
        Biscuits biscuits = new Biscuits("Biscuits", 150 ,3, 0.7, LocalDate.now().plusDays(1));

        TV tv = new TV("TV", 1000, 5, 7);

        MobileCard card = new MobileCard("Scratch Card", 50, 5);

        Customer customer = new Customer("Ahmed", 15000);

        customer.getCart().addItem(cheese, 1);
        customer.getCart().addItem(biscuits, 1);
        customer.getCart().addItem(tv, 3);
        customer.getCart().addItem(card,2);




        CheckoutService checkout = new CheckoutService();
        checkout.checkout(customer, customer.getCart());

    }
}