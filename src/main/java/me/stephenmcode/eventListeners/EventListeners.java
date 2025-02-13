package me.stephenmcode.eventListeners;

import me.stephenmcode.eventListeners.listeners.XPBottleBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("StephenMCode's plugin has started");

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);

    }

}
