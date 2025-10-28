package com.pluralsight;

public class Piano extends Item{
    public Piano(String name, double price) {
        super(name, price);
    }

    @Override
    public void use(){
        System.out.println("Playing the tunes of my soul");
    }
}
