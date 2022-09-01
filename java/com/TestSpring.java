package com;

import com.lesson4567.ClassicalMusic;
import com.lesson4567.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
// ------------------------------------ lesson2 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContextxml");
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        context.close();

// ------------------------------------ lesson4 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        context.close();

// ------------------------------------ lesson5 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContextxml");
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
//        context.close();

// ------------------------------------ lesson6 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        context.close();

// ------------------------------------ lesson7 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        boolean comparison=firstMusicPlayer==secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        context.close();

// ------------------------------------ lesson8 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        context.close();

// ------------------------------------ lesson9 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        Music music = context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music2 = context.getBean("classicalMusic",Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();
//        context.close();

// ------------------------------------ lesson10/11 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
////        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
////        musicPlayer.playMusic();
//
//        Computer computer =context.getBean("computer",Computer.class);
//        System.out.println(computer);
//        context.close();

// ------------------------------------ lesson12 ---------------------------------------
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
//        System.out.println(classicalMusic1==classicalMusic);
//
//        context.close();

// ------------------------------------ lesson13 ---------------------------------------
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic);

        context.close();
    }
}
