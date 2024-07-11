package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;

class Salt extends TableIngredientItem {
    public Salt(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    Ingredient getIngredientType() {
        return Ingredient.SALT;
    }
}
