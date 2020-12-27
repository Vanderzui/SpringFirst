package ru.alisa.springfirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music musicBean = context.getBean("musicBean", Music.class); //внедрение зависимости вручную
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); //dependency injection
//        musicPlayer.playSong();
//        System.out.println(musicPlayer.getName()); //bean's property from xml
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer.getProducer()); //from property file
//        MusicPlayer musicList = context.getBean("musicPlayer", MusicPlayer.class);
//        musicList.playSongsList();
        FolkMusic folkBean = context.getBean("folkBean", FolkMusic.class);
        FolkMusic folkBean1 = context.getBean("folkBean", FolkMusic.class);
//        System.out.println(folkBean.getSong());


        context.close();
    }
}
