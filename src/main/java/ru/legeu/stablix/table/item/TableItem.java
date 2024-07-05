package ru.legeu.stablix.table.item;

import lombok.Getter;
import org.bukkit.inventory.ItemStack;

@Getter
public abstract class TableItem {
    protected final ItemStack itemStack;

    protected TableItem(ItemStack itemStack) {
        this.itemStack = itemStack;
    }
}
