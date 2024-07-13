package org.dreaght.stablix.ui.table.item.block;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.business.table.TableBlockType;

class BoilerItem extends TableBlockItem {
    public BoilerItem(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    TableBlockType getTableBlockType() {
        return TableBlockType.BOILER;
    }
}
