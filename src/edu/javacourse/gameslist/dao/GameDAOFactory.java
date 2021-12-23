package edu.javacourse.gameslist.dao;

public class GameDAOFactory {
    public static GameDAO getGameDAO(){
        return new GameSimpleDAO();
    }
}
