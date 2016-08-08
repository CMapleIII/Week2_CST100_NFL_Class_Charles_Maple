/** Program: DefensivePlayer
* File: DefensivePlayer.java
* Summary: The class to hold defensive player stats.
* Author: Charles Maple III
* Date: Updated July 23, 2016 
**/

import java.util.Random;

public class DefensivePlayer extends PlayerClass implements Celebrator
{
	protected int forcedFumbles = 0;
	protected int interceptions = 0;
	protected double sacks = 0;
	protected double tackles = 0;
	
	DefensivePlayer(String team, String name, String position, int jerseyNumber) 
	{
		super(team, name, position, jerseyNumber);
	}
	
        @Override
	public String celebrate()
	{
		int randCeleInt = new Random().nextInt(Celebrator.celebrationTypes.length);
		String randCele = (Celebrator.celebrationTypes[randCeleInt]);
		
		System.out.println(this.name + " " + randCele + " to celebrate being drafted!");
		return name;
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
        @Override
	public void setTeam(String playerTeam)
	{
		team = playerTeam;
	}
	
        @Override
	public String getName()
	{
		return name;
	}
	
        @Override
	public void setName(String playerName)
	{
		name = playerName;
	}
}