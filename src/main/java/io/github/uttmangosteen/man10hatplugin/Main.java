package io.github.uttmangosteen.man10hatplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {



    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Event(), this);

        getCommand("mhat").setExecutor(new Command());
    }

    public void onDisable() {}
}