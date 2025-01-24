package io.github.uttmangosteen.man10hatplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Event(), this);
        Objects.requireNonNull(getCommand("mhat")).setExecutor(new Command());
    }
}