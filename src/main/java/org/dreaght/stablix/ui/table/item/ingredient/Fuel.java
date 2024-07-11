package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;

class Fuel extends TableIngredientItem {
    public Fuel(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    Ingredient getIngredientType() {
        return Ingredient.FUEL;
    }
}
