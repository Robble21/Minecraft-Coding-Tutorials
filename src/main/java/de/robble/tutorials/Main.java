package de.robble.tutorials;

import de.robble.tutorials.commands.healCMD;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void Register(){
        Bukkit.getPluginCommand("heal").setExecutor(new healCMD());
    }
}
