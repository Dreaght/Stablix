package org.dreaght.stablix.business.table;

import org.bukkit.entity.Player;
import org.dreaght.stablix.ui.table.menu.TableMenu;

interface MenuHolder {
    void openMenu(Player player);

    TableMenu getMenu();
}
