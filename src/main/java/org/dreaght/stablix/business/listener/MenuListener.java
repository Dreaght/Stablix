package org.dreaght.stablix.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface MenuListener extends Listener {
    void onItemClickEvent(InventoryClickEvent event);
}
