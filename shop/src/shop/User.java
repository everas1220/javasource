package shop;

public class User {
    private String name;
    private PayType paytype;

    public User(String name, PayType payType) {
        this.name = name;
        this.paytype = payType;
    }

    public String getName() {
        return name;
    }

    public PayType getPayType() {
        return paytype;
    }
}