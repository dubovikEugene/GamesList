package edu.javacourse.gameslist.dao;

import edu.javacourse.gameslist.entity.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameSimpleDAO implements GameDAO {
    private final List<Game> games = new ArrayList<Game>();

    @Override
    public Long addGame(Game game) {
        Long id = generateGameID();
        game.setId(id);
        games.add(game);
        return id;
    }

    @Override
    public void updateGame(Game game) {
        Game oldGame = getGame(game.getId());
        if (oldGame != null) {
            oldGame.setTitle(game.getTitle());
            oldGame.setGenre(game.getGenre());
            oldGame.setDeveloper(game.getDeveloper());
        }
    }

    @Override
    public void deleteGame(Long gameId) {
        for (Iterator<Game> it = games.iterator(); it.hasNext();) {
            Game gm = it.next();
            if(gm.getId().equals(gameId)) {
                it.remove();
            }
        }
    }

    @Override
    public Game getGame(Long gameId) {
        for(Game game: games) {
            if (game.getId().equals(gameId)){
                return game;
            }
        }
        return null;
    }

    @Override
    public List<Game> findGames() {
        return games;
    }

    private Long generateGameID() {
        Long gameId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getGame(gameId) != null) {
            gameId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return gameId;
    }
}
