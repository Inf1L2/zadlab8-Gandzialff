package Zad123;

public class Dzem extends Product {
    public Dzem(String name, double price, String describe) {
        super(price,name,describe);
    }

    public void buy() {
        System.out.println(
                "I bought a dżem!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                        + " name:" + getName()
                        + " describe:" + getDescribe()
        );
    }
}
