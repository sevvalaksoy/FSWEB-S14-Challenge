package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }
    public String getHealthyExtra1Name(){
        return healthyExtra1Name;
    }
    public String getHealthyExtra2Name(){
        return healthyExtra2Name;
    }
    public double getHealthyExtra1Price(){
        return healthyExtra1Price;
    }
    public double getHealthyExtra2Price(){
        return healthyExtra2Price;
    }
    @Override
    public double getPrice(){
        return super.getPrice() + getHealthyExtra1Price() + getHealthyExtra2Price();
    }
    @Override
    public double itemizeHamburger() {
        System.out.println(this + (getHealthyExtra1Name()==null?"":"HealthyAddition1:" + getHealthyExtra1Name())
        + (getHealthyExtra2Name()==null?"":"HealthyAddition2:" + getHealthyExtra2Name())+ '\n' + "Price:" + getPrice());
        return getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
