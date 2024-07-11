package org.dreaght.stablix.business.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.dreaght.stablix.ui.table.item.TableItemCreator;
import org.dreaght.stablix.ui.table.item.TableItemFactory;

import java.util.Objects;
import java.util.Optional;

class StablixItemCommand implements ItemCommand {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 3) {
            if (Objects.equals(args[0], "give")) {
                return handleGiveArgument(sender, args);
            }
        }

        return false;
    }

    private boolean handleGiveArgument(CommandSender commandSender, String[] args) {
        Player player = Bukkit.getPlayer(args[1]);

        if (player != null) {
            Optional<TableItemCreator> tableItemFactory = TableItemFactory.getTableItemCreator(args[2]);
            if (tableItemFactory.isEmpty()) return false;

            player.getInventory().addItem(tableItemFactory.get().createItem().getItemStack());
            return true;
        }

        return false;
    }
}
