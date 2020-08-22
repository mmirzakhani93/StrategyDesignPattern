package mohammad.mirzakhani.strategypattern;

public class Item {

    private String serialId;
    private int price;

    public Item(String serialId, int price) {
        this.serialId = serialId;
        this.price = price;
    }

    public String getSerialId() {
        return serialId;
    }

    public int getPrice() {
        return price;
    }
}
