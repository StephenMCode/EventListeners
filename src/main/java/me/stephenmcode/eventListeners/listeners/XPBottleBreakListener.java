package me.stephenmcode.eventListeners.listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XPBottleBreakListener implements Listener {

    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent event) {

        Block block = event.getHitBlock();

        assert block != null;
        block.breakNaturally();

    }

}
