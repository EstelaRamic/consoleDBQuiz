package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	// localhost//imeBazeNaKojuSeSpajamo
	private static final String CONN_STRING = "jdbc:mysql://localhost/quiz";
	// error? dodati na kraj stringa ?useSSL=false

	public static void main(String[] args) throws SQLException {

		// napraviti SQL Query
		String query1 = "CREATE TABLE user (" 
				+ "userID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,"
				+ "firstName VARCHAR(70)," 
				+ "lastName VARCHAR(70),"
				+ "username VARCHAR(70)," 
				+ "password VARCHAR(70)," 
				+ "age int,"
				+ "gender VARCHAR(10)"+ ");";
		
		String query2 = "CREATE TABLE game (" 
				+ "ID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,"
				+ "userID INTEGER,"
				+ "score INTEGER," 
				+ "date DATE"
				 + ");";

		try (Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				// java.sql.Statement
				Statement statement = connection.createStatement();) {
			// pokrenuti query
			statement.executeUpdate(query1);
			statement.executeUpdate(query2);
			System.out.println("Baza podataka uspjesno updateana.");
		}
	}
}

