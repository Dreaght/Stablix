package org.dreaght.stablix.ui.table.block;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.dreaght.stablix.business.table.TableBlockType;
import org.dreaght.stablix.event.StablixEvent;
import org.dreaght.stablix.event.table.TablePlaceEvent;
import org.dreaght.stablix.ui.table.BoilerTable;
import org.dreaght.stablix.ui.table.FurnaceTable;

public record TableBlockFactoryImpl(TableBlockType blockType, Location location) implements TableBlockCreator {

    @Override
    public TableHandler createBlock() {
        return switch (blockType) {
            case FURNACE -> new FurnaceBlock(location, new FurnaceTable());
            case BOILER -> new BoilerBlock(location, new BoilerTable());
        };
    }

    @Override
    public StablixEvent callEvent(Object... args) {
        TablePlaceEvent tablePlaceEvent = new TablePlaceEvent(args);
        Bukkit.getPluginManager().callEvent(tablePlaceEvent);
        return tablePlaceEvent;
    }
}
