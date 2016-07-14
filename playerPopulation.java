/** Program: playerPopulation
* File: playerPopulation.java
* Summary: Populates the players
* Author: Charles Maple III
* Date: July 14, 2016 
**/

public class playerPopulation 
{
	public static void main(String[] args) 
	{
		PlayerManager pManager = new PlayerManager();
		
		System.out.println("Number of Players is " + pManager.listofPlayers.size());
	}

}