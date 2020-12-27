package ru.alisa.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class LauncherGames {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GameConsole gameConsole = context.getBean("gameConsole", GameConsole.class);
        gameConsole.play(Type.valueOf("VIDEO"));
        System.out.println(gameConsole.getProducer());
        System.out.println(gameConsole.getModel());
        context.close();

    }
}
