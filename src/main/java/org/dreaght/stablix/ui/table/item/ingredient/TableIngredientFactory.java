package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.Bukkit;
import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.event.StablixEvent;
import org.dreaght.stablix.event.ingredient.IngredientCreateEvent;
import org.dreaght.stablix.ui.table.item.TableItem;
import org.dreaght.stablix.ui.table.item.TableItemCreator;

public record TableIngredientFactory(Ingredient ingredient) implements TableItemCreator {

    @Override
    public TableItem createItem() {
        return switch (ingredient) {
            case FUEL -> new Fuel(null);
            case SULFUR -> new Sulfur(null);
            case SALT -> new Salt(null);
            case HERB -> new Herb(null);
            case MEPH -> new Meph(null);
        };
    }

    @Override
    public StablixEvent callEvent(Object... args) {
        IngredientCreateEvent ingredientCreateEvent = new IngredientCreateEvent(args);
        Bukkit.getPluginManager().callEvent(ingredientCreateEvent);
        return ingredientCreateEvent;
    }
}
