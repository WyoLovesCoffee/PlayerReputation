package me.wyolovescoffee.playerreputation.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    private Boolean isNew;

    Player player;

    Integer startingReputation = 500;

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event) {


        this.player = event.getPlayer();

        this.isNew = player.hasPlayedBefore();

        Integer startingReputation = 500;

        if (isNew = true) {

           // SetReputation()

        }

    }

    //The two methods below returns player name and isNew to be used in other classes
    public String PlayerName() {

        return player.getName();

    }

    public Player PlayedJoined() {

        return player;

    }

    public Boolean GetIfPlayerNew() {

        return isNew;

    }




}
