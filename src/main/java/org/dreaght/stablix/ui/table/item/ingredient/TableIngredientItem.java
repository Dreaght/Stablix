package org.dreaght.stablix.ui.table.item.ingredient;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.Ingredient;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.ui.table.item.TableItem;

abstract class TableIngredientItem extends TableItem {
    public TableIngredientItem(ItemStack itemStack) {
        super(itemStack);
    }

    abstract Ingredient getIngredientType();
}
