package org.dreaght.stablix.table;

import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;

public interface MenuHolder extends InventoryHolder {
    void openMenu(Player player);
}
