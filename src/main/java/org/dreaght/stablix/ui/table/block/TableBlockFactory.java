package org.dreaght.stablix.ui.table.block;

import org.bukkit.Location;

import java.util.Optional;

public class TableBlockFactory {

    private static final TableBlockFactoryStrategy tableBlockFactoryStrategy = new TableBlockFactoryStrategyImpl();

    public static Optional<TableBlockCreator> getTableBlockCreator(String blockName, Location location) {
        return tableBlockFactoryStrategy.getTableBlockCreator(blockName, location);
    }
}
