package org.example.models;

import java.util.Arrays;

public class Hamburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(){

    }
    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }
    public double itemizeHamburger(){
        System.out.println(this + ("Price:" + getPrice()));
        return getPrice();
    }
    public double totalPrice(){
        return getAddition1Price() + getAddition2Price() + getAddition3Price() + getAddition4Price();
    }
    public String getName(){
        return name;
    }
    public String getMeat(){
        return meat;
    }
    public double getPrice(){
        return price + totalPrice();
    }
    public String getBreadRollType(){
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    @Override
    public String toString() {
        return
                "Name:" + name + '\n' +
                "Meat:" + meat + '\n' +
                "BreadRollType:" + breadRollType + '\n' +
                        (getAddition1Name()==null?"":"Addition1:" + addition1Name + '\n') +
                        (getAddition2Name()==null?"":"Addition2:" + addition2Name + '\n') +
                        (getAddition3Name()==null?"":"Addition3:" + addition3Name + '\n') +
                        (getAddition4Name()==null?"":"Addition4:" + addition4Name);
    }
}
