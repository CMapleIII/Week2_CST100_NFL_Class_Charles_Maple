/** Program: PlayerClass
* File: PlayerClass.java
* Summary: The class for the players
* Author: Charles Maple III
* Date: Updated July 30, 2016 
**/

public abstract class PlayerClass implements Celebrator
{
	// the variables for the players stats.
	protected String team = "";
	protected String name = "";
	protected String position = "";
	protected int jerseyNumber;
	
	PlayerClass(String team, String name, String position, int jerseyNumber) 
	{
		this.team = team;
		this.name = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
	}
	
        @Override
	public String celebrate()
	{
		return name;
		
	}
	
		//Getters
	public String getTeam()
	{
		return team;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public int getJerseyNumber()
	{
		return jerseyNumber;
	}
	
		//Setters
	public void setTeam(String playerTeam)
	{
		team = playerTeam;
	}
	
	public void setName(String playerName)
	{
		name = playerName;
	}
	
	public void setPosition(String playerPos)
	{
		position = playerPos;
	}
	
	public void setJersyNumber(int plyrJerseyNum)
	{
		jerseyNumber = plyrJerseyNum;
	}
}