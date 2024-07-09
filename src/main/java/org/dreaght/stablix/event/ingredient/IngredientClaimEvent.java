package org.dreaght.stablix.event.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.event.StablixEvent;

public class IngredientClaimEvent extends StablixEvent implements IngredientEvent {
    @Override
    public Ingredient getType() {
        return null;
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }
}
