package service;

import behaviors.Expirable;
import behaviors.Shippable;
import model.Cart;
import model.CartItem;
import model.Customer;
import model.Product;

import java.util.List;

public class CheckoutService {

    public void checkout(Customer customer , Cart cart) {

        if (cart.isEmpty()) {
            throw new RuntimeException("Cart is empty");
        }

        double subtotal = 0.0;
        for (CartItem item : cart.getItems()) {
            Product p = item.getProduct();

            if (p instanceof Expirable expirable && expirable.isExpired()) {
                throw new RuntimeException(p.getName() + " is expired");
            }

            if (item.getQuantity() > p.getQuantity()) {
                throw new RuntimeException(p.getName() + " is out of stock");
            }

            subtotal += item.getTotalPrice();
        }

        List<Shippable> shippables = cart.getShippableItems();
        double shipping =(int) shippables.stream().mapToDouble(Shippable::getWeight).sum() * 5;

        double total = subtotal + shipping;

        if (total > customer.getBalance()) {
            throw new RuntimeException("low balance");
        }

        customer.deductBalance(total);

        // Reduce product quantity
        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }

        // Shipping
        new ShippingService().ship(shippables);

        // Receipt
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName() + "      " + (int)item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal         " +(int) subtotal);
        System.out.println("Shipping         " + (int) shipping);
        System.out.println("Amount           " + (int) total);
        System.out.println("Remaining Balance      " + (int) customer.getBalance());
    }
}
