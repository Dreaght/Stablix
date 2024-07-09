package org.dreaght.stablix.event.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.event.ItemCreationEvent;
import org.dreaght.stablix.event.StablixEvent;

public class IngredientCreateEvent extends StablixEvent implements IngredientEvent, ItemCreationEvent {

    public IngredientCreateEvent(Object[] args) {
        super(args);
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }

    @Override
    public ItemCreationType getCreationType() {
        return null;
    }

    @Override
    public Ingredient getType() {
        return null;
    }
}
