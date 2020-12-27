package ru.alisa.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;


@Component
@Scope("singleton")
public class GameConsole {
    private Videogame videogame;
    private CardGame cardGame;
    @Value("${gameConsole.producer}")
    private String producer;
    @Value("${gameConsole.model}")
    private int model;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
    @PostConstruct
    public void init(){
        System.out.println("Initialization");
    }
    @PreDestroy
    public void destruct() {
        System.out.println("Destruction");
    }

    @Autowired
    public GameConsole(Videogame videogame, CardGame cardGame) {
        this.videogame = videogame;
        this.cardGame = cardGame;
    }

    public void play(Type type) {
        switch (type) {
            case VIDEO:
                System.out.println(videogame.playGame().get(getRandomInt()));
                break;
            case CARD:
                System.out.println(cardGame.playGame().get(getRandomInt()));
                break;
        }
    }

    private int getRandomInt() {
        Random random = new Random();
        int i = random.nextInt(3);
        return i;
    }

}
