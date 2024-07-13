package org.dreaght.stablix.business.listener;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.dreaght.stablix.ui.table.menu.TableMenu;

public class StablixMenuListener implements MenuListener {
    @Override
    public void onItemClickEvent(InventoryClickEvent event) {
        if (!(event.getClickedInventory().getHolder() instanceof TableMenu)) return;
    }
}
