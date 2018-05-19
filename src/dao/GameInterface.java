package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import dto.Game;

public interface GameInterface {
	
	public ArrayList<Game> getAllGames(int id) throws SQLException;

	public boolean addGame(Game game,int id) throws SQLException;

	public Game readGame(int id) throws SQLException;
	
}

