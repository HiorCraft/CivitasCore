package de.HiorCraft.smp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.ConsoleCommandSender;

public class credits implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {

        if( sender instanceof ConsoleCommandSender) {
            sender.sendMessage("Dieser Befehl kann nicht von der Konsole ausgefuehrt werden.");
            return true;
        }

        if (sender.hasPermission("info")) {
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "Dieses Plugin ist von HiorCraft erstellt worden.");
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "Version 1.0");
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "GitHub: https://github.com/HiorCraft/Essental_SMP_server.");
            return true;
        } else {
            sender.sendMessage(ChatColor.RED + "Du hast keine Rechte, um diesen Befehl auszuführen.");
        }
        return true;
    }
}

