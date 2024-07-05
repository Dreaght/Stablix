package ru.legeu.stablix.table;

import org.bukkit.Location;
import org.bukkit.event.inventory.InventoryOpenEvent;
import ru.legeu.stablix.table.recipe.TableRecipe;

public class Boiler extends Table {
    Boiler(Location location) {
        super(location);
    }

    @Override
    public void openMenu(InventoryOpenEvent event) {

    }

    @Override
    public void recipeHandle(TableRecipe recipe) {

    }

}