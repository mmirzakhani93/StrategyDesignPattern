package ir.whatsoft.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {

        items.add(item);
    }

    public int calculationTotalPrice() {

        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentMethod paymentMethod) {

        System.out.println(paymentMethod.toString());
        paymentMethod.pay(calculationTotalPrice());
    }

}
