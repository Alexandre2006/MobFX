package com.thinkalex.mobfx.mobfx;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Iterator;

public class DamageDetection implements Listener {

  // Enable or disabled
  public static Boolean Toggled = true;

  @EventHandler
  public void EntityDamageEntity(EntityDamageByEntityEvent event) {
    if (Toggled) {
      if (event.getEntity() instanceof Player) {

        // Get Config
        FileConfiguration config = MobFX.plugin.getConfig();

        // Setup Variables
        Player player = (Player) event.getEntity();
        Entity damager = event.getDamager();

        // Check if Immunity Item is enabled
        if (!(config.getBoolean("IMMUNITY_ITEM"))) {
          getMob(player, damager, config);
        }

        // Check if player has Immunity Item
        else {
          if (!(player.getInventory().contains(ImmunityItem.ImmunityItem))) {
            getMob(player, damager, config);
          }
        }
      }
    }
  }
  @EventHandler
  public void PotionSplashed(PotionSplashEvent e){
    if (String.valueOf(e.getPotion().getShooter()) == "CraftWitch") {
      for (LivingEntity livingEntity : e.getAffectedEntities()) {
        if (livingEntity instanceof Player) {
          doAction((Player) livingEntity, "WITCH", MobFX.plugin.getConfig());
        }
      }
    }
  }

  public void getMob(Player player, Entity damager, FileConfiguration config) {
    EntityType type = damager.getType();
    // Check For Weird Entities
    switch (type) {
      case SMALL_FIREBALL:
        {
          Projectile Fireball = (Projectile) damager;
          if (String.valueOf(Fireball.getShooter()) == "CraftBlaze") {
            doAction(player, "BLAZE", config);
          }
        }
      case TRIDENT:
        {
          Projectile Trident = (Projectile) damager;
          if (String.valueOf(Trident.getShooter()) == "CraftDrowned") {
            doAction(player, "DROWNED", config);
          }
        }
      case AREA_EFFECT_CLOUD:
        {
          AreaEffectCloud cloud = (AreaEffectCloud) damager;
          if (String.valueOf(cloud.getSource()) == "CraftEnderDragon") {
            doAction(player, "ENDER_DRAGON", config);
          }
        }
      case FIREBALL:
        {
          Projectile Fireball = (Projectile) damager;
          if (String.valueOf(Fireball.getShooter()) == "CraftGhast") {
            doAction(player, "GHAST", config);
          }
        }
      case ARROW:
        {
          Projectile Arrow = (Projectile) damager;
          if (String.valueOf(Arrow.getShooter()) == "CraftIllusioner") {
            doAction(player, "ILLUSIONER", config);
          } else if (String.valueOf(Arrow.getShooter()) == "CraftPillager") {
            doAction(player, "PILLAGER", config);
          } else if (String.valueOf(Arrow.getShooter()) == "CraftSkeleton") {
            doAction(player, "SKELETON", config);
          } else if (String.valueOf(Arrow.getShooter()) == "CraftStray") {
            doAction(player, "STRAY", config);
          }
        }
      case WITHER_SKULL:
        {
          doAction(player, damager + "", config);
        }
      case SHULKER_BULLET:
        {
          doAction(player, "SHULKER", config);
        }
      case SPLASH_POTION:
        {
        break;
        }
      default:
        {
          doAction(player, String.valueOf(type).toUpperCase(), config);
        }
    }
  }

  public void doAction(Player player, String damager, FileConfiguration config) {
    try {
        if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString(damager + ".EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString(damager + ".EFFECT")), config.getInt(damager + ".DURATION"), config.getInt(damager + ".BASESTRENGTH") - 1));
        }
        if (config.getBoolean("INCREASING_STRENGTH")) {
            int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString(damager + ".EFFECT"))).getAmplifier();
            if (strength < config.getInt(damager + ".MAXSTRENGTH") - 1) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString(damager + ".EFFECT")), config.getInt(damager + ".DURATION"), strength + 1));
                player.sendMessage(String.valueOf(player.getPotionEffect(PotionEffectType.getByName(config.getString(damager + ".EFFECT"))).getAmplifier()));
            }
        }
    } catch (Exception e) {
        MobFX.plugin.getLogger().warning("Something went wrong! Please make sure that all the blanks are filled in your config. Otherwise, send this error to the plugin developer:");
        MobFX.plugin.getLogger().severe(String.valueOf(e));
    }
  }
}
