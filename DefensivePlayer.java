/** Program: DefensivePlayer
* File: DefensivePlayer.java
* Summary: The class to hold defensive player stats.
* Author: Charles Maple III
* Date: Updated July 23, 2016 
**/

public class DefensivePlayer extends PlayerClass
{
	protected int forcedFumbles = 0;
	protected int interceptions = 0;
	protected double sacks = 0;
	protected double tackles = 0;
	
	DefensivePlayer(String team, String name, String position, double height, 
			double weight,int jerseyNumber, int age) 
	{
		super(team, name, position, height, weight, jerseyNumber, age);
	}
		//getters
	public int getForcedFumbles()
	{
		return forcedFumbles;
	}
	
	public int getInterceptions()
	{
		return interceptions;
	}
	
	public double getSacks()
	{
		return sacks;
	}
	
	public double getTackles()
	{
		return tackles;
	}
		//setters
	public void setForcedFumbles(int plyrForcedFumbles)
	{
		forcedFumbles = plyrForcedFumbles;
	}
	
	public void setInterceptions(int plyrInterceptions)
	{
		interceptions = plyrInterceptions;
	}
	
	public void setSacks(double playerSacks)
	{
		sacks = playerSacks;
	}
	
	public void setTackles(double playerTackles)
	{
		tackles = playerTackles;
	}
	
@Override
	
	public String getTeam()
	{
		return team;
	}
	public void setTeam(String playerTeam)
	{
		team = playerTeam;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String playerName)
	{
		name = playerName;
	}
}
