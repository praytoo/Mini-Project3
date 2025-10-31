package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Magician extends Item {
    public Magician(String name, double price, List<MagicItem> magicShow) {
        super(name, price, new ArrayList<>());
        this.magicShow = magicShow;
    }
    public void add(MagicItem item){
        magicShow.add(item);
    }

    List<MagicItem> magicShow = new ArrayList<>();


    public void performShow(){
        MagicItem wand = new MagicItem("wand", 250, 2);
        magicShow.add(wand);
        wand.use();
        MagicItem potion = new MagicItem("potion", 2500,4);
        magicShow.add(potion);
        potion.use();
        System.out.println("Abracadabra");
    }

}
