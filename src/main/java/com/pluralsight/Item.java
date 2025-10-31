package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private static double price;
    List<Item> items = new ArrayList<>();


    public static double getPrice() {
        return price;
    }

    public Item(String name, double price, List<Item> items) {
        this.name = name;
        this.price = price;
        this.items = new ArrayList<>();
    }

    public void use(){

    }
}
