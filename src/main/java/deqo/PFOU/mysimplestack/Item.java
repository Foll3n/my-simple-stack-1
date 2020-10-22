package deqo.PFOU.mysimplestack;

public class Item {

    private int amount;
    private String value;

    /**
     * Intervention
     */

    public Item(int amount, String value) {
        this.amount = amount;
        this.value = value;
    }

    public int getAmount() {
        return amount;
    }

    public String getValue() {
        return value;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
