package org.dreaght.stablix.ui.table.menu;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class FurnaceMenu extends TableMenu {
    public FurnaceMenu(int rows, String title) {
        super(rows, title);
    }

    @Override
    public Inventory getInventory() {
        return Bukkit.createInventory(this, rows * 9, title);
    }
}
