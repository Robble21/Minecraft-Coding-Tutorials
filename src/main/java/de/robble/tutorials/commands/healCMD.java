package de.robble.tutorials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class healCMD implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            Player target = Bukkit.getPlayerExact(args[0]);
            if(player.isOp()) {
                if (args.length == 1) {
                    target.setHealth(20d);
                    target.setFoodLevel(20);
                }
                else {
                    player.setHealth(20d);
                    player.setFoodLevel(20);
                }
            }else {
                player.sendMessage("§cKeine Rechte!");
            }
        }
        return false;
    }
}
