package me.wyolovescoffee.playerreputation.commands.reputation;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class AddReputationCommand extends JavaPlugin {

    HashMap<String, Integer> PlayerReputation = new HashMap <String, Integer>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase(("addreputation"))) {



            Bukkit.broadcastMessage("TEST");
            //Do stuff
            String PlayerName = sender.getName();

            Integer CurrentReputation = PlayerReputation.get(PlayerName);



            if (CurrentReputation == null) {

                Bukkit.broadcastMessage(sender.getName() + " does not have a reputation set! Setting one now...");

                Integer NewReputation = PlayerReputation.put(PlayerName, 500);

                Bukkit.broadcastMessage("I have set " + PlayerName + " to a default of 500!");
            } else {

                Integer NewReputation = CurrentReputation + 100;

                PlayerReputation.put(PlayerName, NewReputation);

                Bukkit.broadcastMessage("I have changed " + PlayerName + "'s reputation to " + NewReputation);

            }

        } else {

            return true; //Don't do stuff

        }



        return true;

    }




}
