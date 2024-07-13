package org.dreaght.stablix.business.table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Recipe;
import org.dreaght.stablix.ui.table.menu.TableMenu;

@Getter
@AllArgsConstructor
public abstract class StablixTable implements Table {
    private final TableMenu menu;

    @Override
    public void openMenu(Player player) {
        player.openInventory(menu.getInventory());
    }

    @Override
    public void handleRecipe(Recipe recipe) {

    }
}
