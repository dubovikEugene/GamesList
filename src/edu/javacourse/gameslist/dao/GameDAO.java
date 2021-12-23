package edu.javacourse.gameslist.dao;

import edu.javacourse.gameslist.entity.Game;

import java.util.List;

public interface GameDAO {
    public Long addGame (Game game);
    public void updateGame (Game game);
    public void deleteGame (Long gameId);
    public Game updateGame (Long gameId);
    public List<Game> findGame();
}
