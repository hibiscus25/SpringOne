package com.lesson4567;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {
//    private Music music;
//
//    @Autowired
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
//
//    public void playMusic(){
//        System.out.println("Playing: " + music.getSong());
//    }

    //-------------------------------------------- lesson6 --------------------------------------------------------
//    private String name;
//    private int volume;
//
//    public MusicPlayer() {}                      //создаем пустой конструктор, т.к. есть созданный конструкторо выше
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    //-------------------------------------------- lesson10 --------------------------------------------------------
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }
//
//    public String playMusic(){
//        return "Playing: " + classicalMusic.getSong();
//    }

    //-------------------------------------------- lesson11 --------------------------------------------------------
//    @Autowired
//    @Qualifier("classicalMusic")
    private Music music1;
    private Music music2;

//    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

    //-------------------------------------------- lesson12 --------------------------------------------------------
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

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
