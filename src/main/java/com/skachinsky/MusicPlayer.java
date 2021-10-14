package com.skachinsky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> genreList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public void playMusic() {
        Random rnd = new Random();

        System.out.println(genreList.get(rnd.nextInt(genreList.size())).getSong());
    }
}
