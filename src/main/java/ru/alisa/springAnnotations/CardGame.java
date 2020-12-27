package ru.alisa.springAnnotations;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CardGame implements Game{
    List<String> cardGames;

    {
        cardGames = Arrays.asList("Fool", "Poker", "21");
    }

    @Override
    public List<String> playGame() {
        return cardGames;
    }
}
