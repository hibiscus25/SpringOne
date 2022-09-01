package com;

import com.lesson4567.ClassicalMusic;
import com.lesson4567.Computer;
import com.lesson4567.MusicPlayer;
import com.lesson4567.RockMusic;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(),rockMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
