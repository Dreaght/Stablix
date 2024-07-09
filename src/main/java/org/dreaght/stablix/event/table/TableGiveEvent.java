package org.dreaght.stablix.event.table;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.event.ItemGiveEvent;
import org.dreaght.stablix.event.StablixEvent;

public class TableGiveEvent extends StablixEvent implements ItemGiveEvent {
    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }
}
