package com.pluralsight;

public class Potion extends Item{
    public Potion(String name, double price) {
        super(name, price);
    }

    @Override
    public void use(){
        System.out.println("💫 You drink the potion. You feel invisible!");
    }
}
