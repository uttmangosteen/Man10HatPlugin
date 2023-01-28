package io.github.uttmangosteen.man10hatplugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String alias, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("プレイヤーでないと実行できません");
            return true;
        }
        Player player = (Player) sender;
        ItemStack hand = player.getInventory().getItemInMainHand();
        ItemStack helmet = player.getInventory().getHelmet();
        player.getInventory().setItemInMainHand(helmet);
        player.getInventory().setHelmet(hand);
        player.updateInventory();
        player.sendMessage("§f§l[§d§lm§a§lhat§f§l]§d頭にかぶりました§f");
        return true;
    }
}
