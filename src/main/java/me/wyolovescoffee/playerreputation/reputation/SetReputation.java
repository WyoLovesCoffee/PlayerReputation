package me.wyolovescoffee.playerreputation.reputation;

import java.util.HashMap;

public class SetReputation extends GetReputation {

    HashMap <String, Integer> PlayerReputation = new HashMap <String, Integer>();

    public int SetPlayerReputation(String PlayerName, Integer Reputation)
    {

        Integer CurrentReputation = PlayerReputation.get(PlayerName);

        //Again, we are checking is the player somehow has no reputation set, but this time we'll set the reputation equal to the argument instead of the starting reputation.
        if (CurrentReputation == null) {

            System.out.println("Player does not have a reputation! Creating one now!");

            Integer NewReputation = PlayerReputation.put(PlayerName, Reputation);

        }

        PlayerReputation.put(PlayerName, Reputation);

        return 1;

    }



}
