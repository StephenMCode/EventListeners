package me.stephenmcode.eventListeners.listeners;

import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.projectiles.ProjectileSource;

public class XPBottleBreakListener implements Listener {

    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent event) {

        ThrownExpBottle bottle = event.getEntity();
        ProjectileSource shooter = bottle.getShooter();

        if (shooter instanceof Player player) {
            player.sendMessage("Your XP bottle has broken!");
        }

    }

}
