package mohammad.mirzakhani.strategypattern;

import java.util.UUID;

public class StrategyMethodTest {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item(UUID.randomUUID().toString(), 10);
        Item item2 = new Item(UUID.randomUUID().toString(), 40);
        Item item3 = new Item(UUID.randomUUID().toString(), 20);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);

//        shoppingCart.pay(new CreditCarMethod("Mohammad Mirzakhani",
//                "1234567890", "123", "12/20"));

        shoppingCart.pay(new PayPalMethod("whatsoft@example.com", "1234"));
    }
}
