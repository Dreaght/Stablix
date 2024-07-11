package org.dreaght.stablix.business.table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Recipe;
import org.dreaght.stablix.ui.table.menu.TableMenu;

@Getter
@AllArgsConstructor
public class StablixTable implements Table {
    private final TableMenu menu;
    private final Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void openMenu(Player player) {
        player.openInventory(menu.getInventory());
    }

    @Override
    public TableMenu getMenu() {
        return menu;
    }

    @Override
    public void handleRecipe(Recipe recipe) {

    }
}
