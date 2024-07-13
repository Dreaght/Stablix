package org.dreaght.stablix.ui.table.block;

import org.bukkit.Location;

import java.util.Optional;

class TableBlockFactoryStrategyImpl implements TableBlockFactoryStrategy {

    @Override
    public Optional<TableBlockCreator> getTableBlockCreator(String blockName, Location location) {
        return Optional.empty();
    }
}
