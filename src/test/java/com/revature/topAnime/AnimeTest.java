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
    }
}
/*

    */
/* Death Note;8.63;1;3,150,451;TV;37;VIZ Media;Madhouse;Mystery,Supernatural,Suspense;Shounen;R - 17+ (violence & profanity);
        Shingeki no Kyojin;8.52;2;3,136,959;TV;25;Funimation;Wit Studio;Action,Drama,Fantasy,Mystery;Shounen;R - 17+ (violence & profanity);
        Fullmetal Alchemist: Brotherhood;9.16;3;2,674,846;TV;64;Funimation,Aniplex of America;Bones;Action,Adventure,Comedy,Drama,Fantasy;Shounen;R - 17+ (violence & profanity); *//*

    @Test
    public void PokemonCorrectTest() {
        */
/** Test data
         *    //ID,Number,Name,Type1,Type2,Total,HP,Atk,Def,SpAtk,SpDef,Spd,Species,Height,Wei
         7,006,Charizard,Fire,Flying,534,78,84,78,109,85,100,Flame Pokémon,1.7 m,90.5 kg
         8,006,Charizard(Mega Charizard X),Fire,Dragon,634,78,130,111,130,85,100,Flame Pokémon,1.7 m,110.5 kg
         9,006,Charizard(Mega Charizard Y),Fire,Flying,634,78,104,78,159,115,100,Flame Pokémon,1.7 m,100.5 kg
         *//*

        Pokemon tempPokemon1 = new Pokemon.Builder().setID(7).setNumber("006").setName("Charizard").setType1("Fire").setType2("Flying")
                .setTotal(534).setHP(78).setAtk(84).setDef(78).setSpAtk(109).setSpDef(85).setSpd(100)
                .setSpecies("Flame Pokémon").setHeight("1.7 m").setWeight("90.5 kg").build();
        Pokemon tempPokemon2 = new Pokemon.Builder().setID(8).setNumber("006").setName("Charizard(Mega Charizard X)").setType1("Fire").setType2("Dragon")
                .setTotal(634).setHP(78).setAtk(130).setDef(111).setSpAtk(130).setSpDef(85).setSpd(100)
                .setSpecies("Flame Pokémon").setHeight("1.7 m").setWeight("110.5 kg").build();
        Pokemon tempPokemon3 = new Pokemon.Builder().setID(9).setNumber("006").setName("Charizard(Mega Charizard Y)").setType1("Fire").setType2("Flying")
                .setTotal(634).setHP(78).setAtk(104).setDef(78).setSpAtk(159).setSpDef(115).setSpd(100)
                .setSpecies("Flame Pokémon").setHeight("1.7 m").setWeight("100.5 kg").build();

        System.out.println(tempPokemon1.toString());
        System.out.println("7,006,Charizard,Fire,Flying,534,78,84,78,109,85,100,Flame Pokémon,1.7 m,90.5 kg");
        System.out.println(tempPokemon2.toString());
        System.out.println(tempPokemon3.toString());

        String poke = new String("Flame Pokémon");
        System.out.println(poke.charAt(10));

        Assertions.assertEquals("Charizard",tempPokemon1.getName());
        Assertions.assertEquals("7,006,Charizard,Fire,Flying,534,78,84,78,109,85,100,Flame Pokémon,1.7 m,90.5 kg",tempPokemon1.toString());
        Assertions.assertEquals("8,006,Charizard(Mega Charizard X),Fire,Dragon,634,78,130,111,130,85,100,Flame Pokémon,1.7 m,110.5 kg",tempPokemon2.toString());
        Assertions.assertEquals("9,006,Charizard(Mega Charizard Y),Fire,Flying,634,78,104,78,159,115,100,Flame Pokémon,1.7 m,100.5 kg",tempPokemon3.toString());

        Assertions.assertEquals(tempPokemon1.getSpecies(),"Flame Pokémon");
        Assertions.assertEquals(tempPokemon2.getSpecies(),"Flame Pokémon");
        Assertions.assertEquals(tempPokemon1.getSpecies(),"Flame Pokémon");
    }
}
*/
