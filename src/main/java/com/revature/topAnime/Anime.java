package com.revature.topAnime;

public class Anime {
    private String Name;
    private double Ranking;
    private int ID;
    private int Followers;
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

    public int getFollowers() {
        return Followers;
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
    }

    public void setFollowers(int followers) {
        Followers = followers;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setEpisodes(int episodes) {
        Episodes = episodes;
    }

    public void setLicense(String license) {
        License = license;
    }

    public void setStudio(String studio) {
        Studio = studio;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setDemographic(String demographic) {
        Demographic = demographic;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public static Anime of() {
        return new Anime();
    }
}