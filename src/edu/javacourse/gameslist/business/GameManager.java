package edu.javacourse.gameslist.business;

import edu.javacourse.gameslist.dao.GameDAO;
import edu.javacourse.gameslist.dao.GameDAOFactory;
import edu.javacourse.gameslist.entity.Game;

import java.util.List;

public class GameManager {
    private GameDAO dao;

    public GameManager() {
        dao = GameDAOFactory.getGameDAO();
    }

    public long addGame(Game game) {
        return dao.addGame(game);
    }

    public void updateGame(Game game){
        dao.updateGame(game);
    }

    public void deleteGame(Long gameId) {
        dao.deleteGame(gameId);
    }

    public Game getGame (long gameId){
        return dao.getGame(gameId);
    }

    public List<Game> findGames () {
        return dao.findGames();
    }

}
