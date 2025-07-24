package de.HiorCraft.smp.main;


import org.bukkit.plugin.java.JavaPlugin;
import de.HiorCraft.smp.duble_jump.DoubleJump;

public final class essental_SMP extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Essential SMP Plugin is starting...");
        getServer().getPluginManager().registerEvents(new DoubleJump(), this);
        getCommand("credits").setExecutor(new de.HiorCraft.smp.commands.credits());



    }

    @Override
    public void onDisable() {
        getLogger().info("Essential SMP Plugin is stopping...");
    }
}