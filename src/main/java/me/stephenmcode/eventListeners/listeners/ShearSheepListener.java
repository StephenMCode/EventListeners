package me.stephenmcode.eventListeners.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event) {

        Player player = event.getPlayer();
        Entity entity = event.getEntity();

        EntityType entityType = entity.getType();
        String entityName = entityType.name();
        entityName = entityName.substring(0, 1).toUpperCase() + entityName.substring(1).toLowerCase();

        if (entityType == EntityType.SHEEP) {
            event.setCancelled(true);
            player.sendMessage("Sheep are sacred.");
        } else {
            player.sendMessage("You've sheared a " + entityName + "!");
        }

    }

}
