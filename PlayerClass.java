/** Program: PlayerClass
* File: PlayerClass.java
* Summary: The class for the players
* Author: Charles Maple III
* Date: July 4, 2016 
**/
public class PlayerClass 
{
	
	// the variables for the players stats.
	private String team;
	private String name;
	private String position;
	private double height;
	private double weight;
	private int number;
	private int age;
	private int forcedFumbles;
	private int interceptions;
	private int touchDowns;
	private int carries;
	private int receptions;
	private double yards;
	private double averageYards;
	private double sacks;
	private double tackles;
	private double avRushingYards;
	private double rating;
	
	// The setters and getters for the players stats.
	public String getTeam()
	{
		return team;
	}
	
	public String getPos()
	{
		return position;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getFumbles()
	{
		return forcedFumbles;
	}
	
	public int getInterceptions()
	{
		return interceptions;
	}
	
	public int gettouchDowns()
	{
		return touchDowns;
	}
	
	public int getCarries()
	{
		return carries;
	}
	
	public int getReceptions()
	{
		return receptions;
	}
	
	public double getYards()
	{
		return yards;
	}

	public double getaverageYards()
	{
		return averageYards;
	}

	public double getSacks()
{
	return sacks;
}

	public double getTackles()
	{
		return tackles;
	}
	
	public double getaverageRushingYards()
	{
		return avRushingYards;
	}
	
	public double getRating()
	{
		return rating;
	}
	
	public void  setName(String playerName)
	{
		name = playerName;
	}
	
	public void setPosition(String playerPosition)
	{
		position = playerPosition;
	}
	
	public void setTeam(String playerTeam)
	{
		team = playerTeam;
	}
	
	public void setHeight(double playerHeight)
	{
		height = playerHeight;
	}
	
	public void setWeight(double playerWeight)
	{
		weight = playerWeight;
	}
	
	public void setNumber(int playerNumber)
	{
		number = playerNumber;
	}
	
	public void setAge(int playerAge)
	{
		age = playerAge;
	}
	
	public void setFumbles(int playerFumbles)
	{
	forcedFumbles = playerFumbles;
	}
	
	public void setInterceptions(int playerInterceptions)
	{
		interceptions = playerInterceptions;
	}
	
	public void setTouchdowns(int playerTouchdowns)
	{
		touchDowns = playerTouchdowns;
	}
	
	public void setCarries(int playerCarries)
	{
		carries = playerCarries;
	}
	
	public void setReceptions(int playerReceptions)
	{
		receptions = playerReceptions;
	}
	
	public void setYards(double playerYards)
	{
		yards = playerYards;
	}
	
	public void setAvYards(double playerAverageYards)
	{
		averageYards = playerAverageYards;
	}
	
	public void setSacks(double playerSacks)
	{
		sacks = playerSacks;
	}
	
	public void setTackles(double playerTackles)
	{
		tackles = playerTackles;
	}
	
	public void setAvRushingYds(double playerAverageRushingYards)
	{
		avRushingYards = playerAverageRushingYards;
	}
	
	public void setRating(double playerRating)
	{
		rating = playerRating;
	}
	//constructors
	PlayerClass() 
	{
		
	}
	
	PlayerClass(String team, String name, String position, double height, 
			double weight,int number, int age, int forcedFumbles, int interceptions, 
			int touchdowns, int carries, int receptions, double yards, double averageYards, 
			double sacks, double tackles, double avRushingYards, double rating) 
	{
		
	}
}
