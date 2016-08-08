import java.util.Random;

/** Program: OffensivePlayer
* File: OffensivePlayer.java
* Summary: The class to hold offensive player stats.
* Author: Charles Maple III
* Date: Updated July 30, 2016 
**/

public class OffensivePlayer extends PlayerClass implements Celebrator
{
	protected int touchDowns = 0;
	protected int carries = 0;
	protected int receptions = 0;
	protected double avRushingYards = 0;
	protected double averageYards = 0;
	protected int fieldGoals = 0;
	
	OffensivePlayer(String team, String name, String position, double height, 
			double weight,int jerseyNumber, int age) 
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
	
	public int getFieldGoals()
	{
		return fieldGoals;
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
	
	public void setFieldGoals(int playerFieldGoals)
	{
		fieldGoals = playerFieldGoals;
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