package ru.alisa.springfirst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicPlayerTest {

    @Test
    public void test1() {
        Music classicalMusic = new ClassicalMusic();
        String song = classicalMusic.getSong();
        assertEquals("Dance Macabre", song);
    }
}