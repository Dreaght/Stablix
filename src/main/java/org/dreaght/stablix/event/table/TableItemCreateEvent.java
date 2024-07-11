package org.dreaght.stablix.event.table;

import org.bukkit.inventory.ItemStack;
import org.dreaght.stablix.event.ItemCreationEvent;
import org.dreaght.stablix.event.StablixEvent;

public class TableItemCreateEvent extends StablixEvent implements TableEvent, ItemCreationEvent {
    public TableItemCreateEvent(Object[] args) {
        super(args);
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }

    @Override
    public ItemCreationType getCreationType() {
        return null;
    }
}
