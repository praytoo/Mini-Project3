package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Musician extends Item {
    public Musician(String name, double price, List<Item> items, List<MusicItem> playShow) {
        super(name, price, items);
        this.playShow = playShow;
    }

    public void add(MusicItem item){
        playShow.add(item);
    }

    List<MusicItem> playShow = new ArrayList<>();

    public void playConcert(){
        //        MusicItem microphone = new MusicItem("microphone", 100, new ArrayList<>());
        //        playShow.add(microphone);
        //        microphone.use();
        //        MusicItem piano = new MusicItem("piano", 5000, new ArrayList<>());
        //        playShow.add(piano);
        //        piano.use();
        System.out.println("HELLO FROM THE OTHER SIDEEEEE");
    }

    public double totalValue(){
        double sum = 0;
        for (MusicItem item : playShow){
            sum += item.getPrice();
        }
    return sum;
    }

}