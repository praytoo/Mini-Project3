package com.pluralsight;

import java.util.ArrayList;

public class Piano extends Item{
    public Piano(String name, double price) {
        super(name, price, new ArrayList<>());
    }

    @Override
    public void use(){
        System.out.println("Playing the tunes of my soul");
    }
}
