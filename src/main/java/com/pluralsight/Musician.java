package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Musician extends Item {
    public Musician(String name, double price, List<MusicItem> playShow) {
        super(name, price);
        this.playShow = playShow;
    }

    public void add(MusicItem item){
        playShow.add(item);
    }

    List<MusicItem> playShow = new ArrayList<>();

    public void playConcert(){
        MusicItem microphone = new MusicItem("microphone", 100, false);
        playShow.add(microphone);
        microphone.use();
        MusicItem piano = new MusicItem("piano", 5000, false);
        playShow.add(piano);
        piano.use();
        System.out.println("HELLO FROM THE OTHER SIDEEEEE");
    }
}