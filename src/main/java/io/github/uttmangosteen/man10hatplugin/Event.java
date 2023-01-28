package io.github.uttmangosteen.man10hatplugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class Event implements Listener {
    private final Main plugin;

    public Event(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onClickHead(InventoryClickEvent e) {
        if (e.getSlotType() == InventoryType.SlotType.ARMOR && e.getRawSlot() == 5 && e.getWhoClicked().getItemOnCursor().getType() != Material.AIR && e.getWhoClicked().getItemOnCursor().getType().getEquipmentSlot() != EquipmentSlot.HEAD) {
            Player player = (Player) e.getWhoClicked();
            ItemStack cursor = player.getItemOnCursor();
            ItemStack head = player.getInventory().getHelmet();
            new BukkitRunnable(){
                @Override
                public void run() {
                    player.setItemOnCursor(head);
                    player.getInventory().setHelmet(cursor);
                }
            }.runTaskLater(plugin, 0);
        }
    }
}