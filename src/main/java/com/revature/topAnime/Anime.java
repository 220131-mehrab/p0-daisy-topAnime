package com.revature.topAnime;

public class Anime {
    private String Name;

    public String getName() {
        return Name;
    }

    public Anime setName(String name) {
        this.Name = name;
        return this;
    }

    public static Anime of() {
        return new Anime();
    }
}