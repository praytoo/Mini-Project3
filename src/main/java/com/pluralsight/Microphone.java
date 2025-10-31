package com.pluralsight;

import java.util.List;

public class Microphone extends Item{
    public Microphone(String name, double price, List<Item> items) {
        super(name, price, items);
    }

    @Override
    public void use(){
        System.out.println("Singing my heart out");
    }
}
