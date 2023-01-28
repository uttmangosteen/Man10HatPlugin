package io.github.uttmangosteen.man10hatplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public void onEnable() {
        getCommand("mhat").setExecutor(new Command());

        Event event = new Event(this);
        this.getServer().getPluginManager().registerEvents(event, this);
    }

    public void onDisable() {}
}