package org.dreaght.stablix.ui.table.block;

import org.bukkit.Location;

import java.util.Optional;

interface TableBlockFactoryStrategy {
    Optional<TableBlockCreator> getTableBlockCreator(String blockName, Location location);
}
