package com.pluralsight;

import java.util.ArrayList;

public class Wand extends Item{
    public Wand(String name, double price) {
        super(name, price, new ArrayList<>());
    }

    @Override
    public void use(){
        System.out.println("✨ Swish! The wand sparks with magical energy!");
    }
}
