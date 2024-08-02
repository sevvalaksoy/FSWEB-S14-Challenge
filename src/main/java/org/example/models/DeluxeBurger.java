package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger(){
        super("Deluxe Burger","Double",19.10,"Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }
    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }
    public String getCips(){
        return cips;
    }
    public String getDrink(){
        return drink;
    }
    @Override
    public double getPrice() {
        return 19.1;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
}
