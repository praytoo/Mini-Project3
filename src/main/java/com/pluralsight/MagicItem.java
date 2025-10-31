package com.pluralsight;

import java.util.ArrayList;

public class MagicItem extends Item{
    public MagicItem(String name, double price, int rarityLevel) {
        super(name, price, new ArrayList<>());
    }
}
