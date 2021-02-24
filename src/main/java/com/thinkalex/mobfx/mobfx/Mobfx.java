package com.thinkalex.mobfx.mobfx;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mobfx extends JavaPlugin {
    // Make plugin accesible from everywhere
    public static Mobfx plugin;

    FileConfiguration config = this.getConfig();
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getServer().getPluginManager().registerEvents(new DamageDetection(), this);
        this.getCommand("enable").setExecutor(new enable());
        this.getCommand("disable").setExecutor(new disable());
        this.getCommand("reload").setExecutor(new reload());
        config.options().copyDefaults(true);
        saveDefaultConfig();
        if (config.getBoolean("IMMUNITY_ITEM")); {ImmunityItem.GenerateRecipe();}
        getLogger().info("The plugin has started succesfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
