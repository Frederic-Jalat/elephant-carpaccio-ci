package fr.iut;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Item, Integer> products = new HashMap<Item, Integer>();

    public void addProduct(final Item item, final int quantity) {
        products.put(item, quantity);
    }

    public int countProducts() {
        return products.keySet().size();
    }

    public double computePrice() {
        double totalPrice = 0.0d;

        for (Item i : products.keySet()) {
            totalPrice += (i.getPrice() * products.get(i));
        }
        
        if (totalPrice >= 1000 && totalPrice < 5000) {
        		totalPrice = totalPrice * 0.97d;
        } else if (totalPrice >= 5000 && totalPrice < 7000) {
    		totalPrice = totalPrice * 0.95d;
        } else if (totalPrice >= 7000 && totalPrice < 10000) {
		totalPrice = totalPrice * 0.93d;
        }else if (totalPrice >= 10000 && totalPrice < 50000) {
    		totalPrice = totalPrice * 0.90d;
        } else if (totalPrice >= 50000) {
		totalPrice = totalPrice * 0.85d;
        }

        return totalPrice;
    }
}
