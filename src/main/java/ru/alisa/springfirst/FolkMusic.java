package ru.alisa.springfirst;

public class FolkMusic implements Music{
    public void initFolk(){
        System.out.println("Folk initialization");
    }

    public void destroyFolk(){
        System.out.println("Folk destruction");
    }
    @Override
    public String getSong() {
        return "Herr Mannelig";
    }
}
