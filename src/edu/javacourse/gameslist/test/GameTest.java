package edu.javacourse.gameslist.test;

import edu.javacourse.gameslist.business.GameManager;
import edu.javacourse.gameslist.entity.Game;

import java.util.List;

public class GameTest {
    public static void main(String[] args) {
        GameManager gm = new GameManager();

        Game game1 = new Game("Dragon Age: Origins", "RPG", "BioWar");
        Game game2 = new Game("Mass Effect", "RPG", "BioWar");
        Game game3 = new Game("Assassins Creed", "Action-adventure", "Ubisoft");

        System.out.println("ADD GAME ==============");
        Long gameId1 = gm.addGame(game1);
        Long gameId2 = gm.addGame(game2);
        Long gameId3 = gm.addGame(game3);
        List<Game> result1 = gm.findGames();
        for (Game g : result1) {
            System.out.println(g);
        }

        System.out.println("UPDATE GAME ==========");
        Game change = new Game(gameId1, "WarCraft 3", "RTS", "Blizzard Entertament");
        gm.updateGame(change);
        List<Game> result2 = gm.findGames();
        for (Game g : result2) {
            System.out.println(g);
        }

        System.out.println("DELETE GAME ==========");
        gm.deleteGame(gameId3);
        List<Game> result3 = gm.findGames();
        for (Game g : result3) {
            System.out.println(g);
        }

        System.out.println("GET GAME ==========");
        Game game = gm.getGame(gameId2);
        System.out.println(game);

    }
}
