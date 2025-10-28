package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

  public static void main(String[] args) {
        MagicItem wand = new MagicItem("wand", 250, 2);
        Magician waldo = new Magician("waldo", 50, new ArrayList<>());
        waldo.add(wand);
        waldo.performShow();
        MusicItem piano = new MusicItem("piano", 5000, false);
        Musician berry = new Musician("berry", 150, new ArrayList<>());
        berry.add(piano);
        berry.playConcert();

        List<Item> items = new ArrayList<>();
        items.add(wand);
        items.add(piano);
        for (Item item : items){
            wand.use();
            piano.use();
        }
    }
}
