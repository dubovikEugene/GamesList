package edu.javacourse.gameslist.entity;

import java.time.LocalDate;

public class Game {
    private Long id;
    private String title;
    private String genre;
    private String developer;
//    private LocalDate releaseDate;

    public Game() {
    }

    public Game(String title, String genre, String developer) {
        this.title = title;
        this.genre = genre;
        this.developer = developer;
    }
}
