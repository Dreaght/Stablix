package org.dreaght.stablix.ui.table.block;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Table;

public interface TableHandler {
    Table getTable();

    Location getLocation();

    ItemStack getItemStack();
}
