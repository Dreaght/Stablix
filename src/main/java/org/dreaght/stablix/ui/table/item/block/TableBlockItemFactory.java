package org.dreaght.stablix.ui.table.item.block;

import org.bukkit.Bukkit;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.event.StablixEvent;
import org.dreaght.stablix.event.table.TableItemCreateEvent;
import org.dreaght.stablix.ui.table.item.TableItem;
import org.dreaght.stablix.ui.table.item.TableItemCreator;

public record TableBlockItemFactory(TableBlockType blockType) implements TableItemCreator {

    @Override
    public TableItem createItem() {
        return switch (blockType) {
            case FURNACE -> new FurnaceItem(null);
            case BOILER -> new BoilerItem(null);
        };
    }

    @Override
    public StablixEvent callEvent(Object... args) {
        TableItemCreateEvent tableItemCreateEvent = new TableItemCreateEvent(args);
        Bukkit.getPluginManager().callEvent(tableItemCreateEvent);
        return tableItemCreateEvent;
    }
}
