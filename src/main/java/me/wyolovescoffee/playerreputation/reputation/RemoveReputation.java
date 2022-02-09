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

        PlayerReputation.put(PlayerName, NewReputation);

    }


}
