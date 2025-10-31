package com.pluralsight;

import java.util.ArrayList;

public class Potion extends Item{
    public Potion(String name, double price) {
        super(name, price, new ArrayList<>());
    }

    @Override
    public void use(){
        System.out.println("💫 You drink the potion. You feel invisible!");
    }
}
