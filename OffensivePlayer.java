/** Program: OffensivePlayer
* File: OffensivePlayer.java
* Summary: The class to hold offensive player stats.
* Author: Charles Maple III
* Date: Updated July 23, 2016 
**/

public class OffensivePlayer extends PlayerClass
{
	protected int touchDowns = 0;
	protected int carries = 0;
	protected int receptions = 0;
	protected double avRushingYards = 0;
	protected double averageYards = 0;
	
	OffensivePlayer(String team, String name, String position, double height, 
			double weight,int jerseyNumber, int age) 
	{
		super(team, name, position, height, weight, jerseyNumber, age);
	}
		//getters
	public int getTouchDowns()
	{
		return touchDowns;
	}
	
	public int carries()
	{
		return carries;
	}
	
	public int receptions()
	{
		return receptions;
	}
	
	public double getAvRushingYards()
	{
		return avRushingYards;
	}
	
	public double getAverageYards()
	{
		return averageYards;
	}
	//setters
	public void setTouchDowns(int playerTouchDowns)
	{
		touchDowns = playerTouchDowns;
	}
	
	public void setCarries(int playerCarries)
	{
		carries = playerCarries;
	}
	
	public void setReceptions(int playerReceptions)
	{
		receptions = playerReceptions;
	}
	
	public void setAvRushingYards(double plyrAvRushingYds)
	{
		avRushingYards = plyrAvRushingYds;
	}
	
	public void setAverageYards(double plyrAverageYds)
	{
		averageYards = plyrAverageYds;
	}
}
