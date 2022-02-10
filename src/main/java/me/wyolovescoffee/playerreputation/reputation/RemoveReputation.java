package me.wyolovescoffee.playerreputation.reputation;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class RemoveReputation extends GetReputation{

    HashMap<String, Integer> PlayerReputation = new HashMap <String, Integer>();

    Player player;

    String PlayerName = player.getName();

    public void RemovePlayerReputation(String PlayerName, Integer ReputationToRemove) {

        Integer CurrentReputation = PlayerReputation.get(PlayerName);

        Integer NewReputation = CurrentReputation - ReputationToRemove;

        //Later on, I'll add a check to make sure reputation doesn't go over 1000 or under 0
        PlayerReputation.put(PlayerName, NewReputation);

    }


}
