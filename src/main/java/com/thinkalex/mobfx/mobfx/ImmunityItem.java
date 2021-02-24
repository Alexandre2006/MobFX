package com.thinkalex.mobfx.mobfx;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import javax.xml.stream.events.Namespace;
import java.util.Collections;

public class ImmunityItem {
    //Item
    public static ItemStack ImmunityItem;

    public static void GenerateRecipe() {
        try{
            // Reset Recipes
            Mobfx.plugin.getServer().resetRecipes();
            //Get Config
            FileConfiguration config = Mobfx.plugin.getConfig();
            // Create ItemStack
            ImmunityItem = new ItemStack(Material.getMaterial(config.getString("ITEM")));
            ItemMeta ImmunityMeta = ImmunityItem.getItemMeta();
            ImmunityMeta.setLore(Collections.singletonList(config.getString("LORE")));
            ImmunityMeta.setDisplayName(config.getString("NAME"));
            if (config.getBoolean("ENCHANTED")) {
                ImmunityMeta.addEnchant(Enchantment.LUCK, 1, true);
                ImmunityMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            }
            ImmunityItem.setItemMeta(ImmunityMeta);
            // Create Recipe
            NamespacedKey key = new NamespacedKey(Mobfx.plugin, "immunity_item");
            ShapedRecipe ImmunityRecipe = new ShapedRecipe(key, ImmunityItem);
            ImmunityRecipe.shape("123","456","789");
            ImmunityRecipe.setIngredient('1', Material.getMaterial(config.getString("RECIPE.1")));
            ImmunityRecipe.setIngredient('2', Material.getMaterial(config.getString("RECIPE.2")));
            ImmunityRecipe.setIngredient('3', Material.getMaterial(config.getString("RECIPE.3")));
            ImmunityRecipe.setIngredient('4', Material.getMaterial(config.getString("RECIPE.4")));
            ImmunityRecipe.setIngredient('5', Material.getMaterial(config.getString("RECIPE.5")));
            ImmunityRecipe.setIngredient('6', Material.getMaterial(config.getString("RECIPE.6")));
            ImmunityRecipe.setIngredient('7', Material.getMaterial(config.getString("RECIPE.7")));
            ImmunityRecipe.setIngredient('8', Material.getMaterial(config.getString("RECIPE.8")));
            ImmunityRecipe.setIngredient('9', Material.getMaterial(config.getString("RECIPE.9")));
            // Enable Recipe
            Mobfx.plugin.getServer().addRecipe(ImmunityRecipe);
        } catch (Exception e) {
            Mobfx.plugin.getLogger().info("Looks like your Immunity Item configuration is wrong. Please fix this as soon as possible.");
        }
    }
}
