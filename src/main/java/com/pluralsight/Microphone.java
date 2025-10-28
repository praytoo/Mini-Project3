package com.pluralsight;

public class Microphone extends Item{
    public Microphone(String name, double price) {
        super(name, price);
    }

    @Override
    public void use(){
        System.out.println("Singing my heart out");
    }
}
