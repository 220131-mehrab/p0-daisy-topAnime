package com.revature.topAnime;

public class Anime {
    private String Name;
    private double Ranking;
    private int ID;
    private String Type;
    private int Episodes;
    private String License;
    private String Studio;
    private String Genre;
    private String Demographic;
    private String Rating;

    public String getName() {
        return Name;
    }

    public double getRanking() {
        return Ranking;
    }

    public int getID() {
        return ID;
    }

    public String getType() {
        return Type;
    }

    public int getEpisodes() {
        return Episodes;
    }

    public String getLicense() {
        return License;
    }

    public String getStudio() {
        return Studio;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDemographic() {
        return Demographic;
    }

    public String getRating() {
        return Rating;
    }

    public Anime setName(String name) {
        this.Name = name;
        return this;
    }

    public Anime setRanking(double ranking) {
        this.Ranking = ranking;
        return this;
    }

    public void setID(int ID) {
        this.ID = ID;
        //return this;
    }

    public Anime setType(String type) {
        Type = type;
        return this;
    }

    public Anime setEpisodes(int episodes) {
        Episodes = episodes;
        return this;
    }

    public Anime setLicense(String license) {
        License = license;
        return this;
    }

    public Anime setStudio(String studio) {
        Studio = studio;
        return this;
    }

    public Anime setGenre(String genre) {
        Genre = genre;
        return this;
    }

    public Anime setDemographic(String demographic) {
        Demographic = demographic;
        return this;
    }

    public Anime setRating(String rating) {
        Rating = rating;
        return this;
    }

    public static Anime of() {
        return new Anime();
    }
}