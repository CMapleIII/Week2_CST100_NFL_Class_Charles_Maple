/** Program: PlayerManager
* File: PlayerManager.java
* Summary: The class for managing the player count using an array list
* Author: Charles Maple III
* Date: July 14, 2016 
**/

import java.util.ArrayList;

public class PlayerManager 
{
	public ArrayList<PlayerClass> listofPlayers;
	
	public PlayerManager() 
	{
		this.listofPlayers = new ArrayList<PlayerClass>();
		this.CreatePlayers();
	}
	private void CreatePlayers() 
	{
		for (int i = 0; i < 10; i++) 
		{
			PlayerClass playerNew = new PlayerClass();
			
			String playerName = "Player " + (i + 1);
			
			playerNew.setName(playerName);
			playerNew.setNumber(i + 10);
			
			this.listofPlayers.add(playerNew);
		}
	}
}