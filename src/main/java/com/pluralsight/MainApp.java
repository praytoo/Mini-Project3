package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        MusicItem piano = new MusicItem("piano", 5000, new ArrayList<>());
        MusicItem microphone = new MusicItem("microphone", 1000, new ArrayList<>());
        Musician berry = new Musician("berry", 150, new ArrayList<>(), new ArrayList<>());
        berry.add(piano);
        berry.add(microphone);
        berry.playConcert();
        System.out.println(berry.totalValue()); // need to adjust totalValue();

        MagicItem wand = new MagicItem("wand", 250, 2);
        Magician waldo = new Magician("waldo", 50, new ArrayList<>());
        waldo.add(wand);
        waldo.performShow();

        List<Item> items = new ArrayList<>();
        items.add(wand);
        items.add(piano);
        items.add(microphone);
        for (Item item : items) {
            item.use();

        }
    }
}
