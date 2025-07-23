package de.HiorCraft.smp;

import org.bukkit.plugin.java.JavaPlugin;

public final class essental_SMP extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Essential SMP Plugin is starting...");
        getServer().getPluginManager().registerEvents(new de.HiorCraft.smp.duble_jump.double_jump(), this);
        getLogger().info("Essential SMP Plugin is starting...");

    }

    @Override
    public void onDisable() {
        getLogger().info("Essential SMP Plugin is stopping...");
    }
}