/**
 * 
 * @author JWKoziel
 * 
 * This is player class object which get created whenever I populate the database.
 *
 */
public class Player {
	//Unique id.
	protected int id;
	//Name and surname.
	protected String name;
	//Their contact information.
	protected int phoneNumber;
	//Change to data type.
	protected String dateJoined;
	//Player wins .
	protected int wins;
	//Player losses.
	protected int loses;
	//Average score manually set.
	protected int averageScore;
	
	//Constructor creates new object with full set of its variables.
	public Player(int id, String name, int phoneNumber, String dateJoined, int wins, int loses, int averageScore) {
		super();
		//Give local variables the value of variables sent through when objects were initialised.
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateJoined = dateJoined;
		this.wins = wins;
		this.loses = loses;
		this.averageScore = averageScore;
	}
	
	//Getters and setters for the player class object.
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getPhoneNumber() {
		return phoneNumber;
	}
	protected void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	protected String getDateJoined() {
		return dateJoined;
	}
	protected void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}
	protected int getWins() {
		return wins;
	}
	protected void setWins(int wins) {
		this.wins = wins;
	}
	protected int getLoses() {
		return loses;
	}
	protected void setLoses(int loses) {
		this.loses = loses;
	}
	protected int getAverageScore() {
		return averageScore;
	}
	protected void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}
}
