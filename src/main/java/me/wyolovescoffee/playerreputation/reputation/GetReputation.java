package me.wyolovescoffee.playerreputation.reputation;

import me.wyolovescoffee.playerreputation.events.PlayerJoin;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class GetReputation extends PlayerJoin {

    HashMap<String, Integer> PlayerReputation = new HashMap<String, Integer>();

    Player player;

    String PlayerName = player.getName();

    public int GetPlayerReputation(String PlayerName) {

        Integer CurrentReputation = PlayerReputation.get(PlayerName);

        if (CurrentReputation == null)
        {

            System.out.println("Reputation does not exist! Creating new player reputation!");

            Integer NewReputation = PlayerReputation.put(PlayerName, 500); //500 is starting reputation

            return NewReputation;
        }

        return CurrentReputation;

    }


}
