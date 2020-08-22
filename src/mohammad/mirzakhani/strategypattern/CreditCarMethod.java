package mohammad.mirzakhani.strategypattern;

public class CreditCarMethod implements PaymentMethod{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCarMethod(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using CreditCard.");
    }

    @Override
    public String toString() {
        return String.format("CreditCardMethod name: " + name);
    }
}
