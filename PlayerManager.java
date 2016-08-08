/** Program: PlayerManager
* File: PlayerManager.java
* Summary: The class for managing the player count using an array list
* Author: Charles Maple III
* Date: July 14, 2016 
**/

import java.util.ArrayList;
import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PlayerManager 
{
	
	public ArrayList<OffensivePlayer> offensivePlayerObj = new ArrayList<>();
	public ArrayList<DefensivePlayer> defensivePlayerObj = new ArrayList<>();
	
	public PlayerManager() 
	{
		CreatePlayers();
	}
	
	private void CreatePlayers() 
	{
		
	}
	
	public ObservableList<String> availOffensiveObsList()
	{
		String[] tempPlayerList = new String[offensivePlayerObj.size()];
		
		for(int i = 0; i < offensivePlayerObj.size(); i++)
		{
			tempPlayerList[i] = offensivePlayerObj.get(i).jerseyNumber + " - " + offensivePlayerObj.get(i).name + " - " + offensivePlayerObj.get(i).position;
		}
		
		ObservableList<String> offensiveObList = FXCollections.observableArrayList(tempPlayerList);
				return offensiveObList;
	}
	
	public ObservableList<String> availDefensiveObsList()
	{
		String[] tempPlayerList = new String[defensivePlayerObj.size()];
		
		for(int i = 0; i < defensivePlayerObj.size(); i++)
		{
			tempPlayerList[i] = defensivePlayerObj.get(i).jerseyNumber + " - " + defensivePlayerObj.get(i).name + " - " + defensivePlayerObj.get(i).position;
		}
		
		ObservableList<String> defensiveObList = FXCollections.observableArrayList(tempPlayerList);
				return defensiveObList;
	}
	
	public ObservableList<String> createSearchOffObsList(String searchName, String searchTeam, String searchPosition) 
	{
		String[] tempPlayerList = new String[0];
		boolean okToAdd = false;
		
            for (OffensivePlayer offensivePlayerObj1 : offensivePlayerObj) {
                if (!"".equals(searchName)) {
                    if ((int) offensivePlayerObj1.name.toLowerCase().indexOf(searchName.toLowerCase()) >= 0) {
                        okToAdd = true;
                    }
                }
                if (!"Team".equals(searchTeam)) {
                    if (offensivePlayerObj1.team.equals(searchTeam)) {
                        if (okToAdd)
                            okToAdd = true;
                    } else {
                        okToAdd = false;
                    }
                }
                if (!"Position".equals(searchPosition)) {
                    if (offensivePlayerObj1.position.equals(searchPosition)) {
                        if (okToAdd)
						okToAdd = true;
                    } else {
                        okToAdd = false;
                    }
                }
                if (okToAdd) {
                    tempPlayerList = Arrays.copyOf(tempPlayerList, tempPlayerList.length + 1);
                    tempPlayerList[tempPlayerList.length - 1] = offensivePlayerObj1.jerseyNumber + " - " + offensivePlayerObj1.name + " - " + offensivePlayerObj1.position;
                }
                okToAdd = false;
            }
		
		ObservableList<String> searchObsList = FXCollections.observableArrayList(tempPlayerList);
		
		return searchObsList;
	}

	public ObservableList<String> createDefenseObsList() 
	{
		String[] tempPlayerList = new String[defensivePlayerObj.size()];
		
		for (int i = 0; i < defensivePlayerObj.size(); i++) 
		{
			tempPlayerList[i] = defensivePlayerObj.get(i).jerseyNumber + " - " + defensivePlayerObj.get(i).name + " - " + defensivePlayerObj.get(i).position;
		}
		ObservableList<String> defObsList = FXCollections.observableArrayList (tempPlayerList);
		
		return defObsList;
	}
	
	public ObservableList<String> createOffenseObsList() 
	{
		String[] tempPlayerList = new String[offensivePlayerObj.size()];
		
		for (int i = 0; i < offensivePlayerObj.size(); i++) 
		{
			tempPlayerList[i] = offensivePlayerObj.get(i).jerseyNumber + " - " + offensivePlayerObj.get(i).name + " - " + offensivePlayerObj.get(i).position;
		}
		ObservableList<String> offObsList = FXCollections.observableArrayList (tempPlayerList);
		
		return offObsList;
	}
	
	public ObservableList<String> createSearchDefenseObsList(String searchName, String searchTeam, String searchPosition) 
	{
		String[] tempPlayerList = new String[0];
		boolean okToAdd = false;
		
            for (DefensivePlayer defensivePlayerObj1 : defensivePlayerObj) {
                if (!"".equals(searchName)) {
                    if ((int) defensivePlayerObj1.name.toLowerCase().indexOf(searchName.toLowerCase()) >= 0) {
                        okToAdd = true;
                    }
                }
                if (!"Team".equals(searchTeam)) {
                    if (defensivePlayerObj1.team.equals(searchTeam)) {
                        if (okToAdd)
                            okToAdd = true;
                    } else {
                        okToAdd = false;
                    }
                }
                if (!"Position".equals(searchPosition)) {
                    if (defensivePlayerObj1.position.equals(searchPosition)) {
                        if (okToAdd)
						okToAdd = true;
                    } else {
                        okToAdd = false;
                    }
                }
                if (okToAdd) {
                    tempPlayerList = Arrays.copyOf(tempPlayerList, tempPlayerList.length + 1);
                    tempPlayerList[tempPlayerList.length - 1] = defensivePlayerObj1.jerseyNumber + " - " + defensivePlayerObj1.name + " - " + defensivePlayerObj1.position;
                }
                okToAdd = false;
            }
		
		ObservableList<String> searchObsList = FXCollections.observableArrayList(tempPlayerList);
		
		return searchObsList;
	}
	
	public ObservableList<String> createSearchOffenseObsList(String searchName, String searchTeam, String searchPosition) 
	{
		String[] tempPlayerList = new String[0];
		boolean okToAdd = false;
		
            for (OffensivePlayer offensivePlayerObj1 : offensivePlayerObj) {
                if (!"".equals(searchName)) {
                    if ((int) offensivePlayerObj1.name.toLowerCase().indexOf(searchName.toLowerCase()) >= 0) {
                        okToAdd = true;
                    }
                }
                if (!"Team".equals(searchTeam)) {
                    if (offensivePlayerObj1.team.equals(searchTeam)) {
                        if (okToAdd)
                            okToAdd = true;
                    } else {
                        okToAdd = false;
                    }
                }
                if (!"Position".equals(searchPosition)) {
                    if (offensivePlayerObj1.position.equals(searchPosition)) {
                        if (okToAdd)
						okToAdd = true;
                    } else {
                        okToAdd = false;
                    }
                }
                if (okToAdd) {
                    tempPlayerList = Arrays.copyOf(tempPlayerList, tempPlayerList.length + 1);
                    tempPlayerList[tempPlayerList.length - 1] = offensivePlayerObj1.jerseyNumber + " - " + offensivePlayerObj1.name + " - " + offensivePlayerObj1.position;
                }
                okToAdd = false;
            }
		
		ObservableList<String> searchObsList = FXCollections.observableArrayList(tempPlayerList);
		
		return searchObsList;
	}
	
	public void addOffensivePlayer(OffensivePlayer playerObject) 
	{
		offensivePlayerObj.add(playerObject);
	}
	
	public void addDefensivePlayer(DefensivePlayer playerObject)
	{
		defensivePlayerObj.add(playerObject);
	}
	
	public void removeOffPlayer(String playerToRemove)
	{
		OffensivePlayer playerObject = null;
		
		for(OffensivePlayer player : offensivePlayerObj) 
		{
			if (player.name.equals(playerToRemove))
				playerObject = player;
		}
		
		offensivePlayerObj.remove(playerObject);
	}
	
	public void removeDefPlayer(String playerToRemove)
	{
		DefensivePlayer playerObject = null;
		
		for(DefensivePlayer player : defensivePlayerObj) 
		{
			if (player.name.equals(playerToRemove))
				playerObject = player;
		}
		
		defensivePlayerObj.remove(playerObject);
	}
	
	public DefensivePlayer getDefPlayerObj(String playerName) 
	{
		DefensivePlayer playerObject = null;

		for(DefensivePlayer player : defensivePlayerObj) 
		{
			if (player.name.equals(playerName))
				playerObject = player;
		}
		
		return playerObject;
	}
	
	public OffensivePlayer getOffPlayerObj(String playerName) 
	{
		OffensivePlayer playerObject = null;

		for(OffensivePlayer player : offensivePlayerObj) 
		{
			if (player.name.equals(playerName))
				playerObject = player;
		}
		
		return playerObject;
	}
}