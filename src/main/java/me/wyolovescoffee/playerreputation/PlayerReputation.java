package me.wyolovescoffee.playerreputation;

import me.wyolovescoffee.playerreputation.events.MobKillEvent;
import me.wyolovescoffee.playerreputation.events.PlayerJoin;
import me.wyolovescoffee.playerreputation.events.PlayerSleep;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerReputation extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Starting plugin!");

        getServer().getPluginManager().registerEvents(new PlayerSleep(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new MobKillEvent(), this);




    }

    @Override
    public void onDisable() {



    }
}
