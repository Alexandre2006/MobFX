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
        if (Toggled) {
            if (event.getEntity() instanceof Player) {
                //Get Config
                FileConfiguration config = Mobfx.plugin.getConfig();
                // Setup Variables
                Player player = (Player) event.getEntity();
                Entity damager = event.getDamager();
                // Check if Immunity Item is enabled
                if (!(config.getBoolean("IMMUNITY_ITEM"))) {
                    giveEffect(player, damager, config);
                }
                // Check if player has Immunity Item
                else {
                    if (!(player.getInventory().contains(ImmunityItem.ImmunityItem))) {
                        giveEffect(player, damager, config);
                    }
                }
            }
        }
    }
    public static void giveEffect(Player player, Entity damager, FileConfiguration config) {
        try {
            if (damager.getType() == EntityType.BEE) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT"))).getAmplifier();if (strength < config.getInt("BEE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.BLAZE) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT")), config.getInt("BLAZE.DURATION"), config.getInt("BLAZE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT"))).getAmplifier();if (strength < config.getInt("BLAZE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT")), config.getInt("BLAZE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.CAVE_SPIDER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("CAVE_SPIDER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("CAVE_SPIDER.EFFECT")), config.getInt("CAVE_SPIDER.DURATION"), config.getInt("CAVE_SPIDER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("CAVE_SPIDER.EFFECT"))).getAmplifier();if (strength < config.getInt("CAVE_SPIDER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("CAVE_SPIDER.EFFECT")), config.getInt("CAVE_SPIDER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.CREEPER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("CREEPER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("CREEPER.EFFECT")), config.getInt("CREEPER.DURATION"), config.getInt("CREEPER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("CREEPER.EFFECT"))).getAmplifier();if (strength < config.getInt("CREEPER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("CREEPER.EFFECT")), config.getInt("CREEPER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.DOLPHIN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("DOLPHIN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DOLPHIN.EFFECT")), config.getInt("DOLPHIN.DURATION"), config.getInt("DOLPHIN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("DOLPHIN.EFFECT"))).getAmplifier();if (strength < config.getInt("DOLPHIN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DOLPHIN.EFFECT")), config.getInt("DOLPHIN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.DROWNED) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT")), config.getInt("DROWNED.DURATION"), config.getInt("DROWNED.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT"))).getAmplifier();if (strength < config.getInt("DROWNED.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT")), config.getInt("DROWNED.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ELDER_GUARDIAN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ELDER_GUARDIAN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ELDER_GUARDIAN.EFFECT")), config.getInt("ELDER_GUARDIAN.DURATION"), config.getInt("ELDER_GUARDIAN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ELDER_GUARDIAN.EFFECT"))).getAmplifier();if (strength < config.getInt("ELDER_GUARDIAN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ELDER_GUARDIAN.EFFECT")), config.getInt("ELDER_GUARDIAN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ENDER_DRAGON) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT")), config.getInt("ENDER_DRAGON.DURATION"), config.getInt("ENDER_DRAGON.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT"))).getAmplifier();if (strength < config.getInt("ENDER_DRAGON.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT")), config.getInt("ENDER_DRAGON.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ENDERMAN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ENDERMAN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDERMAN.EFFECT")), config.getInt("ENDERMAN.DURATION"), config.getInt("ENDERMAN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ENDERMAN.EFFECT"))).getAmplifier();if (strength < config.getInt("ENDERMAN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDERMAN.EFFECT")), config.getInt("ENDERMAN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ENDERMITE) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ENDERMITE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDERMITE.EFFECT")), config.getInt("ENDERMITE.DURATION"), config.getInt("ENDERMITE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ENDERMITE.EFFECT"))).getAmplifier();if (strength < config.getInt("ENDERMITE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDERMITE.EFFECT")), config.getInt("ENDERMITE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.EVOKER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("EVOKER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("EVOKER.EFFECT")), config.getInt("EVOKER.DURATION"), config.getInt("EVOKER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("EVOKER.EFFECT"))).getAmplifier();if (strength < config.getInt("EVOKER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("EVOKER.EFFECT")), config.getInt("EVOKER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.EVOKER_FANGS) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("EVOKER_FANGS.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("EVOKER_FANGS.EFFECT")), config.getInt("EVOKER_FANGS.DURATION"), config.getInt("EVOKER_FANGS.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("EVOKER_FANGS.EFFECT"))).getAmplifier();if (strength < config.getInt("EVOKER_FANGS.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("EVOKER_FANGS.EFFECT")), config.getInt("EVOKER_FANGS.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.FOX) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("FOX.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("FOX.EFFECT")), config.getInt("FOX.DURATION"), config.getInt("FOX.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("FOX.EFFECT"))).getAmplifier();if (strength < config.getInt("FOX.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("FOX.EFFECT")), config.getInt("FOX.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.GHAST) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT")), config.getInt("GHAST.DURATION"), config.getInt("GHAST.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT"))).getAmplifier();if (strength < config.getInt("GHAST.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT")), config.getInt("GHAST.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.GUARDIAN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("GUARDIAN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GUARDIAN.EFFECT")), config.getInt("GUARDIAN.DURATION"), config.getInt("GUARDIAN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("GUARDIAN.EFFECT"))).getAmplifier();if (strength < config.getInt("GUARDIAN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GUARDIAN.EFFECT")), config.getInt("GUARDIAN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.HOGLIN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("HOGLIN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("HOGLIN.EFFECT")), config.getInt("HOGLIN.DURATION"), config.getInt("HOGLIN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("HOGLIN.EFFECT"))).getAmplifier();if (strength < config.getInt("HOGLIN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("HOGLIN.EFFECT")), config.getInt("HOGLIN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.HUSK) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("HUSK.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("HUSK.EFFECT")), config.getInt("HUSK.DURATION"), config.getInt("HUSK.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("HUSK.EFFECT"))).getAmplifier();if (strength < config.getInt("HUSK.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("HUSK.EFFECT")), config.getInt("HUSK.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ILLUSIONER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT")), config.getInt("ILLUSIONER.DURATION"), config.getInt("ILLUSIONER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT"))).getAmplifier();if (strength < config.getInt("ILLUSIONER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT")), config.getInt("ILLUSIONER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.IRON_GOLEM) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("IRON_GOLEM.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("IRON_GOLEM.EFFECT")), config.getInt("IRON_GOLEM.DURATION"), config.getInt("IRON_GOLEM.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("IRON_GOLEM.EFFECT"))).getAmplifier();if (strength < config.getInt("IRON_GOLEM.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("IRON_GOLEM.EFFECT")), config.getInt("IRON_GOLEM.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.RABBIT) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("RABBIT.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("RABBIT.EFFECT")), config.getInt("RABBIT.DURATION"), config.getInt("RABBIT.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("RABBIT.EFFECT"))).getAmplifier();if (strength < config.getInt("RABBIT.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("RABBIT.EFFECT")), config.getInt("RABBIT.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.LLAMA_SPIT) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("LLAMA.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("LLAMA.EFFECT")), config.getInt("LLAMA.DURATION"), config.getInt("LLAMA.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("LLAMA.EFFECT"))).getAmplifier();if (strength < config.getInt("LLAMA.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("LLAMA.EFFECT")), config.getInt("LLAMA.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.MAGMA_CUBE) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("MAGMA_CUBE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("MAGMA_CUBE.EFFECT")), config.getInt("MAGMA_CUBE.DURATION"), config.getInt("MAGMA_CUBE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("MAGMA_CUBE.EFFECT"))).getAmplifier();if (strength < config.getInt("MAGMA_CUBE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("MAGMA_CUBE.EFFECT")), config.getInt("MAGMA_CUBE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.PANDA) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PANDA.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PANDA.EFFECT")), config.getInt("PANDA.DURATION"), config.getInt("PANDA.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PANDA.EFFECT"))).getAmplifier();if (strength < config.getInt("PANDA.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PANDA.EFFECT")), config.getInt("PANDA.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.PHANTOM) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PHANTOM.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PHANTOM.EFFECT")), config.getInt("PHANTOM.DURATION"), config.getInt("PHANTOM.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PHANTOM.EFFECT"))).getAmplifier();if (strength < config.getInt("PHANTOM.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PHANTOM.EFFECT")), config.getInt("PHANTOM.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.PIGLIN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PIGLIN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PIGLIN.EFFECT")), config.getInt("PIGLIN.DURATION"), config.getInt("PIGLIN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PIGLIN.EFFECT"))).getAmplifier();if (strength < config.getInt("PIGLIN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PIGLIN.EFFECT")), config.getInt("PIGLIN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.PIGLIN_BRUTE) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PIGLIN_BRUTE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PIGLIN_BRUTE.EFFECT")), config.getInt("PIGLIN_BRUTE.DURATION"), config.getInt("PIGLIN_BRUTE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PIGLIN_BRUTE.EFFECT"))).getAmplifier();if (strength < config.getInt("PIGLIN_BRUTE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PIGLIN_BRUTE.EFFECT")), config.getInt("PIGLIN_BRUTE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.PILLAGER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT")), config.getInt("PILLAGER.DURATION"), config.getInt("PILLAGER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT"))).getAmplifier();if (strength < config.getInt("PILLAGER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT")), config.getInt("PILLAGER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.POLAR_BEAR) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("POLAR_BEAR.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("POLAR_BEAR.EFFECT")), config.getInt("POLAR_BEAR.DURATION"), config.getInt("POLAR_BEAR.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("POLAR_BEAR.EFFECT"))).getAmplifier();if (strength < config.getInt("POLAR_BEAR.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("POLAR_BEAR.EFFECT")), config.getInt("POLAR_BEAR.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.PUFFERFISH) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PUFFERFISH.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PUFFERFISH.EFFECT")), config.getInt("PUFFERFISH.DURATION"), config.getInt("PUFFERFISH.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PUFFERFISH.EFFECT"))).getAmplifier();if (strength < config.getInt("PUFFERFISH.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PUFFERFISH.EFFECT")), config.getInt("PUFFERFISH.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.RAVAGER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("RAVAGER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("RAVAGER.EFFECT")), config.getInt("RAVAGER.DURATION"), config.getInt("RAVAGER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("RAVAGER.EFFECT"))).getAmplifier();if (strength < config.getInt("RAVAGER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("RAVAGER.EFFECT")), config.getInt("RAVAGER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.SHULKER_BULLET) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("SHULKER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SHULKER.EFFECT")), config.getInt("SHULKER.DURATION"), config.getInt("SHULKER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("SHULKER.EFFECT"))).getAmplifier();if (strength < config.getInt("SHULKER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SHULKER.EFFECT")), config.getInt("SHULKER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.SILVERFISH) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("SILVERFISH.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SILVERFISH.EFFECT")), config.getInt("SILVERFISH.DURATION"), config.getInt("SILVERFISH.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("SILVERFISH.EFFECT"))).getAmplifier();if (strength < config.getInt("SILVERFISH.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SILVERFISH.EFFECT")), config.getInt("SILVERFISH.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.SKELETON) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT")), config.getInt("SKELETON.DURATION"), config.getInt("SKELETON.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT"))).getAmplifier();if (strength < config.getInt("SKELETON.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT")), config.getInt("SKELETON.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.SLIME) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("SLIME.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SLIME.EFFECT")), config.getInt("SLIME.DURATION"), config.getInt("SLIME.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("SLIME.EFFECT"))).getAmplifier();if (strength < config.getInt("SLIME.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SLIME.EFFECT")), config.getInt("SLIME.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.SPIDER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("SPIDER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SPIDER.EFFECT")), config.getInt("SPIDER.DURATION"), config.getInt("SPIDER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("SPIDER.EFFECT"))).getAmplifier();if (strength < config.getInt("SPIDER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SPIDER.EFFECT")), config.getInt("SPIDER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.STRAY) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT")), config.getInt("STRAY.DURATION"), config.getInt("STRAY.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT"))).getAmplifier();if (strength < config.getInt("STRAY.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT")), config.getInt("STRAY.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.VEX) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("VEX.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("VEX.EFFECT")), config.getInt("VEX.DURATION"), config.getInt("VEX.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("VEX.EFFECT"))).getAmplifier();if (strength < config.getInt("VEX.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("VEX.EFFECT")), config.getInt("VEX.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.VINDICATOR) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("VINDICATOR.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT"))).getAmplifier();if (strength < config.getInt("BEE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.WITCH) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("WITCH.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITCH.EFFECT")), config.getInt("WITCH.DURATION"), config.getInt("WITCH.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("WITCH.EFFECT"))).getAmplifier();if (strength < config.getInt("WITCH.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITCH.EFFECT")), config.getInt("WITCH.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.WITHER_SKELETON) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("WITHER_SKELETON.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER_SKELETON.EFFECT")), config.getInt("WITHER_SKELETON.DURATION"), config.getInt("WITHER_SKELETON.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("WITHER_SKELETON.EFFECT"))).getAmplifier();if (strength < config.getInt("WITHER_SKELETON.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER_SKELETON.EFFECT")), config.getInt("WITHER_SKELETON.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.WITHER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT")), config.getInt("WITHER.DURATION"), config.getInt("WITHER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT"))).getAmplifier();if (strength < config.getInt("WITHER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT")), config.getInt("WITHER.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.WOLF) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("WOLF.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WOLF.EFFECT")), config.getInt("WOLF.DURATION"), config.getInt("WOLF.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("WOLF.EFFECT"))).getAmplifier();if (strength < config.getInt("WOLF.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WOLF.EFFECT")), config.getInt("WOLF.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ZOGLIN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ZOGLIN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOGLIN.EFFECT")), config.getInt("ZOGLIN.DURATION"), config.getInt("ZOGLIN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ZOGLIN.EFFECT"))).getAmplifier();if (strength < config.getInt("ZOGLIN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOGLIN.EFFECT")), config.getInt("ZOGLIN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ZOMBIE) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ZOMBIE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIE.EFFECT")), config.getInt("ZOMBIE.DURATION"), config.getInt("ZOMBIE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ZOMBIE.EFFECT"))).getAmplifier();if (strength < config.getInt("ZOMBIE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIE.EFFECT")), config.getInt("ZOMBIE.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ZOMBIFIED_PIGLIN) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ZOMBIFIED_PIGLIN.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIFIED_PIGLIN.EFFECT")), config.getInt("ZOMBIFIED_PIGLIN.DURATION"), config.getInt("ZOMBIFIED_PIGLIN.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ZOMBIFIED_PIGLIN.EFFECT"))).getAmplifier();if (strength < config.getInt("ZOMBIFIED_PIGLIN.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ZOMBIFIED_PIGLIN.EFFECT")), config.getInt("ZOMBIFIED_PIGLIN.DURATION"), strength + 1));
                    }
                }
            }
            else if (damager.getType() == EntityType.ZOMBIE_VILLAGER) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), config.getInt("BEE.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT"))).getAmplifier();if (strength < config.getInt("BEE.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BEE.EFFECT")), config.getInt("BEE.DURATION"), strength + 1));
                    }
                }
            }

            //ALL ANNOYING ENTITIES HERE
            else if (damager.getType() == EntityType.SMALL_FIREBALL) {
                Projectile Fireball = (Projectile) damager;
                if (String.valueOf(Fireball.getShooter()) == "CraftBlaze"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT")), config.getInt("BLAZE.DURATION"), config.getInt("BLAZE.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT"))).getAmplifier();if (strength < config.getInt("BLAZE.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("BLAZE.EFFECT")), config.getInt("BLAZE.DURATION"), strength + 1));
                        }
                    }
                }
            }
            else if (damager.getType() == EntityType.TRIDENT) {
                Projectile Trident = (Projectile) damager;
                if (String.valueOf(Trident.getShooter()) == "CraftDrowned") {
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT")), config.getInt("DROWNED.DURATION"), config.getInt("DROWNED.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT"))).getAmplifier();if (strength < config.getInt("DROWNED.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("DROWNED.EFFECT")), config.getInt("DROWNED.DURATION"), strength + 1));
                        }
                    }
                }
            }
            else if (damager.getType() == EntityType.AREA_EFFECT_CLOUD) {
                AreaEffectCloud cloud = (AreaEffectCloud) damager;
                if (String.valueOf(cloud.getSource()) == "CraftEnderDragon"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT")), config.getInt("ENDER_DRAGON.DURATION"), config.getInt("ENDER_DRAGON.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT"))).getAmplifier();if (strength < config.getInt("ENDER_DRAGON.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ENDER_DRAGON.EFFECT")), config.getInt("ENDER_DRAGON.DURATION"), strength + 1));
                        }
                    }
                }
            }
            else if (damager.getType() == EntityType.FIREBALL) {
                Projectile Fireball = (Projectile) damager;
                if (String.valueOf(Fireball.getShooter()) == "CraftGhast"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT")), config.getInt("GHAST.DURATION"), config.getInt("GHAST.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT"))).getAmplifier();if (strength < config.getInt("GHAST.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("GHAST.EFFECT")), config.getInt("GHAST.DURATION"), strength + 1));
                        }
                    }
                }
            }
            else if (damager.getType() == EntityType.ARROW) {
                Projectile Fireball = (Projectile) damager;
                if (String.valueOf(Fireball.getShooter()) == "CraftIllusioner"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT")), config.getInt("ILLUSIONER.DURATION"), config.getInt("ILLUSIONER.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT"))).getAmplifier();if (strength < config.getInt("ILLUSIONER.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("ILLUSIONER.EFFECT")), config.getInt("ILLUSIONER.DURATION"), strength + 1));
                        }
                    }
                }
                else if (String.valueOf(Fireball.getShooter()) == "CraftPillager"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT")), config.getInt("PILLAGER.DURATION"), config.getInt("PILLAGER.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT"))).getAmplifier();if (strength < config.getInt("PILLAGER.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("PILLAGER.EFFECT")), config.getInt("PILLAGER.DURATION"), strength + 1));
                        }
                    }
                }
                else if (String.valueOf(Fireball.getShooter()) == "CraftSkeleton"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT")), config.getInt("SKELETON.DURATION"), config.getInt("SKELETON.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT"))).getAmplifier();if (strength < config.getInt("SKELETON.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("SKELETON.EFFECT")), config.getInt("SKELETON.DURATION"), strength + 1));
                        }
                    }
                }
                else if (String.valueOf(Fireball.getShooter()) == "CraftStray"){
                    if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT")), config.getInt("STRAY.DURATION"), config.getInt("STRAY.BASESTRENGTH")));
                    }
                    if (config.getBoolean("INCREASING_STRENGTH")) {
                        int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT"))).getAmplifier();if (strength < config.getInt("STRAY.MAXSTRENGTH")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("STRAY.EFFECT")), config.getInt("STRAY.DURATION"), strength + 1));
                        }
                    }
                }
            }
            else if (damager.getType() == EntityType.WITHER_SKULL) {
                if ((player.hasPotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT"))) == false) || (config.getBoolean("INCREASING_STRENGTH") == false)){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT")), config.getInt("WITHER.DURATION"), config.getInt("WITHER.BASESTRENGTH")));
                }
                if (config.getBoolean("INCREASING_STRENGTH")) {
                    int strength = player.getPotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT"))).getAmplifier();if (strength < config.getInt("WITHER.MAXSTRENGTH")) {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.getByName(config.getString("WITHER.EFFECT")), config.getInt("WITHER.DURATION"), strength + 1));
                    }
                }
            }
        } catch (Exception e) {
            Mobfx.plugin.getLogger().warning("Your configuration file seems to be broken or have missing slots. Please fix this ASAP.");
        }
    }
}


