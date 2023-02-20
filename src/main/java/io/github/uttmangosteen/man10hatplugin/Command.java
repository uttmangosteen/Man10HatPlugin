package io.github.uttmangosteen.man10hatplugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String alias, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§4プレイヤーでないと実行できません");
            return true;
        }
        Player player = (Player) sender;
        if(player.hasPermission("red.man10.mhat")){
            ItemStack hand = player.getInventory().getItemInMainHand();
            ItemStack helmet = player.getInventory().getHelmet();
            player.getInventory().setItemInMainHand(helmet);
            player.getInventory().setHelmet(hand);
            player.updateInventory();
            player.sendMessage("§f§l[§d§lm§a§lhat§f§l]§a頭にかぶりました§f");
        } else {
            player.sendMessage("§f§l[§d§lm§a§lhat§f§l]§4あなたは権限を持っていません§f");
        }
        return true;
    }
}
