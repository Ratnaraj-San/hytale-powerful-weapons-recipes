package com.ratnaraj.powerfulweaponsrecipes;

import java.util.logging.Level;

import javax.annotation.Nonnull;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

public class PowerfulWeaponsRecipes extends JavaPlugin {

    private static PowerfulWeaponsRecipes instance;

    public PowerfulWeaponsRecipes(@Nonnull JavaPluginInit init) {
        super(init);
        instance = this;
    }

    public static PowerfulWeaponsRecipes getInstance() {
        return instance;
    }

    @Override
    protected void setup() {
        // Data-only mod: items, recipes, drops and translations are loaded
        // from the embedded asset pack (src/main/resources).
    }

    @Override
    protected void start() {
        getLogger().at(Level.INFO).log("[PowerfulWeaponsRecipes] Plugin enabled!");
    }

    @Override
    public void shutdown() {
        getLogger().at(Level.INFO).log("[PowerfulWeaponsRecipes] Plugin disabled!");
    }
}
