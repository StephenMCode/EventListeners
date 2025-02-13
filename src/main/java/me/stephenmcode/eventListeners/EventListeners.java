package me.stephenmcode.eventListeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.Component;

public final class EventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("StephenMCode's plugin has started");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        event.joinMessage(Component.text("Welcome to the server silly goose!"));

    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {

        Player player = event.getPlayer();
        World world = player.getWorld();

        long timeInTicks = world.getTime();

        if (timeInTicks > 12542 && timeInTicks < 23459) {
            player.sendMessage("You got out of bed after curfew! You have been punished for your actions.");
            player.setHealth(0);
        } else {
            player.sendMessage("Good morning!");
        }

    }

}
