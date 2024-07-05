package org.dreaght.stablix.ui.table.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

@Getter
@AllArgsConstructor
public abstract class TableItem implements ItemStackHolder {
    private final ItemStack itemStack;
}
