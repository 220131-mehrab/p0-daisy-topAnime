package com.revature.topAnime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimeTest {
    @Test
    public void Test(){
        Anime anime = new Anime();

        Anime anime1 = new Anime().of().setName("Death Note");
        Assertions.assertEquals("Death Note", anime1.getName());

        anime1 = new Anime().of().setRanking(8.63);
        Assertions.assertEquals(8.63, anime1.getRanking());

        new Anime().of().setID(1);
        Assertions.assertEquals(1, anime1.getID()+1);

        anime1 = new Anime().of().setType("TV");
        Assertions.assertEquals("TV", anime1.getType());

        anime1 = new Anime().of().setEpisodes(37);
        Assertions.assertEquals(37, anime1.getEpisodes());

        anime1 = new Anime().of().setLicense("VIZ Media");
        Assertions.assertEquals("VIZ Media", anime1.getLicense());

        anime1 = new Anime().of().setStudio("Madhouse");
        Assertions.assertEquals("Madhouse", anime1.getStudio());

        anime1 = new Anime().of().setGenre("Mystery,Supernatural,Suspense");
        Assertions.assertEquals("Mystery,Supernatural,Suspense", anime1.getGenre());

        anime1 = new Anime().of().setDemographic("Shounen");
        Assertions.assertEquals("Shounen", anime1.getDemographic());

        anime1 = new Anime().of().setRating("R - 17+ (violence & profanity)");
        Assertions.assertEquals("R - 17+ (violence & profanity)", anime1.getRating());
    }
}