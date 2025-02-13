package me.stephenmcode.eventListeners;

import me.stephenmcode.eventListeners.listeners.ShearSheepListener;
import me.stephenmcode.eventListeners.listeners.XPBottleBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("StephenMCode's plugin has started");

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);

    }

}
