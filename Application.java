/**
 * @author JWKoziel
 * This is the main application which manages record in the array list of players
 * It has no interface however I have simulated having one and doing somethin a user would do.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {
	//Database of players created manually.

	public static void main(String[] args) {
		
		//Create and populate an array list with players and their information.
		
		ArrayList<Player> playerList = new ArrayList<Player>();
		
		playerList.add(new Player(0, "John", 434784492, "21/09/2018", 11, 9, 44));

		playerList.add(new Player(1, "Mary", 673800938, "09/01/2012", 8, 7, 33));

		playerList.add(new Player(2, "Jacob", 958011597, "14/03/2015", 8, 3, 23));

		playerList.add(new Player(3, "Alice", 233541407, "19/09/2018", 13, 7, 42));

		playerList.add(new Player(4, "Nick", 132988899 , "24/11/2017", 15, 2, 67));

		playerList.add(new Player(5, "Charlie", 344798677, "11/12/2018", 1, 5, 23));

		playerList.add(new Player(6, "Aidan", 965527036, "17/03/2011", 7, 4, 54));

		playerList.add(new Player(7, "Tom", 74586383, "18/09/2018", 10, 4, 22));

		playerList.add(new Player(8, "Pat", 428704217, "02/02/2017", 5, 5, 31));

		playerList.add(new Player(9, "Chelsea", 266471000, "28/11/2015", 10, 10, 23));

		playerList.add(new Player(10, "Matilda", 761748603, "12/12/2012", 7, 3, 15));

		playerList.add(new Player(11, "Rose", 243706157, "01/01/2011", 4, 1, 52));

		playerList.add(new Player(12, "Freddie", 551274788, "24/10/2017", 6, 3, 32));

		playerList.add(new Player(13, "Julia", 762087946, "15/04/2018", 9, 2, 51));

		playerList.add(new Player(15, "Tom", 109569504, "19/05/2017", 6, 1, 20));
		
		playerList.add(new Player(16, "Betty", 345788615, "19/07/2015", 9, 0, 15));
		
		playerList.add(new Player(17, "Frankie", 890271638, "19/06/2012", 0, 9, 17));
		
		playerList.add(new Player(18, "Charlotte", 704542447, "19/02/2016", 3, 4, 21));
		
		playerList.add(new Player(19, "Patrick", 872560039, "19/01/2017", 2, 5, 14));
		
		playerList.add(new Player(20, "Robert", 917211050, "19/12/2018", 11, 34, 11));
		
		playerList.add(new Player(21, "Jimmy", 810827293, "19/11/2014", 20, 12, 32));
		
		playerList.add(new Player(22, "James", 823965065, "19/02/2015", 18, 12, 52));
		
		playerList.add(new Player(23, "Amanda", 703446291, "19/05/2013", 7, 4, 11));

		//Call display array method and send array list as reference with the amount of records to output.
		System.out.println("Displaying populated array");
		displayArrayListContent(playerList, playerList.size());
		//Some formating
		System.out.println("");
		
		//Re arrange array list by the smallest average using collections object, passing reference to created database. 
		sortByLowest(playerList);
		//More formatting and displaying array list.
		System.out.println("Displaying array sorted by lowest average score");
		displayArrayListContent(playerList, playerList.size());
		System.out.println("");
		// Sort by the biggest average score using collections object but in reverse.
		sortByHighest(playerList);	
		System.out.println("Displaying array sorted by highest average score");
		//After sorting display again
		displayArrayListContent(playerList, playerList.size());
		System.out.println("");
		
		//Here I will call and create new database and copy all records with more games with 10 and then display top 10 of them.
		System.out.println("Displaying top 10 players sorted by highest average score with minimium of 10 games ");
		displayArrayListContent(filterLessThan10(playerList), 10);
		System.out.println("");
		//To show how I would update fields of players, passing reference, id of person involved and new updated field.
		updatePhoneNumber(playerList, 23, 999999999);
		System.out.println("I have Updated Amandas phone number to 999999999 ");
		displayArrayListContent(playerList ,playerList.size());
		System.out.println("");
	}
	//Sorting by highest, collections object does all the work for me and returns sorted list.
	private static void sortByHighest(ArrayList<Player> playerList) {
		Collections.sort(playerList, new Comparator<Player>(){
			public int compare(Player p2, Player p1) {
				return Integer.valueOf(p1.averageScore).compareTo(p2.averageScore);
			}	
		});
	}
	//This method is the same as sort by highest but in reverse which sorts by smallest value.
	private static void sortByLowest(ArrayList<Player> playerList) {
		
		Collections.sort(playerList, new Comparator<Player>(){
			public int compare(Player p1, Player p2) {
				
				return Integer.valueOf(p1.averageScore).compareTo(p2.averageScore);
			}
		});
	}
	//Here I'm creating new array list and copying oly records with more than 10 wins.
	protected static ArrayList<Player> filterLessThan10(ArrayList<Player> playerList) {
		ArrayList<Player> playerListTop10 = new ArrayList<Player>();
		for(int i =0; i < playerList.size(); i++) {
			int x = playerList.get(i).getWins() + playerList.get(i).getLoses();
			if( x >= 10)	{
				playerListTop10.add(playerList.get(i));
			}
		}
		//Returning reference to new database
		return playerListTop10;
	}
	/**
	 * This is old method used to display 10 records
	protected static void displayTop10(ArrayList<Player> playerListTop10) {
		
		for(int i =0; i < 10; i++) {
			displayInformation(playerListTop10.get(i));	
		}
	}
	*/
	protected static void updatePhoneNumber(ArrayList<Player> playerList, int id, int newNumber) {
		
		for(int i =0; i < playerList.size(); i++) {
			if(id == playerList.get(i).getId()) {
				playerList.get(i).setPhoneNumber(newNumber);
			}
		}				
	}
	
	//Here I go through the whole database or 10 records depending on which parameters i sent while calling this method.
	protected static void displayArrayListContent(ArrayList<Player> playerList, int lenght) {
		
		for(int i =0; i < lenght; i++) {
			displayInformation(playerList.get(i));	
		}
		
	}
	//This is my main display method for the player objects using string builder.
	protected static void displayInformation(Player player) {
		
		StringBuilder sb = new StringBuilder();
		//Here I'm creating output of all fields
		sb.append("ID: ");
		sb.append(player.getId());
		sb.append(" Name: ");
		sb.append(player.getName());
		sb.append(" Phone number: ");
		sb.append(player.getPhoneNumber());
		sb.append(" Join date: ");
		sb.append(player.getDateJoined());
		sb.append(" Wins: ");
		sb.append(player.getWins());
		sb.append(" Loses: ");
		sb.append(player.getLoses());
		sb.append(" Average score: ");
		sb.append(player.getAverageScore());
		
		System.out.println(sb);	
	}
}
