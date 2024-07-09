package org.dreaght.stablix.event.ingredient;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.event.ItemGiveEvent;
import org.dreaght.stablix.event.StablixEvent;

public class IngredientGiveEvent extends StablixEvent implements ItemGiveEvent {
    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }
}
