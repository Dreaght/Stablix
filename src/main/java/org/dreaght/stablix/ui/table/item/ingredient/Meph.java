package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;

class Meph extends TableIngredientItem {
    public Meph(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    Ingredient getIngredientType() {
        return Ingredient.MEPH;
    }
}
