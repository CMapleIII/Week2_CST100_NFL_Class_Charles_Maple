import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class YourTeam extends PlayerManager 
{
	public ArrayList<OffensivePlayer> offensivePlayerObj = new ArrayList<>();
	public ArrayList<DefensivePlayer> defensivePlayerObj = new ArrayList<>();
	
	YourTeam()
	{
		
	}
	
        @Override
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
	
        @Override
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
	
        @Override
	public void addOffensivePlayer(OffensivePlayer playerObject) {
		offensivePlayerObj.add(playerObject);
	}
	
	public void removeDefensivePlayer(int index) {
		defensivePlayerObj.remove(index);
	}
	
	public OffensivePlayer getOffPlayerObject(String playerName) 
	{
		OffensivePlayer playerObject = null;
		
		for(OffensivePlayer player : offensivePlayerObj) 
		{
			if (player.name.equals(playerName))
				playerObject = player;
		}
		
		return playerObject;
	}
	
	public DefensivePlayer getDefPlayerObject(String playerName) 
	{
		DefensivePlayer playerObject = null;

		for(DefensivePlayer player : defensivePlayerObj) 
		{
			if (player.name.equals(playerName))
				playerObject = player;
		}
		
		return playerObject;
	}
}
