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

    private final Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void openMenu(Player player) {

    }

    @Override
    public TableMenu getMenu() {
        return null;
    }

    @Override
    public void handleRecipe(Recipe recipe) {

    }
}
