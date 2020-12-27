package ru.alisa.springAnnotations;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Videogame implements Game{
    List<String> videogames;

    {
        videogames = Arrays.asList("Mario", "Tanks", "PacMan");
    }

    @Override
    public List<String> playGame() {
        return videogames;
    }
}
