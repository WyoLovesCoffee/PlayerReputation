package me.wyolovescoffee.playerreputation.reputation;

import org.bukkit.entity.Player;

public class AddReputation extends GetReputation {

    Player player;

    String PlayerName = player.getName();

    public void AddPlayerReputation(String PlayerName, Integer ReputationToAdd) {

        Integer CurrentReputation = PlayerReputation.get(PlayerName);

        Integer NewReputation = CurrentReputation + ReputationToAdd;

        PlayerReputation.put(PlayerName, NewReputation);

    }



}
