package com.thinkalex.mobfx.mobfx;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.awt.geom.Area;

public class DamageDetection implements Listener {

    //Enable or disabled
    public static Boolean Toggled = true;


    @EventHandler
    public void EntityDamageEntity(EntityDamageByEntityEvent event) {
        //Get Config
        FileConfiguration config = Mobfx.plugin.getConfig();
        if (Toggled) {
            if (event.getEntity() instanceof Player) {
                Player player = (Player) event.getEntity();
                Entity damager = event.getDamager();
                try {
                    if (damager.getType() == EntityType.BEE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.BLAZE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT")), config.getInt("BLAZE.DURATION"), config.getInt("BLAZE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.CAVE_SPIDER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("CAVE_SPIDER.EFFECT")), config.getInt("CAVE_SPIDER.DURATION"), config.getInt("CAVE_SPIDER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.CREEPER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("CREEPER.EFFECT")), config.getInt("CREEPER.DURATION"), config.getInt("CREEPER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.DOLPHIN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DOLPHIN.EFFECT")), config.getInt("DOLPHIN.DURATION"), config.getInt("DOLPHIN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.DROWNED) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT")), config.getInt("DROWNED.DURATION"), config.getInt("DROWNED.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ELDER_GUARDIAN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ELDER_GUARDIAN.EFFECT")), config.getInt("ELDER_GUARDIAN.DURATION"), config.getInt("ELDER_GUARDIAN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ENDER_DRAGON) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT")), config.getInt("ENDER_DRAGON.DURATION"), config.getInt("ENDER_DRAGON.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ENDERMAN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDERMAN.EFFECT")), config.getInt("ENDERMAN.DURATION"), config.getInt("ENDERMAN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ENDERMITE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDERMITE.EFFECT")), config.getInt("ENDERMITE.DURATION"), config.getInt("ENDERMITE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.EVOKER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("EVOKER.EFFECT")), config.getInt("EVOKER.DURATION"), config.getInt("EVOKER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.EVOKER_FANGS) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("EVOKER.EFFECT")), config.getInt("EVOKER.DURATION"), config.getInt("EVOKER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.FOX) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("FOX.EFFECT")), config.getInt("FOX.DURATION"), config.getInt("FOX.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.GHAST) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT")), config.getInt("GHAST.DURATION"), config.getInt("GHAST.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.GUARDIAN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GUARDIAN.EFFECT")), config.getInt("GUARDIAN.DURATION"), config.getInt("GUARDIAN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.HOGLIN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("HOGLIN.EFFECT")), config.getInt("HOGLIN.DURATION"), config.getInt("HOGLIN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.HUSK) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("HUSK.EFFECT")), config.getInt("HUSK.DURATION"), config.getInt("HUSK.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ILLUSIONER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT")), config.getInt("ILLUSIONER.DURATION"), config.getInt("ILLUSIONER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.IRON_GOLEM) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("IRON_GOLEM.EFFECT")), config.getInt("IRON_GOLEM.DURATION"), config.getInt("IRON_GOLEM.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.RABBIT) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("RABBIT.EFFECT")), config.getInt("RABBIT.DURATION"), config.getInt("RABBIT.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.LLAMA_SPIT) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("LLAMA.EFFECT")), config.getInt("LLAMA.DURATION"), config.getInt("LLAMA.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.MAGMA_CUBE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("MAGMA_CUBE.EFFECT")), config.getInt("MAGMA_CUBE.DURATION"), config.getInt("MAGMA_CUBE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.PANDA) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PANDA.EFFECT")), config.getInt("PANDA.DURATION"), config.getInt("PANDA.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.PHANTOM) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PHANTOM.EFFECT")), config.getInt("PHANTOM.DURATION"), config.getInt("PHANTOM.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.PIGLIN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PIGLIN.EFFECT")), config.getInt("PIGLIN.DURATION"), config.getInt("PIGLIN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.PIGLIN_BRUTE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PIGLIN_BRUTE.EFFECT")), config.getInt("PIGLIN_BRUTE.DURATION"), config.getInt("PIGLIN_BRUTE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.PILLAGER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT")), config.getInt("PILLAGER.DURATION"), config.getInt("PILLAGER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.POLAR_BEAR) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("POLAR_BEAR.EFFECT")), config.getInt("POLAR_BEAR.DURATION"), config.getInt("POLAR_BEAR.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.PUFFERFISH) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PUFFERFISH.EFFECT")), config.getInt("PUFFERFISH.DURATION"), config.getInt("PUFFERFISH.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.RAVAGER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("RAVAGER.EFFECT")), config.getInt("RAVAGER.DURATION"), config.getInt("RAVAGER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.SHULKER_BULLET) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.SILVERFISH) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SILVERFISH.EFFECT")), config.getInt("SILVERFISH.DURATION"), config.getInt("SILVERFISH.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.SKELETON) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT")), config.getInt("SKELETON.DURATION"), config.getInt("SKELETON.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.SLIME) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SLIME.EFFECT")), config.getInt("SLIME.DURATION"), config.getInt("SLIME.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.SPIDER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SPIDER.EFFECT")), config.getInt("SPIDER.DURATION"), config.getInt("SPIDER.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.STRAY) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT")), config.getInt("STRAY.DURATION"), config.getInt("STRAY.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.VEX) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("VEX.EFFECT")), config.getInt("VEX.DURATION"), config.getInt("VEX.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.VINDICATOR) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("VINDICATOR.EFFECT")), config.getInt("VINDICATOR.DURATION"), config.getInt("VINDICATOR.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.WITCH) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITCH.EFFECT")), config.getInt("WITCH.DURATION"), config.getInt("WITCH.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.WITHER_SKELETON) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.WITHER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.WOLF) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WOLF.EFFECT")), config.getInt("WOLF.DURATION"), config.getInt("WOLF.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ZOGLIN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOGLIN.EFFECT")), config.getInt("ZOGLIN.DURATION"), config.getInt("ZOGLIN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ZOMBIE) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIE.EFFECT")), config.getInt("ZOMBIE.DURATION"), config.getInt("ZOMBIE.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ZOMBIFIED_PIGLIN) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIFIED_PIGLIN.EFFECT")), config.getInt("ZOMBIFIED_PIGLIN.DURATION"), config.getInt("ZOMBIFIED_PIGLIN.STRENGTH")));
                    }
                    else if (damager.getType() == EntityType.ZOMBIE_VILLAGER) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIE_VILLAGER.EFFECT")), config.getInt("ZOMBIE_VILLAGER.DURATION"), config.getInt("ZOMBIE_VILLAGER.STRENGTH")));
                    }

                    //ALL ANNOYING ENTITIES HERE
                    else if (damager.getType() == EntityType.SMALL_FIREBALL) {
                        Projectile Fireball = (Projectile) damager;
                        if (String.valueOf(Fireball.getShooter()) == "CraftBlaze"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT")), config.getInt("BLAZE.DURATION"), config.getInt("BLAZE.STRENGTH")));
                        }
                    }
                    else if (damager.getType() == EntityType.TRIDENT) {
                        Projectile Trident = (Projectile) damager;
                        if (String.valueOf(Trident.getShooter()) == "CraftDrowned") {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT")), config.getInt("DROWNED.DURATION"), config.getInt("DROWNED.STRENGTH")));
                        }
                    }
                    else if (damager.getType() == EntityType.AREA_EFFECT_CLOUD) {
                        AreaEffectCloud cloud = (AreaEffectCloud) damager;
                        if (String.valueOf(cloud.getSource()) == "CraftEnderDragon"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT")), config.getInt("ENDER_DRAGON.DURATION"), config.getInt("ENDER_DRAGON.STRENGTH")));
                        }
                    }
                    else if (damager.getType() == EntityType.FIREBALL) {
                        Projectile Fireball = (Projectile) damager;
                        if (String.valueOf(Fireball.getShooter()) == "CraftGhast"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT")), config.getInt("GHAST.DURATION"), config.getInt("GHAST.STRENGTH")));
                        }
                    }
                    else if (damager.getType() == EntityType.ARROW) {
                        Projectile Fireball = (Projectile) damager;
                        if (String.valueOf(Fireball.getShooter()) == "CraftIllusioner"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT")), config.getInt("ILLUSIONER.DURATION"), config.getInt("ILLUSIONER.STRENGTH")));
                        }
                        else if (String.valueOf(Fireball.getShooter()) == "CraftPillager"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT")), config.getInt("PILLAGER.DURATION"), config.getInt("PILLAGER.STRENGTH")));
                        }
                        else if (String.valueOf(Fireball.getShooter()) == "CraftSkeleton"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT")), config.getInt("SKELETON.DURATION"), config.getInt("SKELETON.STRENGTH")));
                        }
                        else if (String.valueOf(Fireball.getShooter()) == "CraftStray"){
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT")), config.getInt("STRAY.DURATION"), config.getInt("STRAY.STRENGTH")));
                        }
                    }
                    else if (damager.getType() == EntityType.WITHER_SKULL) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT")), config.getInt("WITHER.DURATION"), config.getInt("WITHER.STRENGTH")));
                    }
                } catch (Exception e) {
                    Mobfx.plugin.getLogger().warning("Your configuration file seems to be broken or have missing slots. Please fix this ASAP.");
                }

            }
        }
    }
}
