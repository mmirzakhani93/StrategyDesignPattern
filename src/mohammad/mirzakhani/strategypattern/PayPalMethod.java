package mohammad.mirzakhani.strategypattern;

public class PayPalMethod implements PaymentMethod{

    private String emailId;
    private String password;

    public PayPalMethod(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }

    @Override
    public String toString() {
        return String.format("PayPalMethod emailId: " + emailId);
    }
}
