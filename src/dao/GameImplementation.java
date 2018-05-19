package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import dto.Game;


	

	public class GameImplementation implements GameInterface {

		Connection connection = ConnectionManager.getInstance().getConnection();

		ArrayList<Game> list = new ArrayList<>();

		@Override
		public ArrayList<Game> getAllGames(int userId) throws SQLException {

			Game game = null;
			String query = "SELECT * FROM quiz.game where userId = ?;";

			ResultSet rs = null;
			try (PreparedStatement statement = connection.prepareStatement(query)) {
				statement.setInt(1, userId);
				rs = statement.executeQuery();
				while (rs.next()) {

					game = new Game();
					game.setId(rs.getInt("id"));
					game.setUserID(rs.getInt("userid"));
					game.setScore(rs.getInt("score"));
					game.setDate(rs.getDate("date"));
					

					list.add(game);

				}
			}
			rs.close();
			return list;

		}

		@Override
		public boolean addGame(Game game, int id) throws SQLException {

			String query = "INSERT INTO quiz.game ( userID, score, date) VALUES(?,?,?)";
			try (PreparedStatement statement = connection.prepareStatement(query);) {
				statement.setInt(1, id);
				statement.setInt(2, game.getScore());
				statement.setDate(3, (Date) game.getDate());
				
				
				statement.executeUpdate();
			}
			return true;
		}
		
		@Override
		public Game readGame(int id) throws SQLException {

			Game game = null;

			String query = "SELECT * FROM quiz.game WHERE ID = ?";
			ResultSet rs = null;

			try (PreparedStatement statement = connection.prepareStatement(query);) {

				statement.setInt(1, id);

				rs = statement.executeQuery();

				if (rs.next()) {

					game = new Game();

					game.setId(rs.getInt("ID"));
					game.setUserID(rs.getInt("userID"));
					game.setScore(rs.getInt("score"));
					game.setDate(rs.getDate("date"));
					

				}
			}
			rs.close();

			return game;
		}
		 
	}
