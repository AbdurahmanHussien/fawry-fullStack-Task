package service;

import behaviors.Shippable;

import java.util.ArrayList;
import java.util.List;

public class ShippingService {
    public void ship(List<Shippable> items) {

        if (items.isEmpty()) return;

        System.out.println("** Shipment notice **");

        List<String> names = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        List<Double> weights = new ArrayList<>();

        double totalWeight = 0;

        for (Shippable item : items) {
            String name = item.getName();
            double weight = item.getWeight();

            int index = names.indexOf(name);
            if (index == -1) {
                names.add(name);
                counts.add(1);
                weights.add(weight);
            } else {
                counts.set(index, counts.get(index) + 1);
                weights.set(index, weights.get(index) + weight);
            }

            totalWeight += weight;
        }

        for (int i = 0; i < names.size(); i++) {
            int weightGrams = (int) (weights.get(i) * 1000);
            System.out.printf("%dx %-12s %dg%n", counts.get(i), names.get(i), weightGrams);
        }

        System.out.println("Total package weight " + totalWeight + "kg");
    }
}

