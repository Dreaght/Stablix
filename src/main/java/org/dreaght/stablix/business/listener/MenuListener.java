package org.dreaght.stablix.business.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

interface MenuListener extends Listener {
    void onItemClickEvent(InventoryClickEvent event);
}
