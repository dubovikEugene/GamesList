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

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
