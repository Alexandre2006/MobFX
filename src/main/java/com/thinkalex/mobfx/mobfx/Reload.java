package com.thinkalex.mobfx.mobfx;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Reload implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage("Reloading the config file...");
        MobFX.plugin.reloadConfig();
        ImmunityItem.GenerateRecipe();
        return true;
    }
}
