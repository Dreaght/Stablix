package org.dreaght.stablix.ui.table.menu;

import org.bukkit.inventory.InventoryHolder;

public abstract class TableMenu implements InventoryHolder {
    protected final int rows;
    protected final String title;

    protected TableMenu(int rows, String title) {
        this.rows = Math.max((Math.min(rows, 6)), 1);
        this.title = title;
    }
}
