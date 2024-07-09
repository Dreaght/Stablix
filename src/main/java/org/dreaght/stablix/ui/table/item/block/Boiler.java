package org.dreaght.stablix.ui.table.item.block;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.TableBlockType;

class Boiler extends TableBlockItem {
    public Boiler(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    TableBlockType getTableBlockType() {
        return null;
    }
}
