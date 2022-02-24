package com.revature.topAnime;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AniRepo {
    private List<String> anime;
    private InputStream file;

    public AniRepo(String filename) {
        this.anime = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.anime.add(scanner.next());
        }
    }

    public List<String> getAnime() {
        return anime;
    }
}
