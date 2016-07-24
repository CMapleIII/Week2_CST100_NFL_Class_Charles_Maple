/** Program: PlayerClass
* File: PlayerClass.java
* Summary: The class for the players
* Author: Charles Maple III
* Date: Updated July 23, 2016 
**/
public abstract class PlayerClass 
{
	// the variables for the players stats.
	protected String team = "";
	protected String name = "";
	protected String position = "";
	protected double height;
	protected double weight;
	protected int jerseyNumber;
	protected int age;

	
	PlayerClass(String team, String name, String position, double height, 
			double weight,int jerseyNumber, int age) 
	{
		this.team = team;
		this.name = name;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.jerseyNumber = jerseyNumber;
		this. age = age;
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
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public int getJerseyNumber()
	{
		return jerseyNumber;
	}
	
	public int getAge()
	{
		return age;
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
	
	public void setHeight(double playerHeight)
	{
		height = playerHeight;
	}
	
	public void setWeight(double playerWeight)
	{
		weight = playerWeight;
	}
	
	public void setJersyNumber(int plyrJerseyNum)
	{
		jerseyNumber = plyrJerseyNum;
	}
	
	public void setAge(int playerAge)
	{
		age = playerAge;
	}
}
