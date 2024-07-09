package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;

class Herb extends TableIngredientItem {
    public Herb(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    Ingredient getIngredientType() {
        return null;
    }
}
