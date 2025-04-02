package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = (item instanceof Discountable) ? ((Discountable) item).getDiscount() : 0;
            total += item.getTotalPrice() * (1 - discount / 100);
        }
        return total;
    }

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}
