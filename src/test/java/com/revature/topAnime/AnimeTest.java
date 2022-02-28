package com.revature.topAnime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimeTest {
    @Test
    public void Test(){
        Anime anime = new Anime();
        //"Name, Ranking, ID, Followers, Type of Anime, Episodes, Licenses, Studio, Genre, Demographic, Rating";

        Anime anime1 = new Anime().of().setName("Death Note");
        Assertions.assertEquals("Death Note", anime1.getName());

        anime1 = new Anime().of().setRanking(8.63);
        Assertions.assertEquals(8.63, anime1.getRanking());
    }
}

//  Death Note;8.63;1;3,150,451;TV;37;VIZ Media;Madhouse;Mystery,Supernatural,Suspense;Shounen;R - 17+ (violence & profanity);
