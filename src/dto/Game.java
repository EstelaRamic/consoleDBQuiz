package dto;

import java.util.Date;

public class Game {

	private int id;
	private int userID;
	private int score;
	private Date date;

	public Game(){
			
		}

	public Game(int id, int userID, int score, Date date) {
		this.id = id;
		this.userID = userID;
		this.score = score;
		this.date = date;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Game [Game number=" + id + ", user ID=" + userID + ", score=" + score + ", date="
				+ date + "]";
	}

}
